package com.jfsoft.dictionary.controller;

import com.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * 模板管理
 * wanggang
 * 2017-08-10 10:52
 */
@Controller
@RequestMapping(value = "/template")
public class BaseTemplateController extends BaseController {

    @RequestMapping("/toAdd")
    public static String helloHtml(Map<String, Object> map){

        return "add";
    }

}
