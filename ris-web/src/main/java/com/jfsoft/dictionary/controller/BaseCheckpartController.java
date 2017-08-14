package com.jfsoft.dictionary.controller;

import com.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 检查部位Controller
 * wanggang
 * 2017-08-14 16:24
 */
@Controller
@RequestMapping("/checkparts")
public class BaseCheckpartController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 获得列表
     * @return
     */
    @RequestMapping
    public String getList() {

        logger.debug("Get checkpart list of page!");

        return "/checkpart/list";
    }

    /**
     * 查看详情
     * @param checkpartId
     * @return
     */
    @RequestMapping("/{checkpartId}")
    public String getUserList(@PathVariable int checkpartId) {

        logger.info("Get checkpart detail by id:{}.", checkpartId);

        return "/checkpart/checkpartDetail";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping(value = "/toAdd")
    public String toAdd() {

        logger.debug("To add page!");

        return "/checkpart/add";
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String insert() {

        logger.debug("Add one checkpart!");

        return "/checkparts";
    }

    /**
     * 跳转到修改页面
     * @return
     */
    @RequestMapping(value = "/toEdit/{checkpartId}")
    public String toEdit(@PathVariable int checkpartId) {

        logger.debug("To edit page! id is {}.", checkpartId);

        return "/checkpart/edit";
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public String update() {

        logger.debug("Update checkpart by id:{}.");

        return "/checkparts";
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/{checkpartId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int checkpartId) {

        logger.debug("Delete checkpart by id:{}.", checkpartId);

        return "/checkparts";
    }

}
