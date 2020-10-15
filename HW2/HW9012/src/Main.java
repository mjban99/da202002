import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    
	public static boolean isValid(String str) {
		char[] stack = new char[1024];
		int top = -1;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				stack[++top] = ch;
			}
			else if(ch==')') {
				if(top==-1|| stack[top] != '(') return false;
				top--;
				
			}
		}
		return top==-1;
	}
	
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        Scanner scan=new Scanner(System.in);
        
        int T=scan.nextInt();
        
        for(int i=0; i<T; i++) {
            String abc = scan.next();
            if(isValid(abc)) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb.toString());

	}    
}