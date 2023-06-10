import java.util.*;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("World");
        stack.push("New");

        while(stack.size() > 0){
            String tos = stack.peek();
            System.out.println(tos);
            stack.pop();
        }
    }
}
