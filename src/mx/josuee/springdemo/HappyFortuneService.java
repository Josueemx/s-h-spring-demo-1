package mx.josuee.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] options;
	
	public HappyFortuneService() {}
	
	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	@Override
	public String getFortune() {
		Random ran = new Random();
		int x = ran.nextInt(3);
		return options[x];
	}

}
