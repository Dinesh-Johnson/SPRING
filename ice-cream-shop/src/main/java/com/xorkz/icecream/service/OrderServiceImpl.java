package com.xorkz.icecream.service;

import com.xorkz.icecream.dto.OrderDTO;
import sun.dc.pr.PRError;

import java.util.*;

public class OrderServiceImpl implements OrderService{

    private static final List<String> couponList = Arrays.asList("XVERT","HSGSS","FIWND","DWJKD","DKMMS","FIRST","KINDER");
    private static final Map<String,Double> price = new HashMap<>();

    static {
        price.put("Vanilla",30.0);
        price.put("Chocolate",60.0);
        price.put("Strawberry",80.0);
        price.put("Mint Chocolate Chip",100.0);
        price.put("Butterscotch",110.0);
        price.put("Pistachio",120.0);
        price.put("Kulfi",50.0);
    }

    public OrderServiceImpl() {
        System.out.println("OrderServiceImpl Created.....");
    }


    @Override
    public boolean validate(OrderDTO orderDTO) {
        if (orderDTO == null) {
            System.out.println("OrderDTO is null — You are not Good to Go");
            return false;
        }

        System.out.println("You Are Good to Go");

        String name = orderDTO.getName();
        if (name==null|| name.length()<2 || name.length()>20){
            System.out.println("Name is Invalid");
            return false;
        }else {
            System.out.println("Name is Valid");
        }

        String flavour = orderDTO.getFlavour();
        if (flavour == null || !price.containsKey(flavour)) {
            System.out.println("Invalid Flavour: " + flavour);
            return false;
        } else {
            System.out.println("Flavour is Valid: " + flavour);
        }

        int quantity = orderDTO.getQuantity();
        if (quantity<=0){
            System.out.println("Write Valid Quantity");
            return false;
        }else {
            double total = quantity * price.get(flavour);
            System.out.println("Quantity is Valid");
            System.out.println("Total: " + total);
        }

        String coupon = orderDTO.getCoupon();
        if (coupon!=null&& !couponList.contains(coupon)){
            System.out.println("Invalid Coupon: " + coupon);
        }else if (coupon != null) {
            System.out.println("Coupon is Valid: " + coupon);
        }
        return true;
    }
    public static double getPrice(String flavour) {
        return price.getOrDefault(flavour, 0.0);
    }


}
