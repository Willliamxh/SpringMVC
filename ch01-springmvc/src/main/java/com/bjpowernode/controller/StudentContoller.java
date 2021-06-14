package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Willam_xh
 * @create 2021-06-11 16:38
 */

@Controller
public class StudentContoller {

    @RequestMapping(value = "/add.do")
    public ModelAndView addStudent(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","学生注册成功");
        mv.setViewName("show");
        return mv;
    }
}
