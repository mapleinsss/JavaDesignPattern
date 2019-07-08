package strategy_apply;

import java.math.BigDecimal;

/**
 * @Author Mapleins
 * @Date 2019-06-17 10:06
 * @Description
 */
public class OldCustomerQuoteStrategy implements IQuoteStrategy {

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户享有9折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.9)).setScale(2, BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
