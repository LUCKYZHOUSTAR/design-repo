package com.lucky.demo.service;

import com.lucky.demo.bo.OrderRequestBo;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 15:10
 */
public interface  OrderService {

    void createOrder(OrderRequestBo orderRequestBo);

    void payOrder(OrderRequestBo orderRequestBo);

    void cancelOrder(OrderRequestBo orderRequestBo);
}
