///This is to understand the concept of Spring Beans

package com.CodeNath.SpringBoot_Framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.CodeNath.SpringBoot_Framework.game.GameRunner;
import com.CodeNath.SpringBoot_Framework.game.MarioGame;
import com.CodeNath.SpringBoot_Framework.game.PacMan;
import com.CodeNath.SpringBoot_Framework.game.superContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		//System.out.println(context.getBean("address2"));
		
		
		//System.out.println(context.getBean(Address.class));
		
		
	}

}
