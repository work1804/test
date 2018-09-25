package com.lth.action;

import com.lth.exception.ZhifuException;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@Controller
public class ZhifuAction extends BaseAction {
    @ResponseBody
    @RequestMapping("/ex.do")
    public Map<String,Object> zhfu(HttpServletRequest request) throws ZhifuException {
        Map<String,Object> map=new HashMap<String,Object>();
        String i = request.getParameter("i");
        if(StringUtils.isEmpty(i)){
        throw  new ZhifuException(-2,"还是失败");
        }
        try {
            int i1=1/0;
            System.out.println(i1);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ZhifuException(-1,"支付延迟");
        }
        map.put("code",0);
        map.put("msg","支付成功");
        return map;
    }
}
