package com.xorkz.icecream.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private String name;
    private String flavour;
    private int quantity;
    private boolean takeAway;
    private boolean addOns;
    private String coupon;
}
