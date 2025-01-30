public interface Stack<T> {
    void push(T element) throws StackOverflowException;
    T pop() throws StackUnderflowException;
    T peek() throws StackUnderflowException;
    boolean isEmpty();
    boolean isFull();
}
