package com.lucky.demo.ability;

import com.lucky.demo.common.OrderResult;
import com.lucky.demo.exception.OrderException;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:35
 */
public class CreateOrderAtomicOperation extends AbstractAtomicOrderOperation<Void> {

    @Override
    protected void preCheckParam(AtomicAbilityContext context) throws OrderException {
        //校验参数是否存在
    }

    @Override
    protected OrderResult<Void> repeatCheck() throws OrderException {
        return null;
    }

    @Override
    protected Void internalProcess(AtomicAbilityContext context) {
        return null;
    }
}
