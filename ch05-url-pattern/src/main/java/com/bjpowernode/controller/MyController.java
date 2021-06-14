package com.bjpowernode.controller;

import com.bjpowernode.controller.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-06-11 15:04
 */

/*
* @Controller:创建控制器（处理器）对象
*           控制器：页脚后端控制器，自定义类的处理请求的。
*          位置：在类的上面，表示创建此类的对象，对象放在springmvc容器中。
* * @RequestMapping
 *   属性 value ：表示所有请求地址的公共前缀， 相当于是模块名称。
 *   位置 在类的上面
* */
@Controller
//@RequestMapping("/student")//属性 value ：表示所有请求地址的公共前缀， 相当于是模块名称。
//这个前缀是很有意义 理解为模块的对应的 Controller操作
public class MyController {

    /**
     * 控制器方法返回String，表示逻辑名称。 需要项目中配置视图解析器
     */
    @RequestMapping(value ="/some")
    public ModelAndView doReturnStringView1(String name, Integer age) {
        System.out.println("执行了MyController的doReturnStringView1方法name=" + name+",age="+age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");
        return mv;
    }



}
