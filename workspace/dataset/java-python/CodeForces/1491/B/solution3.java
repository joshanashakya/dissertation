import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt(), u = sc.nextInt(), v = sc.nextInt();
			int[] a = new int[n];
			for(int i=0; i<n; i++)	a[i] = sc.nextInt();
			
			int ans = Integer.MAX_VALUE;
			
			for(int i=1; i<n; i++) {
				if(Math.abs(a[i] - a[i-1]) >= 2)	ans = 0;
				if(Math.abs(a[i] - a[i-1]) == 1)	ans = Math.min(ans, Math.min(u, v));
				if(Math.abs(a[i] - a[i-1]) == 0)	ans = Math.min(ans, Math.min(u, v) + v);
			}
			
			System.out.println(ans);
		}
		
		sc.close();
	}

}

