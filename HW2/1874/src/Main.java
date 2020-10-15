import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt(); // 배열의 크기로 사용될 N을 입력받아 지정한다.
        int[] a = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = scan.nextInt();
        } // 지정한 N개의 숫자 만큼 배열에 입력 받는다.
        String s = str(a);
        System.out.println(s); // 답(=str(a))을 출력한다.
    }
    
    public static String str(int[] a) {
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num = 1; // 자연수이므로 적어도 1부터 시작하므로, num을 1로 초기화
        for(int i=0; i<a.length; i++) {
            int n = a[i]; // n은 입력받은 수열의 수.
// num이 입력받은 수보다 작을 경우, push를 이용하여 n을 증가시킨다.
            if(num <= n) { 
                while(num <= n) {
                    stack.push(num++);
                    sb.append("+\n"); // push일 경우 + 출력
                    if(num > n) {
                        stack.pop();
                        sb.append("-\n"); // pop일 경우 - 출력
                    }
                }
            }
// num이 입력받은 수보다 크다는 의미는 만들어야 하는 입력받은 수가 이미 스택에 들어가 있을 때의 경우이므로,
            else {
                int k = stack.pop();
                if(k > n) {
                    return "NO";
                } // 답이 될 수 없는 경우에는 NO 출력
                else {
                    sb.append("-\n");
                }
            }
        }
        return sb.toString(); // 완성된 수열을 return 한다.
    }
}