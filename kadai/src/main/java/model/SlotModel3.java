package model;

import java.util.Random;

public class SlotModel3 {
	private static final String[] SYMBOLS = {"みそ汁","コーンスープ","チゲスープ","卵スープ","　","カレー"};
	private static final int NUM_REELS =1;
	
	private String[][] reels;
	
	
	public SlotModel3() {
		reels = new String[NUM_REELS][];
		for(int i = 0; i < NUM_REELS; i++) {
			reels[i] = new String[SYMBOLS.length];
			System.arraycopy(SYMBOLS, 0, reels[i],0,SYMBOLS.length);
		}
	}
	
	
	public String spin() {
		Random random = new Random();
		String[] result3 = new String[NUM_REELS];
		
		for(int i = 0; i < NUM_REELS; i++) {
			int index = random.nextInt(SYMBOLS.length);
			result3[i] = reels[i][index];
		}
		
		return String.join("",result3);
	}
	

}
