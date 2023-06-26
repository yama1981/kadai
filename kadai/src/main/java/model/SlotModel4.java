package model;

import java.util.Random;

public class SlotModel4 {
	private static final String[] SYMBOLS = {"シーザーサラダ","ミニトマト","納豆","きゅうりの浅漬け","　"};
	private static final int NUM_REELS =1;
	
	private String[][] reels;
	
	
	public SlotModel4() {
		reels = new String[NUM_REELS][];
		for(int i = 0; i < NUM_REELS; i++) {
			reels[i] = new String[SYMBOLS.length];
			System.arraycopy(SYMBOLS, 0, reels[i],0,SYMBOLS.length);
		}
	}
	
	
	public String spin() {
		Random random = new Random();
		String[] result4 = new String[NUM_REELS];
		
		for(int i = 0; i < NUM_REELS; i++) {
			int index = random.nextInt(SYMBOLS.length);
			result4[i] = reels[i][index];
		}
		
		return String.join("",result4);
	}

}
