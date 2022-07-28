import java.util.*;

public class A {
 
	public static void main(String[] args) {
		Scanner fs=new Scanner(System.in);
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			int a=fs.nextInt(), b=fs.nextInt();
			int best=Integer.MAX_VALUE;
			for (int times=0; times<30; times++) {
				best=Math.min(best, times+count(a, b+times));
			}
			System.out.println(best);
		}
	}
	
	static int count(int a, int b) {
		if (b==1) return 1_000_000_000;
		int c=0;
		while (a!=0) {
			a/=b;
			c++;
		}
		return c;
	}
}
