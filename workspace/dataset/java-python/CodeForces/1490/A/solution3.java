import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = new int[55];
		while(t-- > 0) {
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
			}
			int res = 0;
			for(int i=2;i<=n;i++) {
				int max = Math.max(a[i], a[i-1]);
				int min = Math.min(a[i], a[i-1]);
				while(max/(min*1.0)>2) {
					min *= 2;
					res++;
				}
			}
			System.out.println(res);
		}
	}
}

	     	 		 	  		  	  	 	 		 		
