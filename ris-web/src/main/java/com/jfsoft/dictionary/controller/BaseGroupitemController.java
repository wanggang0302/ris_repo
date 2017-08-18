//package com.jfsoft.dictionary.controller;
//
//import com.alibaba.fastjson.JSON;
//import com.jfsoft.groupitem.service.IGroupitemService;
//import com.jfsoft.model.BaseGroupitem;
//import com.jfsoft.model.SysLog;
//import com.jfsoft.utils.Constants;
//import groovy.util.logging.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * 收费项目Controller
// * Created by matq on 2017/8/15.
// */
//@Slf4j
//@RestController
//@RequestMapping("/groupitem")
//public class BaseGroupitemController {
//
//    private static final Logger logger = LoggerFactory.getLogger(BaseGroupitemController.class);
//
//    @Autowired
//    private IGroupitemService groupitemService;
//
//    @RequestMapping("/getGroupitemList")
//     public String getGroupitemList(HttpSession session, HttpServletRequest request){
//
//        Map<String, String> map = new HashMap<String, String>();
//        List<BaseGroupitem> groupList = null;
//        try {
//            groupList = groupitemService.getGroupitemList();
//            map.put("status", Constants.RETURN_STATUS_SUCCESS);
//            map.put("groupList",groupList);
//
//            SysLog sysLog = new SysLog();
//            logger.info("日志输出测试");
//        } catch (Exception e) {
//            e.printStackTrace();
//            map.put("status",Constants.RETURN_STATUS_FAILURE);
//        }
//
//        return JSON.toJSONString(map);
//    }
//    @RequestMapping("/insert")
//    public String insert(HttpSession session, HttpServletRequest request,BaseGroupitem baseGroupitem){
//        Map<String, String> map = new HashMap<String, String>();
//        try {
//            map=groupitemService.insert(baseGroupitem);
//            map.put("status",Constants.RETURN_STATUS_SUCCESS);
//        } catch (Exception e) {
//            e.printStackTrace();
//            map.put("status",Constants.RETURN_STATUS_FAILURE);
//        }
//        return JSON.toJSONString(map);
//    }
//    @RequestMapping(value="/delete/{id}")
//    public String delete(HttpSession session, HttpServletRequest request,@PathVariable String id){
//        Map<String, String> map = new HashMap<String, String>();
//        try {
//            map =groupitemService.delete(id);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//        return JSON.toJSONString(map);
//    }
//    @RequestMapping("/update")
//    public String update(HttpSession session, HttpServletRequest request,BaseGroupitem baseGroupitem){
//        Map<String, String> map = new HashMap<String, String>();
//        try {
//            map=groupitemService.update(baseGroupitem);
//            map.put("status",Constants.RETURN_STATUS_SUCCESS);
//        } catch (Exception e) {
//            e.printStackTrace();
//            map.put("status",Constants.RETURN_STATUS_FAILURE);
//        }
//        return JSON.toJSONString(map);
//    }
//}
