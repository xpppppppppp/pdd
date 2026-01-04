package com.xpp.domain.activity.service.trial.thread;

import com.xpp.domain.activity.adapter.IActivityRepository;
import com.xpp.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.util.concurrent.Callable;

public class QueryGroupByActivityDiscountVOThreadTask implements Callable<GroupBuyActivityDiscountVO> {
    private String source;

    private String channel;

    private IActivityRepository activityRepository;

    public QueryGroupByActivityDiscountVOThreadTask(String source, String channel, IActivityRepository activityRepository) {
        this.source = source;
        this.channel = channel;
        this.activityRepository = activityRepository;
    }

    @Override
    public GroupBuyActivityDiscountVO call() throws Exception {
        return activityRepository.queryGroupBuyActivityDiscountVO(source, channel);
    }
}
