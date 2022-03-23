package cn.zzstc.controller;

import cn.zzstc.domain.User;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import cn.zzstc.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick13")
    @ResponseBody
    private void func13(String username, MultipartFile file) {
        System.out.println(username);
        System.out.println(file);
    }

    @RequestMapping("/quick12")
    @ResponseBody
    private void func12(@RequestHeader(value = "User-Agent") String userAgent, @CookieValue("JSESSIONID") String cookie) {
        System.out.println(userAgent);
        System.out.println(cookie);
    }

    @RequestMapping("/quick11/{date}")
    @ResponseBody
    private void func11(@PathVariable("date") Date date) {
        System.out.println(date);
    }

    @RequestMapping("/quick10/{username}")
    @ResponseBody
    private void func10(@PathVariable("username") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick9")
    @ResponseBody
    private void func9(@RequestParam(value = "name", required = false, defaultValue = "=.=") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick8")
    @ResponseBody
    private void func8(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping("/quick7")
    @ResponseBody
    private void func7(VO vo) {
        System.out.println(vo.getUserList());
    }

    @RequestMapping("/quick6")
    @ResponseBody
    private void func6(User user) {
        System.out.println(user);
    }

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

//    @RequestMapping(value = "/quick2")
//    private ModelAndView func2() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("success");
//        modelAndView.addObject("username", "haha");
//        return modelAndView;
//    }

    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    private String func1() {
        System.out.println("asd");
        return "success";
    }

}
