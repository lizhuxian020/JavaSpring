package com.lzx.interceptor;

import com.lzx.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            String contextPath = request.getContextPath();
            System.out.println(contextPath);
            response.sendRedirect(contextPath +"/login.jsp");
            return false;
        }
        return true;
    }
}
