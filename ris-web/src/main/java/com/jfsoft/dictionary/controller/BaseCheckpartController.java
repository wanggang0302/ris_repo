package com.jfsoft.dictionary.controller;

import com.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 检查部位Controller
 * wanggang
 * 2017-08-14 16:24
 */
@Controller
@RequestMapping("/checkpart")
public class BaseCheckpartController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 获得列表
     * @return
     */
    @RequestMapping
    public String getList() {

        return "/checkpart/list";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping(value = "/toAdd")
    public String toAdd() {

        logger.debug("To add page!");

        return "add";
    }

    public String insert() {

        return "/checkpart/get";
    }

}
