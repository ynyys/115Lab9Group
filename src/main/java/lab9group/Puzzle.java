package lab9group;
/**
 * @author muneebimtiazahmad, ammended by @ynyys
 * Class to generate a puzzle for us to solve, and methods to navigate.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle {

	private static final int VISITED = 2;
	private static final int PATH = 3;
	public static final int BLOCKED = 0;

	private int numOfRows, numOfCols;
	private int[][] grid;

	/**
	 * reads the test file and store the values in the grid.
	 */
	public Puzzle(String filename) {
		try {

			Scanner scan = new Scanner(new File(filename));

			numOfRows = scan.nextInt();
			numOfCols = scan.nextInt();

			grid = new int[numOfRows][numOfCols];

			for (int i = 0; i < numOfRows; i++) {

				for (int j = 0; j < numOfCols; j++) {
					grid[i][j] = scan.nextInt();
				}
			}

		} catch (FileNotFoundException fileNotFound) {
			System.out.println("Your filename is not correct!");
		}
	}

	/**
	 * Method to visit a position in the stack.
	 * @param row index of the row we are visiting.
	 * @param col index of the column we are visiting.
	 */
	public void visitPosition(int row, int col) {
		grid[row][col] = VISITED;
	}

	/**
	 * Method to return the number of rows in the puzzle.
	 * @return the numOfRows
	 */
	public int getTotalRows() {
		return numOfRows;
	}

	/**
	 * Method to return the number of columns in the puzzle.
	 * @return the numOfCols
	 */
	public int getTotalCols() {
		return numOfCols;
	}
	
	/**
	 * Method to mark the correct path used. Not used.
	 */

	public void markPath(int row, int col) {
		grid[row][col] = PATH;
	}

	/**
	 * Method to check if any given position is valid on the board.
	 * @param row row of position to check.
	 * @param col column of position to check.
	 * @return status of the position.
	 */
	public boolean isPositionValid(int row, int col) {

		boolean temp = false;

		/*
			This checks if the value at the position of row y and column x, is not...
			equal to 0 (a wall) and 2 (an already visited position).
		 */
		try {
			if (grid[row][col] != BLOCKED && grid[row][col] != VISITED) {
				temp = true;
			}
		}

		//Prints if an index inputted isnt valid, stops program from bricking itself.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The position:\n row: " + row + ", column: " + col +
					".\nIs out of bounds!");
		}

		return temp;

	}

	/**
	 * Converts object to string. Not used yet.
	 */

	public String toString() {

		String gridToString = "\n";

		// implement the toString

		return gridToString;

	}
}
