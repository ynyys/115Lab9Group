package lab9group;

/**
 * @author muneebimtiazahmad
 * @modified tika
 * Generic linked implementation of the StackADT
 *
 *
 * What i found is that we are making 3 constructors that take in:
 * the basic empty stack
 * the stack with only 1 element in it
 * the stack with 2 or more elements in it
 * -Ioan
 */

public class Stack<T> implements StackADT<T> {

	private Stack<T> previous; 
	private T value;


	/**
	 * Constructor for ????
	 * (AHEM... IT'S A BASIC ONE >:(... )
	 */
	public Stack() {
		//implement here

		/**Simply creating a new stack - Ioan
		 *
		 */

		this.previous = null;
		this.value = null;
	}
	
	/**
	 * 
	 * Overload constructor
	 * @param  value
	 */
	Stack(T value) {
		// implement the method here
		/**Adding the first value to the stack as this. previous will just be nothing - Ioan
		 *
		 */
		this.value = value;
		this.previous = null;
	}

	/**
	 * @param previous
	 * @param value
	 */
	Stack(Stack<T> previous, T value) {
		// implement the method here
		/** Establishes this when there is more than 1 item. - Ioan
		 *
		 */
		this.previous = previous;
		this.value = value;
	}

	/**
	 * push the value on to the Stack
	 */
	@Override
	public void push(T value) {
		/** implement the method here
		 * saves the previous values and then reassigns
		 * previous references now to our old stack instances. - Ioan
		 */


		this.previous = new Stack<>(this.previous, this.value);
		this.value = value;



	}

	/**
	 * pop the element on top of the Stack
	 */
	@Override
	public T pop() {
		
		// implement the method here, the return null is added to handle compile error, 
		// you can delete it.
		/** Checks if it is not empty else will assign the removed the top value. Then checks
		//if there is anything previous to the value if not then will set to null.
		// this.previous.value sets the new head from the previous value. - Ioan
		 */
		if (!this.isEmpty()) {
			T removed = this.value;

			if (this.previous == null){
				this.value = null;
			} else {
				this.value = this.previous.value;
				this.previous = this.previous.previous;
			}
			return removed;
		}
		return null;
	}

	/**
	 * returns the top of the stack
	 */
	@Override
	public T peek() {
		
		// implement the method here, the return null is added to handle compile error, 
		// you can delete it.
		/** Looks at the top of the stack and returns it - Ioan
		 *
		 */
		return this.value;
	}

	
	/**
	 * checks if the stack is empty
	 */
	@Override
	public boolean isEmpty() {
		
		// implement the method here, the return false is added to handle compile error, 
		// you can delete it.
		/** checks if the stack is empty - Ioan
		 *
		 */
		return this.previous == null;
	}

	/**
	 * returns the size of the stack
	 */
	@Override
	public int size() {
		// implement the method here, the return 1 is added to handle compile error, 
		// you can delete it.
		/** Recursively count and adds one until the last item is reached. - Ioan
		 *
		 */
		return this.isEmpty() ? 0 : 1 + this.previous.size();
	}

	/**
	 * add other methods if desired--it's even encouraged!
	 */

}
