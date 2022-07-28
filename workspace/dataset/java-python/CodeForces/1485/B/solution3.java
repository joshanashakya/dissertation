import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt(), q = sc.nextInt(), k = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)	a[i] = sc.nextInt();
		
		while(q-- > 0) {
			int l = sc.nextInt(), r = sc.nextInt();
			
			int ans = k + a[r-1] - a[l-1] - 2*(r - l) - 1;
						
			System.out.println(ans);
		}
		
		
		
		sc.close();
	}

}

