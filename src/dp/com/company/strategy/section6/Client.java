package com.company.strategy.section6;

import cn.hutool.core.lang.Console;

import java.util.Arrays;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];  //符号
        int b = Integer.parseInt(args[2]);
        Console.log("输入的参数为：{}", Arrays.toString(args));
        Console.log("运行结果为：{} {} {} = {}", a, symbol, b, Calculator.ADD.exec(a, b));
    }
}
