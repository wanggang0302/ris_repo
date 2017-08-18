package com.jfsoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by matq on 2017/8/3.
 */
@Controller
public class TemplateController {

    @RequestMapping("/helloHtml")
    public static String helloHtml(Map<String, Object> map){

        map.put("date", new Date());

        map.put("hello","from TemplateController.helloHtml");
        return "helloHtml";
    }

}
