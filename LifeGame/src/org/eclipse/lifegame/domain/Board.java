package org.eclipse.lifegame.domain;

public class Board {
	
	private int[][]	cells;
	
	public Board(int[][] cells) {
		
	}
	
	public Board() {
		this.cells = new int[10][10];
	}
	
	public void evolve(Game game) {
		
	}
	
	public void evolve(Game game, Integer number) {
		
	}
	
	@Override
	public String toString() {
		return "Board for game of life";
	}

	public int[][] getCells() {
		return this.cells;
	}

	public void setCells(int[][] cells) {
		this.cells = cells;
	}
}
