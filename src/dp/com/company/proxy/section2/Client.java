package com.company.proxy.section2;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Console;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 场景类
 */
public class Client {

    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");

        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);

        //开始打游戏，记下时间戳
        Console.log("开始时间是：{}", DateTime.now());
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        Console.log("结束时间是：{}", DateTime.now());

    }

}
