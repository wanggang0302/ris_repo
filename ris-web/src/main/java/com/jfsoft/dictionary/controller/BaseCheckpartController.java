package com.jfsoft.dictionary.controller;

import com.alibaba.fastjson.JSON;
import com.base.BaseController;
import com.jfsoft.checkpart.service.ICheckpartService;
import com.jfsoft.model.BaseCheckpart;
import com.jfsoft.model.BaseTemplate;
import com.jfsoft.model.SysLog;
import com.jfsoft.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检查部位Controller
 * wanggang
 * 2017-08-14 16:24
 */
@Controller
@RequestMapping("/checkparts")
public class BaseCheckpartController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ICheckpartService checkpartService;

    /**
     * 获得列表
     * @return
     */
    @RequestMapping
    public String getCheckpartList() {

        Map<String, Object> map = new HashMap<String, Object>();
        List<BaseCheckpart> baseCheckpartList = null;
        try {
            baseCheckpartList = checkpartService.getCheckpartList();
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
            map.put("baseCheckpartList",baseCheckpartList);

            SysLog sysLog = new SysLog();
            logger.info("日志输出测试");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }

        return JSON.toJSONString(map);
//        logger.debug("Get checkpart list of page!");
//
//        return "/checkpart/list";
    }

    /**
     * 查看详情
     * @param id
     * @return
     */
    @RequestMapping("/checkpartDetail/{id}")
    public String getUserList(@PathVariable String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BaseCheckpart baseCheckpart =checkpartService.checkpartDetail(id);
            map.put("baseCheckpart",baseCheckpart);
            map.put("status", Constants.RETURN_STATUS_SUCCESS);
            logger.info("Get checkpart detail by id:{}.", id);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return JSON.toJSONString(map);


 //       return "/checkpart/checkpartDetail";
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
    @RequestMapping(value="/insert" , method = RequestMethod.POST)
    public String insert(BaseCheckpart baseCheckpart) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map=checkpartService.insert(baseCheckpart);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return JSON.toJSONString(map);
//        logger.debug("Add one checkpart!");
//
//        return "/checkparts";
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
    @RequestMapping(value="/update",method = RequestMethod.PUT)
    public String update(HttpSession session,BaseCheckpart baseCheckpart) {
        Map<String,Object> map =new HashMap<String,Object>();

        try {
            map=checkpartService.update(baseCheckpart);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
//        logger.debug("Update checkpart by id:{}.");
//
//        return "/checkparts";
    }

    /**
     * 删除
     */
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {

        Map<String,Object> map = new HashMap<String,Object>();

        try {
            map=checkpartService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
            return  JSON.toJSONString(map);
//        logger.debug("Delete checkpart by id:{}.", id);
//
//        return "/checkparts";
    }

}
