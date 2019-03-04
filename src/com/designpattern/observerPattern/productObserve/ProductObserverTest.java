package com.designpattern.observerPattern.productObserve;

import org.junit.Test;

/**
 * 测试
 *
 * @author zt1994 2019/3/4 23:11
 */
public class ProductObserverTest {

    /**
     * 测试
     */
    @Test
    public void testProductObserver() {
        ProductList observable = ProductList.getInstance();
        JingDongObserver jingDongObserver = new JingDongObserver();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);
        observable.addProduct("新产品-小米9");
    }
}
