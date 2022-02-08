import java.util.Stack;

public class StackMain {
    public static void main(String [] args){
        StackOfIntegers stack = new StackOfIntegers(18);

        for (int i=9; i>=0; i--){
            stack.push(i);
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " " );
        }

    }
    
}
