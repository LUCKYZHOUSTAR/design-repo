package com.lucky.demo.service;

import com.lucky.demo.ability.AtomicAbilityContext;
import com.lucky.demo.ability.CreateOrderAtomicOperation;
import com.lucky.demo.ability.UpdateOrderAtomicOperation;
import com.lucky.demo.biz.BizPayOrderOperation;
import com.lucky.demo.bo.OrderRequestBo;
import com.lucky.demo.common.BizAbilityContext;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 15:11
 */
public class OrderServiceImpl implements OrderService {

    private CreateOrderAtomicOperation createOrderAtomicOperation;

    private BizPayOrderOperation bizPayOrderOperation;

    private UpdateOrderAtomicOperation updateOrderAtomicOperation;

    @Override
    public void createOrder(OrderRequestBo orderRequestBo) {

        AtomicAbilityContext atomicAbilityContext = new AtomicAbilityContext();

        atomicAbilityContext.putTypeParam(orderRequestBo, OrderRequestBo.class);
        createOrderAtomicOperation.process(atomicAbilityContext);

    }

    @Override
    public void payOrder(OrderRequestBo orderRequestBo) {

        BizAbilityContext bizAbilityContext = new BizAbilityContext();
        bizAbilityContext.putTypeParam(orderRequestBo, OrderRequestBo.class);
        bizPayOrderOperation.process(bizAbilityContext);
    }

    @Override
    public void cancelOrder(OrderRequestBo orderRequestBo) {
        AtomicAbilityContext atomicAbilityContext = new AtomicAbilityContext();

        atomicAbilityContext.putTypeParam(orderRequestBo, OrderRequestBo.class);
        updateOrderAtomicOperation.process(atomicAbilityContext);
    }
}
