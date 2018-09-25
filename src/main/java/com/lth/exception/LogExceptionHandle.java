package com.lth.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogExceptionHandle implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView=new ModelAndView();
        MsgException msgException=null;
        //获取系统的异常信息
        if(ex instanceof MsgException){
            msgException=(MsgException)ex;
        }else{
            modelAndView= new ModelAndView("系统繁忙");
        }
        modelAndView.addObject("msg",msgException.getMsg());
        modelAndView.setViewName("Exception1");
        return modelAndView;
    }
}
