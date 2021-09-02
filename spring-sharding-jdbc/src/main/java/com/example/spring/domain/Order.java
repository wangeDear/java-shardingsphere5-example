package com.example.spring.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_order")
public class Order {

    private Long orderId;

    private String orderNo;

    private String createName;

    private BigDecimal price;

}
