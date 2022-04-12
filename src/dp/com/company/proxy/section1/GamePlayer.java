package com.company.proxy.section1;

import cn.hutool.core.lang.Console;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 真是的玩家
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    /**
     * 通过构造函数传递名称
     */
    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 打怪，最期望的就是杀老怪
     */
    public void killBoss() {
        Console.log("{} 在打怪！", this.name);
    }

    /**
     * 进游戏之前你肯定要登录吧，这是一个必要条件
     *
     * @param user     用戶名
     * @param password 密碼
     */
    public void login(String user, String password) {
        Console.log("登录名为 {} 的用户 {} 登录成功！", user, this.name);
    }

    /**
     * 升级，升级有很多方法，花钱买是一种，做任务也是一种
     */
    public void upgrade() {
        Console.log("{} 又升了一级！", this.name);
    }

}
