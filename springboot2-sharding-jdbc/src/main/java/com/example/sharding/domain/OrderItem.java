package com.example.sharding.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_order_item")
public class OrderItem {

    private long itemId;

    private String orderNo;

    private String itemName;

    private BigDecimal price;

}
