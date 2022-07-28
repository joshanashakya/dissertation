import java.util.Scanner;

public class Problem1493A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ans = (n-k)+k/2;
			System.out.println(ans);
			for(int i= k+1;i<=n;++i) {
				System.out.print(i+" ");
			}
			//for odd
			for(int i=(k+1)/2;i<k;++i) {
				System.out.print(i+" ");
			
			System.out.println();
		}

	}
	}

}

