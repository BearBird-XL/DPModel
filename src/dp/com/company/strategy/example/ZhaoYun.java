/**
 * 
 */
package com.company.strategy.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ZhaoYun {
	 //赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
	public static void main(String[] args) {
		Context context;
		
		//刚刚到吴国的时候拆第一个
		System.out.println("---刚刚到吴国的时候拆第一个---");
		context = new Context(new BackDoor()); //拿到妙计
		context.operate();  //拆开执行
		System.out.println("\n");
		
		//刘备乐不思蜀了，拆第二个了
		System.out.println("---刘备乐不思蜀了，拆第二个了---");
		context = new Context(new GivenGreenLight());
		context.operate();  //执行了第二个锦囊了
		System.out.println("\n");
		
		//孙权的小兵追了，咋办？拆第三个
		System.out.println("---孙权的小兵追了，咋办？拆第三个---");
		context = new Context(new BlockEnemy());
		context.operate();  //孙夫人退兵
		System.out.println("\n");
		
		/*
		 *问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
		 *而不知道是BackDoor这个妙计，咋办？  似乎这个策略模式已经把计谋名称写出来了
		 *
		 * 错！BackDoor、GivenGreenLight、BlockEnemy只是一个代码，你写成first、second、third，没人会说你错!
		 * 
		 * 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
		 * 缺点：
		 * 1. 策略类数量增多：每一个策略都是一个类，复用的可能性很小，类数量增多。
		 * 2. 所有的策略类都需要对外暴露。上层模块必须知道有哪些策略，然后才能决定使用哪一种策略，
		 * 这与迪米特法则是相违背的，我只是想使用一个策略，我凭什么就要了解这个策略呢？
		 * 那要你的封装类还有什么意义？这是原装策略模式的一个缺点，幸运的是，我们可以使用其他模式来修
		 * 正这个缺陷，如果工厂方法模式、代理模式或享元模式。
		 */
		
	
	}

}
