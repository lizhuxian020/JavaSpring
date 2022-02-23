package cn.zzstc.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("服务器启动，servletContext初始化");
        ServletContext servletContext = servletContextEvent.getServletContext();

        String springContextFileName = servletContext.getInitParameter("SpringContextFileName");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(springContextFileName);
        servletContext.setAttribute("app", applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
