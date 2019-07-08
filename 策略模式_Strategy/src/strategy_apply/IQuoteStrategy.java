package strategy_apply;

import java.math.BigDecimal;

/**
 * @Author Mapleins
 * @Date 2019-06-17 10:05
 * @Description 报价策略接口
 */
public interface IQuoteStrategy {
    //获取折后价的价格
    BigDecimal getPrice(BigDecimal originalPrice);
}
