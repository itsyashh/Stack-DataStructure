package LearnStack;
import java.util.Scanner;
import java.util.Stack;

public class StackNextGETR {

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
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
        int [] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length -1]); // we pushed last greater element
        nge[arr.length -1] = -1;

        for(int i = arr.length -2; i >= 0; i--){
            // - a +

            while (st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = -1;
            }else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }

}