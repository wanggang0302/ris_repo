package com.jfsoft.dictionary.controller;

import com.alibaba.fastjson.JSON;
import com.base.BaseController;
import com.jfsoft.model.BaseTemplate;
import com.jfsoft.model.SysLog;
import com.jfsoft.utils.Constants;
import com.jfsoft.template.service.ITemplateService;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模板管理
 * wanggang
 * 2017-08-10 10:52
 */
@Slf4j
@RestController
@RequestMapping("/template")
public class BaseTemplateController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseTemplateController.class);
    @Autowired
    private ITemplateService templateService;

    @RequestMapping("/getTemplateList")
    public  String getTemplateList(HttpSession session, HttpServletRequest request){

        Map<String, Object> map = new HashMap<String, Object>();
        List<BaseTemplate> templateList = null;
        try {
            templateList = templateService.getTemplateList();
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
            map.put("templateList",templateList);

            SysLog sysLog = new SysLog();
            logger.info("日志输出测试");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }

        return JSON.toJSONString(map);
    }
    @RequestMapping("/getTemplatedetail")
    public String getTemplatedetail(HttpSession session,String id){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BaseTemplate baseTemplate =templateService.getTemplatedetail(id);
            map.put("baseTemplate",baseTemplate);
            map.put("status",Constants.RETURN_STATUS_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status",Constants.RETURN_STATUS_FAILURE);
        }
        return JSON.toJSONString(map);
    }
    @RequestMapping("/insert")
    public  String insert(BaseTemplate baseTemplate,HttpSession session){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map = templateService.insert(baseTemplate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
    @RequestMapping("/delete")
    public  String delete(HttpSession session,String id){
        Map<String,Object> map = new HashMap<String,Object>();

        try {
            map =templateService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return JSON.toJSONString(map);
    }
    @RequestMapping("/update")
    public  String update(BaseTemplate baseTemplate,HttpSession session){
        Map<String,Object> map = new HashMap<String,Object>();

        try {
            map =templateService.update(baseTemplate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }

}
