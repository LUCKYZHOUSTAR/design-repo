package com.lucky.demo.common;

import com.lucky.demo.exception.OrderException;
import org.springframework.core.Ordered;

/**
 * @description:
 * @author: lucky
 * @created: 2020/05/05 14:30
 */
public interface OrderOperationAbility<T extends AbilityContext, R> {

    R process(T context) throws OrderException;
}
