public class Main {
    public static void main(String[] args) {
        try {
            Stack<Integer> stack = new ArrayStack<>(5);

            
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            
            System.out.println("Peek: " + stack.peek());

        
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());


            System.out.println("Is stack empty? " + stack.isEmpty());

        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
