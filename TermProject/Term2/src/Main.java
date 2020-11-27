import java.util.Random;
import java.util.Scanner;
// K ���� �������� ������ ������ �� ������ ���� �ִ� �ּ� ���ϱ�.

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("N ���� �Է��ϼ��� : "); 
		int N=scan.nextInt();
		System.out.println("K ���� �Է��ϼ��� : ");
		int K=scan.nextInt();
	
		long t=System.currentTimeMillis();
		
		
		// ������ ó���� ���� ���� �ΰ��� ���� �������� K �� ����.
		
		for(int c=0;c<K;c++) {
			double randomValue=Math.random();
			int rand1=(int)(randomValue*N);
			System.out.println("rand1:"+rand1);
			int rand2= (int)(randomValue*(N-rand1+1))+rand1;
			System.out.println("rand2:"+rand2);
		
			int[]array=new int[N];
			int max = rand1; // array[rand1-1]=rand1��° ���̹Ƿ� max=rand1-1�� ����
			int min = rand1;
		
		Random rand=new Random();
		rand.setSeed(System.currentTimeMillis());
		
		// N ���� �����͸� �������� ����.
		for(int i=0;i<N;i++) {
			array[i]=rand.nextInt(100000);
			System.out.println(array[i]);
			for(int j=(rand1+1);j<rand2;j++){
				if(array[max]<array[j]) {
					max=j;
				}
			}
			for(int m=(rand1+1);m<rand2;m++) {
				if(array[min]>array[m]) {
					min=m;
				}
			}	
		}
		System.out.println("�ִ밪 : "+array[max]);
		System.out.println("�ּҰ� : "+array[min]);
		System.out.println("�ִ밪+�ּҰ� : "+(array[min]+array[max]));	
		}
		
		long elapsed = System.currentTimeMillis()-t;
		System.out.println("Elaplsed : "+elapsed);
		
	}
		
}