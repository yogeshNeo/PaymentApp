package com.paymentApp.model;

import lombok.Data;

@Data
public class OrderEvent {

    private String type;

    private CustomerOrder order;
}
