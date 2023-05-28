public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(3);
        stack.push(8);
        stack.push(2);

        stack.displayStack();

        stack.peek();

        stack.pop();
        stack.peek();
    }
}