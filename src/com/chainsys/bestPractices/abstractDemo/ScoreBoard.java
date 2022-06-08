package com.chainsys.bestPractices.abstractDemo;

public class ScoreBoard {
	public int TargetScore = 125;
	private ScoreBoard() {
		System.out.println("Object created for ScoreBoard");
	}
	// Create object() is a factory method
	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}
