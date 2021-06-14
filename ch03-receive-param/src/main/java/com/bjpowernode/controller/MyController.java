package com.bjpowernode.controller;

import com.bjpowernode.controller.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

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
     * 逐个接收请求参数
     * 要求： 请求中的参数名和控制器方法的形参名一样。 按名称对象接收请求参数
     *
     * 参数接收：
     *  1. 框架使用request对象，接收参数
     *     String name = request.getParameter("name");
     *     String age = request.getParameter("age");
     *  2. 在中央调度器的内部调用 doProperParam方法时， 按名称对象传递参数
     *      doPropertyParam(name, Integer.valueOf(age) )
     *     框架可以实现请求参数 String 到int ， long ，float ，double等类型的转换。
     */
    @RequestMapping(value ={ "/receive-property.do","/add.do"})
    public ModelAndView doPropertyParam(String name,Integer age) {  //doGet()
        System.out.println("执行了MyController的doPropertyParam方法name=" + name+",age="+age);
//        /*这个得是在接受请求之前才能有效 这里无效*/
//        request.setCharacterEncoding("utf-8");

        /*调用service对象,处理请求，返回数据*/
        ModelAndView mv=new ModelAndView();
        //添加数据
        /*这里出现了一个小问题 就是index里面 记得写name*/
        mv.addObject("myname", name);
        mv.addObject("myage", age);

        //重定向到对应的表单那边
        mv.setViewName("show");

        //返回结果
        return mv;
    }
    /**
     * 逐个接收请求参数， 请求中参数名和形参名不一样
     * @RequestParam : 解决名称不一样的问题
     *       属性： value 请求中的参数名称
     *              required : boolean类型的，默认是true
     *                    true：请求中必须有此参数，没有报错。
     *                    false：请求中可以没有此参数。
     *       位置： 在形参定义的前面
     */
    @RequestMapping(value ={ "/receive-param.do","/add.do"})
    public ModelAndView doReceiveParam(@RequestParam(value = "rname",required = false) String name,
                                       @RequestParam(value = "rage",required = false) Integer age) {  //doGet()
        System.out.println("执行了MyController的doReceiveParam方法name=" + name+",age="+age);
//        /*这个得是在接受请求之前才能有效 这里无效*/
//        request.setCharacterEncoding("utf-8");

        /*调用service对象,处理请求，返回数据*/
        ModelAndView mv=new ModelAndView();
        //添加数据
        /*这里出现了一个小问题 就是index里面 记得写name*/
        mv.addObject("myname", name);
        mv.addObject("myage", age);

        //重定向到对应的表单那边
        mv.setViewName("show");

        //返回结果
        return mv;
    }

    /**
     * 使用对象接收请求中的参数
     * 要求： 参数名和java对象的属性名一样。
     *       java类需要有一个无参数构造方法， 属性有set方法
     *
     * 框架的处理：
     *  1. 调用Student的无参数构造方法，创建对象
     *  2. 调用对象set方法， 同名的参数，调用对应的set方法。
     *     参数是name ，调用setName(参数值)
     */
    @RequestMapping("/receive-object.do")
    public ModelAndView doReceiveObject(Student student){
        System.out.println("MyController的方法doReceiveObject="+student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",student.getName());
        mv.addObject("myage",student.getAge());
        mv.setViewName("show");
        return mv;

    }


}
