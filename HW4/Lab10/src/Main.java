import java.util.Scanner;
public class Main {
	static int histo(int[] v, int a, int b) {
		if (a==b) {
			return v[b];
		}
		
		int c=(a+b)/2, r=2;
		int min;
		if(v[c]<v[c+1]) min=v[c];
		else min=v[c+1];
		
		int max=min*r;
		
		int i=c-1, j=c+2;
		while(i>=a && j<=b) {
			if(v[i]>v[j]) {
				if(v[i]<min) {
					min=v[i--]; 
					if(max<min*(++r)) {
						max=min*r;
					}
				}
			}
			else {
				if(v[j]<min) {
					min=v[j++]; 
					if(max<min*(++r)) {
						max=min*r;
					}
				}
			}
		}	
		while(i>=a){
			if(v[i]<min) {
				min=v[i--];
				if(max<min*(++r)) {
					max=min*r;
				}
			}
		}
		while(j<=b){
			if(v[j]<min) {
				min=v[j]; i++;
				if(max<min*(++r)) {
					max=min*r;
				}
			}
		}

		return max;
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			int n=scan.nextInt();
			int [] v=new int[n];
			if(n==0) break;
			for(int i=0;i<n;i++) {
				v[i]=scan.nextInt();
			}
			int r=histo(v,0,n-1);
			System.out.println(r);
		}
	}
}
