import java.util.Stack;

/**
 * Stack is a Last In First Out data structure
 * push()
 * pop()
 * empty()
 * peek()
 * search()
 */
public class StackADT {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out
                .println("If there are no elements in the stack, the stack's empty() method returns: " + stack.empty());

        stack.push("NYC");
        stack.push("San Jose");
        stack.push("Des Moines");
        stack.push("Chicago");

        System.out
                .println("If there are elements in the stack, the stack's empty() method returns: " + stack.empty());

        System.out.print("Before::");
        System.out.println(stack);

        System.out.println("See the top element without removing it: " + stack.peek());

        String topElement = stack.pop();
        System.out.print("After popping the top element:");
        System.out.println(stack);

        System.out.println("Element popped is: " + topElement);

        System.out.println(
                "Is NYC part of this stack, if so provide me it's location from stack top: " + stack.search("NYC"));
    }
}
