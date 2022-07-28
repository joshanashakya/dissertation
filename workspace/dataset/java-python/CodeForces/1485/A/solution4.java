import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			
			int ans = Integer.MAX_VALUE;
			
			for(int i=0; i*i<=a; i++) {
				if(b == 1 && i == 0)	continue;
				int count = i;
				int c = a;
				while(c > 0) {
					c = c/(b+i);
					count++;
				}
				
				ans = Math.min(ans, count);
			}
			
			System.out.println(ans);
		}
		
		sc.close();
	}

}

