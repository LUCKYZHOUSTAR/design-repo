package com.lucky.demo.ability;

import com.lucky.demo.common.AbilityContext;
import com.lucky.demo.common.OrderResult;
import com.lucky.demo.exception.OrderException;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:53
 */
public class UpdateOrderAtomicOperation extends AbstractAtomicOrderOperation {
    @Override
    protected void preCheckParam(AtomicAbilityContext context) throws OrderException {

    }

    @Override
    protected OrderResult repeatCheck() throws OrderException {
        return null;
    }

    @Override
    protected Object internalProcess(AtomicAbilityContext context) {
        return null;
    }

    @Override
    public Object process(AbilityContext context) throws OrderException {
        return null;
    }
}
