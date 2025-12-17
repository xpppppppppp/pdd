package com.xpp.domain.activity.service.trial;

import com.xpp.types.design.framework.tree.AbstractMultiThreadStrategyRouter;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity> extends AbstractMultiThreadStrategyRouter<MarketProductEntity, DynamicContext, TrialBalanceEntity> {

    @Override
    protected void multiThread(MarketProductEntity requestParameter, DynamicContext dynamicContext) {

    }
}
