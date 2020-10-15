import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = scan.nextInt();
        }
        String s = str(a);
        System.out.println(s);
    }
    
    public static String str(int[] a) {
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num = 1;
        for(int i=0; i<a.length; i++) {
            int n = a[i];
            if(num <= n) { 
                while(num <= n) {
                    stack.push(num++);
                    sb.append("+\n");
                    if(num > n) {
                        stack.pop();
                        sb.append("-\n");
                    }
                }
            }
            else {
                int k = stack.pop();
                if(k > n) {
                    return "NO";
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        return sb.toString();
    }
}