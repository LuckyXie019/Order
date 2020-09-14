package com.xcc.orderinquiry.service;

import org.springframework.stereotype.Service;

import java.io.EOFException;
import java.util.Map;

/**
 * @author： XCC
 * @date： 2020/9/10 19:8 下午
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public interface OrderService {

    /**
     * 创建批量查询任务
     */
    String createQuery(String url, Map<String,Object> param);
    /**
     * 获取批量查询结果
     */
    String queryOrder(String url, Map<String,Object> param);


}
