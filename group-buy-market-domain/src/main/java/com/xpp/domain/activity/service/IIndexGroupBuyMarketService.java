package com.xpp.domain.activity.service;

import com.xpp.domain.activity.model.entity.MarketProductEntity;
import com.xpp.domain.activity.model.entity.TrailBalanceEntity;

public interface IIndexGroupBuyMarketService {
    TrailBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception;
}
