package com.lucky.demo.biz;

import com.lucky.demo.common.BizAbilityContext;
import com.lucky.demo.common.OrderOperationAbility;

public interface BizOrderOperationAbility<T extends BizAbilityContext> extends OrderOperationAbility<T,Void> {
}
