package LearnStack;
import java.util.Stack;

public class stackIntro {
    public static void main ( String [] args){

        // deceleration of stack
        Stack<Integer> stc = new Stack<>();

        // adding value to the Stack by push

        stc.push(10);
        stc.push(20);
        stc.push(30);
        stc.push(40);
        System.out.println(stc);

        // removing value to the stack by pop

        stc.pop();
        System.out.println(stc);

        // // getting value to the stack by Peek

        System.out.println(stc.peek());
        System.out.println(stc.size());


    }
}
