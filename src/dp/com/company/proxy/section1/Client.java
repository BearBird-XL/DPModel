package com.company.proxy.section1;

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
        //开始打游戏，记下时间戳
        Console.log("开始时间是：{}", DateTime.now());
        player.login("zhangSan", "password");
        //开始杀怪
        player.killBoss();
        //升级
        player.upgrade();
        //记录结束游戏时间
        Console.log("结束时间是：{}", DateTime.now());

    }

}
