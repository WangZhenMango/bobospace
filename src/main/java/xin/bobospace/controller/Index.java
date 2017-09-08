package xin.bobospace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
created by wangzhen 2017/9/8
*/
@Controller
@RequestMapping("/")
public class Index {

    @RequestMapping(method = RequestMethod.GET)
    private String index(){
        return "index";
    }
}
