package strategy_apply;

import java.math.BigDecimal;

/**
 * @Author Mapleins
 * @Date 2019-06-17 16:13
 * @Description
 */
public class StrategyContext {
    //持有一个策略实现的引用
    private IQuoteStrategy strategy;

    //使用构造器注入具体的策略类
    public StrategyContext(IQuoteStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal contextMethod(BigDecimal originalPrice) {
        //调用策略实现的方法
        return strategy.getPrice(originalPrice);
    }
}
