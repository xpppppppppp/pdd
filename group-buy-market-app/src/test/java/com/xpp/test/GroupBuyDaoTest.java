package com.xpp.test;

import com.alibaba.fastjson2.JSON;

import com.xpp.Application;
import com.xpp.infrastructure.dao.IGroupBuyActivityDao;
import com.xpp.infrastructure.dao.IGroupBuyDiscountDao;
import com.xpp.infrastructure.dao.po.GroupBuyActivity;
import com.xpp.infrastructure.dao.po.GroupBuyDiscount;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class GroupBuyDaoTest {
    @Resource
    private IGroupBuyActivityDao groupBuyActivityDao;

    @Resource
    private IGroupBuyDiscountDao groupBuyDiscountDao;

    @Test
    public void testGetGroupBuyActivityByActivityId() {
        List<GroupBuyActivity> groupBuyList = groupBuyActivityDao.queryGroupBuyActivityList();
        log.info(JSON.toJSONString(groupBuyList));
    }

    @Test
    public void testGetGroupBuyDiscountByActivityId() {
        List<GroupBuyDiscount> discountList = groupBuyDiscountDao.queryGroupBuyDiscountList();
        log.info(JSON.toJSONString(discountList));
    }

}
