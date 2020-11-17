import java.util.Scanner;
class Queue{
	int [] q;
	int front=0;
	int rear=-1;
	int size;
	int pop;
	
	Queue() {
	}
	Queue(int N) {
		q=new int[N];
	}
	public void push(int x) {
		q[++rear]=x;
	}
	public int size() {
		return (rear-front+1);
	}
	public boolean empty() {
		if(size()==0) return true;
		else return false;
	}
	public int pop() {
		if (empty()) return -1;
		else return q[front++];
	}
	public int front() {
		if (empty()) return -1;
		else return q[front];
	}
	public int back() {
		if (empty()) return -1;
		else return q[rear];
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();		
		Queue q=new Queue(N);

		for(int i=0;i<N;i++) {
			String a=scan.next();
			if(a.equals("push")) {
				int x;
				x=scan.nextInt();
				q.push(x);
			}
			else if(a.equals("pop")) {
				System.out.println(q.pop());
			}
			else if(a.equals("size")) {
				System.out.println(q.size());
			}
			else if(a.equals("empty")) {
				System.out.println(q.empty()?1:0);
			}
			else if(a.equals("front")) {
				System.out.println(q.front());
			}
			else if(a.equals("back")) {
				System.out.println(q.back());
			}
		}

	}

}
