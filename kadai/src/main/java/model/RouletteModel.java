package model;

import java.util.Random;

public class RouletteModel {
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 5;
	
	public int spin() {
		Random random = new Random();
		return random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
	}

}
