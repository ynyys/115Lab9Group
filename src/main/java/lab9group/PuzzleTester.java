package lab9group;

/**
 * @author muneebimtiazahmad
 */

public class PuzzleTester {

	/**
	 * @param args
	 * test the implementation of the SolvePuzzle
	 * if the it is possible to solve the maze, prints "The maze is solved"
	 * else prints "The maze cannot be solved"
	 * 
	 * Lastly also prints the solved or unsolved maze
	 */

	public static void main(String[] args) {
		stackTest();
		puzzleTest();
		solvableMaze();
	}

	private static void stackTest(){

		Stack<String> stackTest = new Stack<>();

		if (stackTest.isEmpty()){
			System.out.println("isEmpty correct");
		} else {
			System.out.println("Actual Output: " + stackTest.isEmpty());
		}

		stackTest.push("Test");

		if (!(stackTest.isEmpty())){
			System.out.println("push is correct");
		} else {
			System.out.println("Actual Output: " + stackTest.isEmpty());
		}

		if (stackTest.pop().equals("Test")){
			System.out.println("pop is correct");
		} else {
			System.out.println("Actual output: " + stackTest.pop());
		}

		stackTest.push("Test");

		if (stackTest.peek().equals("Test")){
			System.out.println("peek is correct");
		} else {
			System.out.println("Actual Output :" + stackTest.peek());
		}

		if (stackTest.size() == 1){
			System.out.println("size is correct");
		} else {
			System.out.println("Actual Output: " + stackTest.size());
		}
	}

	private static void puzzleTest(){
		Puzzle puzzle = new Puzzle("testmaze.txt");
		Position position = new Position();
		if (puzzle.isPositionValid(position.getX(), position.getY())){
			System.out.println("isPosition is correct");
		} else {
			System.out.println("Actual Output: " + puzzle.isPositionValid(position.getX(), position.getY()));
		}

		position.setY(-1);
		position.setX(-1);
		if (!puzzle.isPositionValid(position.getX(), position.getX())){
			System.out.println("Out Of Bounds is correct");
		} else {
			System.out.println("Actual Output: " + puzzle.isPositionValid(position.getX(), position.getY()));
		}
	}

	/**
	 * tests if the maze can be solved or not
	 */
	private static void solvableMaze(){
		Puzzle puzzleToSolve = new Puzzle("testmaze.txt");
		SolvePuzzle solvePuzzle = new SolvePuzzle(puzzleToSolve);

		if (solvePuzzle.hasValidPath()) {
			System.out.println("The maze is solved");
		} else {
			System.out.println("The maze cannot be solved");
		}
	}

}
