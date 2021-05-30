package com.sparta.clonecoding.controller;

import com.sparta.clonecoding.dto.SignupRequestDto;
import com.sparta.clonecoding.models.User;
import com.sparta.clonecoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 회원 로그인 페이지
    @GetMapping("/user/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user/login/error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    // 회원 가입 페이지
    @GetMapping("/user/signup")
    public String signup() {
        return "signup";
    }

    // 회원 가입 요청 처리
    @PostMapping("/user/signup")
    public String registerUser(SignupRequestDto requestDto) {
        userService.registerUser(requestDto);
        return "redirect:/";
    }

//    /*로그인 검사*/
//    @RequestMapping(value = "/user/login", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
//    public String LoginCheck(HttpSession session, Model model, User user) throws Exception {
//
//        try {
//
//            User login = userService.registerUser(user);
//
//            //로그인 성공
//            model.addAttribute("msg","로그인 성공");
//            model.addAttribute("url","/");
//
//        } catch (NullPointerException e) {
//
//            //로그인 실패
//            model.addAttribute("msg","로그인 실패");
//            model.addAttribute("url","/");
//
//        }
//
//        return "redirect";
//
//    }
}