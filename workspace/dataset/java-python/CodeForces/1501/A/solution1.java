import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			
			int[] a = new int[n+1];
			int[] b = new int[n+1];
			
			int[] tm = new int[n+1];
			
			for(int i=1; i<=n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			for(int i=1; i<=n; i++) {
				tm[i] = sc.nextInt();
			}
			
			int ans = 0, at = 0, dt = 0;
			
			for(int i=1; i<n; i++) {
				int rt = a[i] - b[i-1];
				int wt = (b[i] - a[i] + 1) / 2;
				
				at = dt + rt + tm[i];
				
				if(b[i] - at >= wt)	dt = b[i];
				else	dt = at + wt;
			}
			
			ans = a[n] - b[n-1] + dt + tm[n];
			
			System.out.println(ans);
		}
		
		sc.close();
	}

}

