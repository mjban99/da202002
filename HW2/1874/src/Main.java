import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt(); // �迭�� ũ��� ���� N�� �Է¹޾� �����Ѵ�.
        int[] a = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = scan.nextInt();
        } // ������ N���� ���� ��ŭ �迭�� �Է� �޴´�.
        String s = str(a);
        System.out.println(s); // ��(=str(a))�� ����Ѵ�.
    }
    
    public static String str(int[] a) {
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num = 1; // �ڿ����̹Ƿ� ��� 1���� �����ϹǷ�, num�� 1�� �ʱ�ȭ
        for(int i=0; i<a.length; i++) {
            int n = a[i]; // n�� �Է¹��� ������ ��.
// num�� �Է¹��� ������ ���� ���, push�� �̿��Ͽ� n�� ������Ų��.
            if(num <= n) { 
                while(num <= n) {
                    stack.push(num++);
                    sb.append("+\n"); // push�� ��� + ���
                    if(num > n) {
                        stack.pop();
                        sb.append("-\n"); // pop�� ��� - ���
                    }
                }
            }
// num�� �Է¹��� ������ ũ�ٴ� �ǹ̴� ������ �ϴ� �Է¹��� ���� �̹� ���ÿ� �� ���� ���� ����̹Ƿ�,
            else {
                int k = stack.pop();
                if(k > n) {
                    return "NO";
                } // ���� �� �� ���� ��쿡�� NO ���
                else {
                    sb.append("-\n");
                }
            }
        }
        return sb.toString(); // �ϼ��� ������ return �Ѵ�.
    }
}