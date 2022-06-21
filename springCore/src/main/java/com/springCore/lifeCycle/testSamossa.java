package com.springCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.ConsInjection.Addition;
import com.springCore.ConsInjection.Person;

public class testSamossa {

		public static void main(String []args)
		{
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/lifeCycleConfig.xml");
			Samossa temp = (Samossa)context.getBean("samossa");
			
			System.out.println("<------This Is Due Init Of Bean In XML Config-------->");
			System.out.println("Price Of One Samossa Is: "+temp.toString());
			
			System.out.println("<------This Is Due To Destroy Of Bean In XML Config-------->");
			context.registerShutdownHook();
			
			System.out.println("++++++++++++++++++++++++++++++++++++");
			Pepsi temp1 = (Pepsi)context.getBean("pepsi1");
			System.out.println(temp1);
			
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			Chatni temp2 = (Chatni)context.getBean("chatni1");
			System.out.println(temp2);
		}
		


}
