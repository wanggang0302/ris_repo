package com.jfsoft.perinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matq on 2017/8/15.
 * 人员信息controller
 */

@RestController
public class PerinfoController {
    @RequestMapping("/getPerinfoList")
    public String getPerinfoList(){
        Map<String, Object> map = new HashMap<String, Object>();

        return "";
    }
}
