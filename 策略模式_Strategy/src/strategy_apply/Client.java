package strategy_apply;

import java.math.BigDecimal;

/**
 * @Author Mapleins
 * @Date 2019-06-17 16:14
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        IQuoteStrategy strategy = new OldCustomerQuoteStrategy();
        StrategyContext strategyContext = new StrategyContext(strategy);
        BigDecimal ret = strategyContext.contextMethod(new BigDecimal(100));
        System.out.println(ret);
    }
}
