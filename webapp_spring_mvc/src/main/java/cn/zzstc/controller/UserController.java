package cn.zzstc.controller;

import cn.zzstc.domain.User;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick5")
    @ResponseBody
    private User func5() {
        User user = new User();
        user.setUsername("l123isi");
        user.setAge(1233);
        return user;
    }

//    @RequestMapping("/quick5")
//    @ResponseBody
//    private String func5() throws JsonProcessingException {
//        User user = new User();
//        user.setUsername("lisi");
//        user.setAge(123);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(user);
//        return json;
//    }

    @RequestMapping("/quick4")
    @ResponseBody
    private String func4() {
        return "asdasdasd";
    }

    @RequestMapping("/quick3")
    private void func3(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("username", "=.=");
//        return "success";
        response.getWriter().println("hahahha");
    }

    @RequestMapping("/quick2")
    private String func2(HttpServletRequest request) {
        request.setAttribute("username", "=.=");
        return "success";
    }

    @RequestMapping(value = "/quick", method = RequestMethod.GET)
    private String func1() {
        System.out.println("asd");
        return "redirect:/jsp/success.jsp";
    }

}
