package com.abcde.springbootframework;

import com.abcde.springbootframework.game.gameRunner;
import com.abcde.springbootframework.game.marioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var marioGame = new marioGame();
		var gameRunner = new gameRunner(marioGame);
		gameRunner.run();
		
	}

}
