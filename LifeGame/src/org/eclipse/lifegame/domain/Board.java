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
	
	public String toString(int massiv[][]) {
		for (int i = 1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				if (massiv[i][j]==1) return "X";
						else return " ";
			}
		}
		return null;
	}

	public int[][] getCells() {
		return this.cells;
	}

	public void setCells(int[][] cells) {
		this.cells = cells;
	}
	
}
