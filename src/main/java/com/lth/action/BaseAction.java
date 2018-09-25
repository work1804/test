package com.lth.action;

import com.lth.exception.ZhifuException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseAction {


    @ResponseBody
    @ExceptionHandler
    public Map<String,Object> myexp(HttpServletRequest request, Exception ex){
        Map<String,Object> map = new HashMap<String, Object>();
        if(ex instanceof ZhifuException){
            ZhifuException zhifuException = (ZhifuException) ex;
            map.put("code",zhifuException.getCode());
            map.put("error",zhifuException.getMsg());
        }else{
            map.put("code",-1);
            map.put("error","系统繁忙");
        }
        return map;
    }


}
