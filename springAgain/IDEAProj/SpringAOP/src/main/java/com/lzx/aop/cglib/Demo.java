package com.lzx.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        Target target = new Target();
        Aspect aspect = new Aspect();
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if (method.getName().equals("insert")) {
                    String preInsert = aspect.preInsert((String) objects[0]);
                    target.insert(preInsert);

                }
                return null;
            }
        });
        Target target1 = (Target) enhancer.create();
        target1.insert("哈哈");
    }

}
