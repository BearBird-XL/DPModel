package com.company.proxy.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 西门庆
 */
public class XiMenQing {

    /**
     * 定义一种类型的女人
     */
    private KindWomen women;

    /**
     * 天生就是为女人而存在
     *
     * @param kindWomen 定义一种类型的女人
     */
    public XiMenQing(KindWomen kindWomen) {
        this.women = kindWomen;
    }

    /**
     * 与女性交流
     */
    public void communicate() {

    }

    /**
     * 西门庆的终极目标
     */
    public void doSomething() {
        this.women.makeEyesWithMan();
    }

    public KindWomen getWomen() {
        return women;
    }

    public void setWomen(KindWomen women) {
        this.women = women;
    }
}
