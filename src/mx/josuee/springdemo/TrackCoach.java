package mx.josuee.springdemo;

public class TrackCoach implements Coach {

	//private field for dependency 
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	//define constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
