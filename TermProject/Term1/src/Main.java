import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("N ���� �Է��ϼ��� : "); 
		int N=scan.nextInt();
		System.out.println("a ���� �Է��ϼ��� : "); 
		int a=scan.nextInt();
		System.out.println("b ���� �Է��ϼ��� : ");
		int b=scan.nextInt(); scan.close();
		
		
		int[]array=new int[N];
		int max=(a-1); // array[a-1]=a��° ���̹Ƿ� max=a-1�� ����
		int min=(a-1);
		
		Random rand=new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i=0;i<N;i++) {
			array[i]=rand.nextInt(1000);
			System.out.println(array[i]);
			
			for(int j=a-1;j<b;j++){
				if(array[max]<array[j]) {
					max=j;
				}
			}
			for(int k=a-1;k<b;k++) {
				if(array[min]>array[k]) {
					min=k;
				}
			}
		}
		System.out.println("�ִ밪 : "+array[max]);
		System.out.println("�ּҰ� : "+array[min]);
		System.out.println("�ִ밪+�ּҰ� : "+(array[min]+array[max]));	
	}
		
}