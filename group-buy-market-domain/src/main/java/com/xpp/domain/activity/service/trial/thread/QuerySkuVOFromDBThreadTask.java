package com.xpp.domain.activity.service.trial.thread;

import com.xpp.domain.activity.adapter.IActivityRepository;
import com.xpp.domain.activity.model.valobj.SkuVO;

import java.util.concurrent.Callable;

public class QuerySkuVOFromDBThreadTask implements Callable<SkuVO> {
    private final String goodsId;

    private final IActivityRepository activityRepository;

    public QuerySkuVOFromDBThreadTask(String goodsId, IActivityRepository activityRepository1) {
        this.goodsId = goodsId;
        this.activityRepository = activityRepository1;
    }

    @Override
    public SkuVO call() throws Exception {
        return activityRepository.querySkuByGoodsId(goodsId);

    }
}
