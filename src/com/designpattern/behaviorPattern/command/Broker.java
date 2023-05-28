package com.designpattern.behaviorPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongtao
 * @date 2023/5/28 14:46
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
