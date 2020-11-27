import java.util.Random;
import java.util.Scanner;
// K 개의 랜덤으로 생성한 구간을 한 다음에 생성 최대 최소 구하기.

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("N 값을 입력하세요 : "); 
		int N=scan.nextInt();
		System.out.println("K 값을 입력하세요 : ");
		int K=scan.nextInt();
	
		long t=System.currentTimeMillis();
		
		
		// 구간의 처음과 끝을 잡을 두개의 숫자 랜덤으로 K 번 생성.
		
		for(int c=0;c<K;c++) {
			double randomValue=Math.random();
			int rand1=(int)(randomValue*N);
			System.out.println("rand1:"+rand1);
			int rand2= (int)(randomValue*(N-rand1+1))+rand1;
			System.out.println("rand2:"+rand2);
		
			int[]array=new int[N];
			int max = rand1; // array[rand1-1]=rand1번째 값이므로 max=rand1-1로 설정
			int min = rand1;
		
		Random rand=new Random();
		rand.setSeed(System.currentTimeMillis());
		
		// N 개의 데이터를 랜덤으로 생성.
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
		System.out.println("최대값 : "+array[max]);
		System.out.println("최소값 : "+array[min]);
		System.out.println("최대값+최소값 : "+(array[min]+array[max]));	
		}
		
		long elapsed = System.currentTimeMillis()-t;
		System.out.println("Elaplsed : "+elapsed);
		
	}
		
}