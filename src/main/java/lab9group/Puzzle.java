package lab9group;
/**
 * @author muneebimtiazahmad
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle {

	private static final int VISITED = 2;
	private static final int PATH = 3;

	private int numOfRows, numOfCols;
	private int[][] grid;

	/**
	 * reads the test file and store the values in the grid
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
	 * set the value of the grid position to VISITED
	 */
	public void visitPosition(int row, int col) {
		grid[row][col] = VISITED;
	}

	/**
	 * @return the numOfRows
	 */
	public int getTotalRows() {
		return numOfRows;
	}

	/**
	 * @return the numOfCols
	 */
	public int getTotalCols() {
		return numOfCols;
	}
	
	/**
	 * mark the Path 
	 */

	public void markPath(int row, int col) {
		grid[row][col] = PATH;

	}

	
	/**
	 * checks for the valid position, a valid position is the is not blocked (0) and has not been TRIED (2)
	 * Further, checks if the value is out of bound, it throws an exception.
	 */
	public boolean isPositionValid(int row, int col) {

		boolean temp = false;

		// implement the valid move here.

		return temp;

	}
	
	
	/**
	 * converts the grid to a String format
	 * returns the result
	 */

	public String toString() {

		String gridToString = "\n";

		// implement the toString

		return gridToString;

	}
}
