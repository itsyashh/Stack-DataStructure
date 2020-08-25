package LearnStack;
import java.util.Scanner;
import java.util.Stack;

public class StackStockSpan {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int[] nge = solve(a);
        display(nge);
    }


    public static int[] solve(int[] arr){

        int [] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] =1;

        for (int i = 1; i < arr.length; i++){
            while (st.size() > 0 && arr[i] > st.size()){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i +1;
            }else {
                span[i] = 1 - st.peek();
            }
            st.peek();
        }

        return span;
    }


}
