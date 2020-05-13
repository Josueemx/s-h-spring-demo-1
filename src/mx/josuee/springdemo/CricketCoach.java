package mx.josuee.springdemo;

public class CricketCoach implements Coach{
	
	//private field for dependency 
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	private int id;
	private double score;
	
	public CricketCoach() {}
	
	//define constructor for dependency injection - (contructor-arg)
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Hit the ball 300 times!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " Fuck yeah!";
	}
}
