package com.xpp.domain.activity.adapter;

import com.xpp.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.xpp.domain.activity.model.valobj.SkuVO;

public interface IActivityRepository {

    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(String source, String channel);

    SkuVO querySkuByGoodsId(String goodsId);
}
