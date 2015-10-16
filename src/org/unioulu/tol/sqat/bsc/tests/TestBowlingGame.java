package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;


public class TestBowlingGame {

	private static Frame[] frames = {
		new Frame(1,5), new Frame(3,6),new Frame(7,2), new Frame(3,6), new Frame(4,4),
		new Frame(5,3),new Frame(3,3), new Frame(4,5), new Frame(8,1), new Frame(2,6)
	};
	
	private static Frame[] simpleStrikeFrames1 = {
			
	};
	
	@Test
	public void testGameScoreNormalFrames() {
		BowlingGame game = null;
		game = new BowlingGame();
			
		for(Frame frame: frames) {
			game.addFrame(frame);
		}
		
		System.out.println("game.score = " + game.score());
		assertEquals(game.score(),81);
		assertEquals(81,game.score());
	}
	
	@Test
	public void testGameScoreSingleStrikeFirst() {
		/*ArrayList<Frame> gameFrames = new ArrayList<Frame>(Arrays.asList(frames));
		gameFrames.set(0, new Frame(10,0));
		
		BowlingGame game = new BowlingGame();
		for(Frame frame: gameFrames) {
			game.addFrame(frame);
		}
	
		assertEquals(game.score(),94);*/
	}
}
