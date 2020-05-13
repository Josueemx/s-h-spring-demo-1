package mx.josuee.springdemo;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		BaseballCoach myCoach = context.getBean("myCoach", BaseballCoach.class);
		
		System.out.println(myCricketCoach.getDailyWorkout());
		System.out.println(myCricketCoach.getDailyFortune());
		System.out.println(myCricketCoach.getTeam());
		System.out.println(myCricketCoach.getEmailAddress());
		System.out.println(myCricketCoach.getId());
		System.out.println(myCricketCoach.getScore());
		System.out.println();
		HappyFortuneService service = (HappyFortuneService) myCricketCoach.getFortuneService();
		System.out.println(Arrays.toString(service.getOptions()));
		//System.out.println(myCoach.getDailyFortune());
		
		if(myCricketCoach.getFortuneService()==myCoach.getFortuneService())
			System.out.println("misma direccion memoria de fortuneservice"+myCricketCoach.getFortuneService()+" y "+myCoach.getFortuneService());
		
		context.close();
		
		
		

	}

}
