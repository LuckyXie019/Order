package com.xcc.orderinquiry.controller;

import com.xcc.orderinquiry.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author： XCC
 * @date： 2020/9/10 19:02 下午
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Value("${order.createUrl}")
    private String CREATE_URL;

    @Value("${order.SelectUrl}")
    private String SELECT_URL;

    @Value("${order.appid}")
    private String APPID;

    @Value("${order.outerid}")
    private String OUTERID;

    /**
     *功能描述: 创建批量查询任务
     * @author XCC
     * @date 2020/9/10
      * @param map 
     * @return java.lang.String
     */
    @RequestMapping(value = "creatOrder")
    public String creatOrder(@RequestParam Map<String,Object> map) {
        map.put("appid",APPID);
        map.put("outerid",OUTERID);
        map.put("isBackTaskName","yes");
        String data = orderService.createQuery(CREATE_URL,map);
        return data;
    }

    /**
     *功能描述: 获取批量查询结果
     * @author XCC
     * @date 2020/9/10
      * @param map 
     * @return java.lang.String
     */
    @RequestMapping(value = "queryOrder")
    public String queryOrder(@RequestParam Map<String,Object> map) {
        map.put("appid",APPID);
        map.put("outerid",OUTERID);
        String data = orderService.queryOrder(SELECT_URL,map);
        return data;
    }


}
