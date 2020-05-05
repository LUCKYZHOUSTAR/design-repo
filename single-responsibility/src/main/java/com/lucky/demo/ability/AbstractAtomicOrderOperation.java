package com.lucky.demo.ability;

import com.lucky.demo.common.OrderOperationAbility;
import com.lucky.demo.common.OrderResult;
import com.lucky.demo.exception.OrderException;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:34
 */
public abstract class AbstractAtomicOrderOperation<R> implements OrderOperationAbility<AtomicAbilityContext, R> {

    @Override
    public R process(AtomicAbilityContext context) throws OrderException {

        preCheckParam(context);

        OrderResult<R> repeatCheckResult = repeatCheck();

        if (repeatCheckResult != null && repeatCheckResult.isSuccess()) {
            return repeatCheckResult.getData();
        }

        return internalProcess(context);
    }

    /**
     * 是否成功
     */
    private boolean success = true;

    protected abstract void preCheckParam(AtomicAbilityContext context) throws OrderException;

    protected abstract OrderResult<R> repeatCheck() throws OrderException;

    protected abstract R internalProcess(AtomicAbilityContext context);
}
