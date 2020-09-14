package com.xcc.orderinquiry.service.impl;

import com.xcc.orderinquiry.service.OrderService;
import com.xcc.orderinquiry.utils.JsonUtil;
import com.xcc.orderinquiry.utils.OkHttpUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author： XCC
 * @date： 2020/9/10 19:10 下午
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String createQuery(String url, Map<String,Object> param){
        try {
            String request = OkHttpUtil.postResponseWithParamsInMap(url,param);
            return request;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String queryOrder(String url, Map<String,Object> param) {
        Map<String,Object> data = null;
        try {
            String request = OkHttpUtil.postResponseWithParamsInMap(url,param);
            return request;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

}
