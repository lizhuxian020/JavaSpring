package com.lzm.demo;

import com.lzm.advice.UserAdvice;
import com.lzm.dao.UserDao;
import com.lzm.dao.impl.UserDaoImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao bean = classPathXmlApplicationContext.getBean(UserDao.class);
        bean.save();
//        final UserDaoImpl dao = new UserDaoImpl();
//        final UserAdvice advice = new UserAdvice();
//
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserDaoImpl.class);
////        enhancer.setCallback(new MethodInterceptor() {
////            @Override
////            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
////                advice.save();;
////                Object invoke = method.invoke(dao, objects);
////                return invoke;
////            }
////        });
//        enhancer.setCallback(new MethodInterceptor() {
//            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                advice.save();
//                Object invoke = method.invoke(dao, objects);
//                return invoke;
//            }
//        });
//
//        UserDaoImpl object = (UserDaoImpl)enhancer.create();
//        object.save();

//        jdkProxy();
    }

//    public static void jdkProxy() {
//        final UserDaoImpl dao = new UserDaoImpl();
//        final UserAdvice advice = new UserAdvice();
//
//        UserDao proxyInstance = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                advice.save();
//                method.invoke(dao, args);
//                return null;
//            }
//        });
//
//        proxyInstance.save();
//    }
}
