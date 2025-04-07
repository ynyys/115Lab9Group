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
			System.out.println("size  is correct");
		} else {
			System.out.println("Actual Output: " + stackTest.size());
		}

	}

}
