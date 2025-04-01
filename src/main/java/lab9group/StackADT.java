package lab9group;

/**
 * @author muneebimtiazahmad
 * @modified tika
 * interface to constrain the method names of the stack abstract datatype
 */
public interface StackADT<T> {

		void push(T value);
		T pop();
		T peek();
		boolean isEmpty();
		int size();
}
