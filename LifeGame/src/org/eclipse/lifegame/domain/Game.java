package org.eclipse.lifegame.domain;

public class Game {
	private Board board;
	private int generation;
	private static Game game;
	private static Game theInstance = game;
	
	private Game(Board board) {
		this.board = board;
		this.generation = 1;
	}
	
	public Board getBoard() {
		return this.board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public int getGeneration() {
		return this.generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	private Game getInstance() {
		return this.theInstance;
	}
}
