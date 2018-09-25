package com.lth.action;

import com.lth.exception.MsgException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarAction {
    @RequestMapping("/add.do")
    public ModelAndView show1(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("hellow");
        return modelAndView;
    }
    @RequestMapping("/add1.do")
    public ModelAndView show2(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("forward:/add.do");
        return modelAndView;
    }
    @RequestMapping("/add2.do")
    public String show3(HttpServletRequest request) throws MsgException {
        try {
            int i=1/0;
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MsgException("错误信息");
        }

        return "hellow";
    }
}
