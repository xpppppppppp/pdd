package com.xpp.domain.activity.service.trial.node;

import com.xpp.domain.activity.model.entity.MarketProductEntity;
import com.xpp.domain.activity.model.entity.TrailBalanceEntity;
import com.xpp.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.xpp.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.xpp.types.design.framework.tree.StrategyHandler;
import com.xpp.types.enums.ResponseCode;
import com.xpp.types.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class RootNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrailBalanceEntity> {
    @Resource
    private SwitchRoot switchRoot;

    @Override
    public TrailBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        if(StringUtils.isBlank(requestParameter.getChannel()) || StringUtils.isBlank(requestParameter.getSource())||
    StringUtils.isBlank(requestParameter.getGoodId())||StringUtils.isBlank(requestParameter.getUserId())){
            throw new AppException(ResponseCode.ILLEGAL_PARAMETER.getCode(), ResponseCode.ILLEGAL_PARAMETER.getInfo());
        }
        return router(requestParameter, dynamicContext);
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrailBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        return switchRoot;
    }
}
