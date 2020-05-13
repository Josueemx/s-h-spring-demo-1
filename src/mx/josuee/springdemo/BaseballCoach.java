package mx.josuee.springdemo;

public class BaseballCoach implements Coach{
	
	//private field for dependency 
	private FortuneService fortuneService;
	
	public BaseballCoach() {}
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on bating practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
