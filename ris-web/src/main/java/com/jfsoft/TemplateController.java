package com.jfsoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by JFYT002 on 2017/8/3.
 */
@Controller
public class TemplateController {
    @RequestMapping("/helloHtml")
    public static String helloHtml(Map<String, Object> map){

        map.put("hello","from TemplateController.helloHtml");
        return "helloHtml";
    }
}
