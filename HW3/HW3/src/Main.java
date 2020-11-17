import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Node<stack>{
	public stack value;
	public Node<stack> prev;
	public Node<stack> next;
}
class Stack<stack>{
	Node<stack> root;
	Stack(){
		root=new Node();
		root.prev=root;
		root.next=root;
	}
	public void add(stack k) {
		Node<stack> newNode = new Node();
		newNode.value=k;
		newNode.prev=root;
		newNode.next=root.next;
		root.next.prev=newNode;
		root.next=newNode;
	}
	public void remove() {
		Node<stack> tmp=root.prev;
		tmp.prev.next=root;
		root.prev=tmp.prev;
	}
}

public class Main {

	public static void main(String[] args) {

		// 스택과 큐를 생성하고 큐에 n을 입력받아 큐에 n개의 랜덤한 숫자들을 넣습니다.
		Random rand=new Random(10000);
		System.out.println("n 값을 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] queue = new int[n];
		int tail=0, head=0;
		for(int i=0; i<n; i++) {
			queue[tail]=rand.nextInt(10000)+0;
			System.out.println(queue[tail]);
			tail++;
		}
		
		int[] st=new int[n];
		int top=-1;
		for(int j=0;j<n;j++) {
			st[top]=rand.nextInt(10000)+0;
			System.out.println(st[top]);
			top++;
		}
		
		int[] data=new int[1024];
		
		Stack<Integer> stack = new Stack();
		while(head!=tail && (queue[head]>st[top])) {
			int	v=queue[head];
			int w=st[top];
			while(top!=-1) {
				if(w<v) {
					queue[tail++]=w;
					stack.add(st[top]);
					stack.remove();
					top--;
				}
				else {
					st[top++]=v;
				}
				
				for(int m=top;m<1;m--) {
					System.out.print(st[m]);
				}
				
			}
			
			break;
		}
	}
}