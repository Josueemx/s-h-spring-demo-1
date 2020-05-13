package mx.josuee.springdemo;

public class GymnasticsCoach implements Coach{

	//private field for dependency 
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public GymnasticsCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "20 round offs back handspring fulltwist layout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
