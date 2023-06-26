package model;

import java.util.Random;

public class SlotModel2 {
	private static final String[] SYMBOLS = {"焼き鳥","冷しゃぶ","焼き魚","お好み焼き","焼きそば","　","刺身"};
	private static final int NUM_REELS =1;
	
	private String[][] reels;
	
	
	public SlotModel2() {
		reels = new String[NUM_REELS][];
		for(int i = 0; i < NUM_REELS; i++) {
			reels[i] = new String[SYMBOLS.length];
			System.arraycopy(SYMBOLS, 0, reels[i],0,SYMBOLS.length);
		}
	}
	
	
	public String spin() {
		Random random = new Random();
		String[] result2 = new String[NUM_REELS];
		
		for(int i = 0; i < NUM_REELS; i++) {
			int index = random.nextInt(SYMBOLS.length);
			result2[i] = reels[i][index];
		}
		
		return String.join("",result2);
	}
	

}
