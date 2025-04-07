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
		Stack<Position> stack = new Stack<>();

		// implement the algorithm here
		Position startPosition = new Position();
		stack.push(startPosition);
		do {
			Position position = stack.pop();
			int x = position.getX();
			int y = position.getY();
			puzzle.isPositionValid(position.getY(), position.getX());
			puzzle.visitPosition(y, x);
			if (position.getX() == puzzle.getTotalCols() -1 && position.getY() == puzzle.getTotalRows() -1){
				pathFound = true;
			} else {
				pushValidNeighbour(position.getY(), position.getX() + 1, stack);
				pushValidNeighbour(position.getY() + 1, position.getX(), stack);
				pushValidNeighbour(position.getY() - 1, position.getX(), stack);
				pushValidNeighbour(position.getY(), position.getX() - 1, stack);
			}
		} while (!stack.isEmpty() && !pathFound);
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
		if (puzzle.isPositionValid(y, x)){
			Position position = new Position();
			position.setX(x);
			position.setY(y);
			stack.push(position);
		}
	}
}
