package com.jfsoft.perinfo.controller;

import com.alibaba.fastjson.JSON;
import com.jfsoft.model.InspectPerinfo;
import com.jfsoft.perinfo.service.IPerinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by matq on 2017/8/15.
 * 人员信息controller
 */

@RestController
@RequestMapping("/perinfo")
public class PerinfoController {

    private static final Logger logger = LoggerFactory.getLogger(PerinfoController.class);
    @Autowired
    private IPerinfoService perinfoService;
    @RequestMapping("/getPerinfoList")
    public String getPerinfoList(){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<InspectPerinfo> perinfoList =perinfoService.getPerinfoList();
            map.put("perinfoList",perinfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
    @RequestMapping("/getPerinfoDetail")
    public String getPerinfoDetail(HttpSession session, String checkno,String statuscode,String company,String timeBegin,String timeEnd){
        Map<String,Object> map = new HashMap<String,Object>();

        try {
            List<InspectPerinfo> perinfoList =perinfoService.getPerinfoDetail(checkno,statuscode,company,timeBegin,timeEnd);
            map.put("perinfoList",perinfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
    @RequestMapping("/insert")
    public String insert(InspectPerinfo inspectPerinfo){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map=perinfoService.insert(inspectPerinfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
}
