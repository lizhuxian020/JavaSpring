package cn.zzstc.web;

import cn.zzstc.listener.WebApplicationContextUtils;
import cn.zzstc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext = this.getServletContext();
//        ApplicationContext appContext = (ApplicationContext) servletContext.getAttribute("app");
        ApplicationContext appContext = WebApplicationContextUtils.getApplicationContext(servletContext);
        UserService userService = appContext.getBean(UserService.class);
        userService.save();
    }
}
