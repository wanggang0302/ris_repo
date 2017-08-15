package com.jfsoft.login.controller;

import com.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * 登录
 * wanggang
 * 2017-08-03 14:08
 */
@Controller
@RequestMapping(value = "/template")
public class LoginController extends BaseController {

    /**
     * 到登录页面
     * @param map
     * @param upMechName
     * @param upType
     * @param upStatus
     * @param upDateBegin
     * @param upDateEnd
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String logs(Map<String,String> map, String upMechName, String upType, String upStatus,
                       String upDateBegin, String upDateEnd) {

        try {
            System.out.println("===================");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "login";
    }

}
