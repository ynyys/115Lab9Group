package lab9group;

/**
 * @author muneebimtiazahmad
 * @modified tika
 * Generic linked implementation of the StackADT
 *
 * This is my literal guess for this I have no clue what I am doing with this
 * What i found is that we are making 3 constructors that take in:
 * the basic empty stack
 * the stack with only 1 element in it
 * the stack with 2 or more elements in it
 * - with love - Ioan
 * Also additional note: I will change the comments to make it "appropriate" please don't kill me
 * Also also additional note: CECIL I NEED YOU CECIL
 */

public class Stack<T> implements StackADT<T> {

	private Stack<T> previous; 
	private T value;


	/**
	 * Constructor for ????
	 */
	public Stack() {
		//implement here

		//Simply creating a new stack I am guessing - Ioan

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
		//Adding the first value to the stack as this. previous will just be nothing - Ioan
		this.value = value;
		this.previous = null;
	}

	/**
	 * @param previous
	 * @param value
	 */
	Stack(Stack<T> previous, T value) {
		// implement the method here
		//Probably establishes this when there is more than 1 item in the list idk. - Ioan
		this.previous = previous;
		this.value = value;
	}

	/**
	 * push the value on to the Stack
	 */
	@Override
	public void push(T value) {
		// implement the method here
		// Checks if there is anything in the stack if not then value will simply be added into the stack
		// with no extra need for a previous to occur. The annoying thing is, is that I thought the
		//.push(value) thing would be simple it but all it would do is just call itself like bruh.
		// I managed to get the information from
		// https://jenkov.com/tutorials/java-collections/stack.html#:~:text=You%20push%20elements%20onto%20a,String%3E()%3B%20stack.
		// and https://hackajob.com/talent/blog/how-to-implement-stacks-and-queues-in-java
		// just be careful with the second one because i got bombarded with scams.
		// Are we supposed to import things like java.util.Stack
		// or nah? like i am guessing we have to make our own .push() instead
		// of an inbuilt one
		// Anyway enough rambling the second part saves the previous values and then reassigns
		// this.value as the newest top value to the stack so two parts, the head and tail thing that
		// was taught in A level.
		if (this.value == null){
			this.value = value;
		} else {
			this.previous = new Stack <>(this.previous, this.value);
			this.value = value;


		}
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
