package com.xpp.infrastructure.dao;

import com.xpp.infrastructure.dao.po.Sku;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkuDao {
    Sku querySkuByGoodsId(String goodsId);
}
