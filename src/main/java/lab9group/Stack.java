package lab9group;

/**
 * @author muneebimtiazahmad
 * @modified tika
 * Generic linked implementation of the StackADT
 */

public class Stack<T> implements StackADT<T> {

	
	private Stack<T> previous; 
	private T value;

	/**
	 * Constructor for ????
	 */
	public Stack(T value, String name) {
		//implement here
		this.value = value;
	}
	
	/**
	 * 
	 * Overload constructor
	 * @param  value
	 */
	Stack(T value) {
		// implement the method here
	}

	/**
	 * @param previous
	 * @param value
	 */
	Stack(Stack<T> previous, T value) {
		
		// implement the method here
	}

	/**
	 * push the value on to the Stack
	 */
	@Override
	public void push(T value) {

		// implement the method here

	}

	/**
	 * pop the element on top of the Stack
	 */
	@Override
	public T pop() {
		
		// implement the method here, the return null is added to handle compile error, 
		// you can delete it.
		return null;
	}

	/**
	 * returns the top of the stack
	 */
	@Override
	public T peek() {
		
		// implement the method here, the return null is added to handle compile error, 
		// you can delete it.
		return null;
	}

	
	/**
	 * checks if the stack is empty
	 */
	@Override
	public boolean isEmpty() {
		
		// implement the method here, the return false is added to handle compile error, 
		// you can delete it.
		return false;
	}

	/**
	 * returns the size of the stack
	 */
	@Override
	public int size() {
		// implement the method here, the return 1 is added to handle compile error, 
		// you can delete it.
		return 1;
	}

	/**
	 * add other methods if desired--it's even encouraged!
	 */

}
