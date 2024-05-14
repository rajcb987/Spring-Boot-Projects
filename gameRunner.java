package com.abcde.springbootframework.game;

public class gameRunner {

	 public marioGame game;

	public gameRunner(marioGame game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
