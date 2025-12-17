package com.xpp.domain.activity.service.trial.node;

import com.xpp.domain.activity.model.entity.MarketProductEntity;
import com.xpp.domain.activity.model.entity.TrailBalanceEntity;
import com.xpp.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.xpp.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.xpp.types.design.framework.tree.StrategyHandler;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

public class MarketNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrailBalanceEntity> {
    @Resource
    private ThreadPoolExecutor threadPoolExecutor;

    @Override
    protected void multiThread(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {

    }

    @Override
    protected TrailBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrailBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        return null;
    }
}
