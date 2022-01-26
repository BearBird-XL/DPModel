/**
 *
 */
package com.company.strategy.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 计谋有了，那还要有锦囊
 */
public class Context {
    //构造函数，你要使用那个妙计
    private final IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate() {
        this.strategy.operate();
    }
}
