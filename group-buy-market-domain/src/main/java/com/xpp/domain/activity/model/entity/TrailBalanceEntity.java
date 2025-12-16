package com.xpp.domain.activity.model.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrailBalanceEntity {
    private String goodId;
    private String goodName;
    private BigDecimal goodPrice;
    private BigDecimal goodDiscount;
    private Integer goodNum;
    private Date startTime;
    private Date endTime;
    private Boolean is_visible;
}
