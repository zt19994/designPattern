package com.designpattern.behaviorPattern.command;

/**
 * @author zhongtao
 * @date 2023/5/28 14:46
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
