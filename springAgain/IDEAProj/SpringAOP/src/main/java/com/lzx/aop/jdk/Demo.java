package com.lzx.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {
        Aspect aspect = new Aspect();
        Target target = new Target();
        TargetInterface targetInterface = (TargetInterface) Proxy.newProxyInstance(
                Target.class.getClassLoader(),
                Target.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName());
                        System.out.println(args);
                        if (method.getName().equals("insert")) {
                            String name = aspect.preInsert((String) args[0]);
                            method.invoke(target, name);

                        }
                        return null;
                    }
                }
        );
        targetInterface.insert("哈啊哈");;
    }
}
