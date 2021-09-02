package com.example.sharding.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_order")
public class Order {

    private long orderId;

    private String orderNo;

    private String createName;

    private BigDecimal price;

}
