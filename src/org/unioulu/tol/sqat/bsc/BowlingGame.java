package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;


public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		int score = 0;
		
		for(int i = 0; i < frames.size(); i++) {
			score += calculateFrameScore(i);	
		}
		
		return score;
	}
	
	private int calculateFrameScore(int indx) {
		int score = 0;
		Frame currentFrame = frames.get(indx);
		
		score = currentFrame.score();
		
		boolean isStrike = currentFrame.isStrike();
		
		if(isStrike && indx < (frames.size()-1)) {
			score += calculateFrameScore(indx+1);
		}
		
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
