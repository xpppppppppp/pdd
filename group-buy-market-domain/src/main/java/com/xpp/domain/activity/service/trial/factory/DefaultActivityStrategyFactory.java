package com.xpp.domain.activity.service.trial.factory;

import com.xpp.domain.activity.model.entity.MarketProductEntity;
import com.xpp.domain.activity.model.entity.TrailBalanceEntity;
import com.xpp.domain.activity.service.trial.node.RootNode;
import com.xpp.types.design.framework.tree.StrategyHandler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;

public class DefaultActivityStrategyFactory {

    private final RootNode rootNode;
    public DefaultActivityStrategyFactory(RootNode rootNode) {
        this.rootNode = rootNode;
    }

    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrailBalanceEntity> strategyHandler(){
        return rootNode;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DynamicContext{


    }
}
