package com.xorkz.icecream.service;

import com.xorkz.icecream.dto.OrderDTO;

public interface OrderService {

    boolean validate(OrderDTO orderDTO);
    
}
