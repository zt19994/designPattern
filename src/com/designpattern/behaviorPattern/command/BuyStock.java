package com.designpattern.behaviorPattern.command;

/**
 * @author zhongtao
 * @date 2023/5/28 14:45
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}