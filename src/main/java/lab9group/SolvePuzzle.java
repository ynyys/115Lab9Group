package lab9group;


/**
 * @author muneebimtiazahmad
 * modified tika 
 */

public class SolvePuzzle {

	private Puzzle puzzle;

	public SolvePuzzle(Puzzle puzzle) {

		this.puzzle = puzzle;

	}
	
	/**
	 * Push start onto the stack;
	 * while stack is not empty AND Path is not found
	 * 	do Pop current cell off stack;
	 *	Try the position and set the position value to visited
	 *	If the position has reached the end Point on the puzzle
	 *		Set Path Found to TRUE
	 *	Else
	 *		Check all the Neighbour Positions on the Puzzle 
	 *		If the position is valid
	 *			Push to the Stack
	 *	end
	 */

	public boolean hasValidPath() {

		boolean pathFound = false;
		/*
		Stack<Position> stack = new Stack<>();

		// implement the algorithm here
		pushValidNeighbour(0 ,0, stack);
		do {
			Position position = stack.pop();
			puzzle.markPath(position.getX(), position.getY());
			puzzle.visitPosition(position.getX(), position.getY());
			if (puzzle.)
		} while (stack.size() != 0 && !pathFound);
		*/
		return pathFound;

	}

	/**
	 * 
	 * Check the Neighbour Position on the Puzzle 
	 * If the position is valid
	 *Push to the Stack
	 * 
	 */
	private void pushValidNeighbour(int x, int y, Stack<Position> stack) {

	}


}
