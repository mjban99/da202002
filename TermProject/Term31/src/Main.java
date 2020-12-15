import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {
	static void minmaxsum(int[] v, int n, int[] a, int[] b, int k, int[] rmin, int[] rmax, long[] rsum) {
		for(int t=0; t<k; t++) {
			
			int min=v[a[t]-1];
			int max=v[a[t]-1];
			for(int i=a[t]; i<b[t]; i++) {
				if(min>v[i]) min=v[i];
				if(max<v[i]) max=v[i];
			}
			int[] sum=new int[n+1];
			sum[0]=0;
			for(int i=1; i<(n+1); i++) {
				sum[i]+=v[i-1];
			}
			sum[t]=sum[b[t]]-sum[a[t]-1];
			
			rmin[t]=min;
			rmax[t]=max;
			rsum[t]=sum[t];
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand= new Random(1000);
		int n=scan.nextInt();
		int []v=new int[n];
		for(int i=0; i<n; i++) v[i]=rand.nextInt();
		int k = scan.nextInt();
		// 구간 a,b
		int[] a=new int[k];
		int[] b=new int[k];
		for(int i=0; i<k; i++) {
			int x=rand.nextInt(n);
			int y=rand.nextInt(n);
			if(x<y) {
				a[i] = x; b[i]=y;
			}
			else {
				a[i]=y; b[i]=x;
			}
		}
		int[] min=new int[k];
		int[] max=new int[k];
		long[] sum=new long[k];
		
		long t= System.currentTimeMillis();
		minmaxsum(v, n, a, b, k, min, max, sum);
		t=System.currentTimeMillis()-t;
		
		for(int i=0; i<k; i++) {
			System.out.println((i+1)+"번째 구간 : "+"최소값 "+min[i]+" 최대값 "+max[i]+" 합계 "+sum[i]);
		}
		System.out.println("elapsed time is "+t+" 초");
	}
}