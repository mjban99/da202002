import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("N 값을 입력하세요 : "); 
		int N=scan.nextInt();
		System.out.println("a 값을 입력하세요 : "); 
		int a=scan.nextInt();
		System.out.println("b 값을 입력하세요 : ");
		int b=scan.nextInt(); scan.close();
		
		
		int[]array=new int[N];
		int max=(a-1); // array[a-1]=a번째 값이므로 max=a-1로 설정
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
		System.out.println("최대값 : "+array[max]);
		System.out.println("최소값 : "+array[min]);
		System.out.println("최대값+최소값 : "+(array[min]+array[max]));	
	}
		
}