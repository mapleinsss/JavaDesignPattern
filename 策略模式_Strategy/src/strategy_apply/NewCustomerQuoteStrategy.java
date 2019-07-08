package strategy_apply;

import java.math.BigDecimal;

/**
 * @Author Mapleins
 * @Date 2019-06-17 10:06
 * @Description
 */
public class NewCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("抱歉！新客户没有折扣！");
        return originalPrice;
    }
}

