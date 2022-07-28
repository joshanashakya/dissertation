import java.util.Scanner;

public class _0672AddandDivide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			long ans=Long.MAX_VALUE;
			long count=0;
			for(long i=0;i*i<=a;i++) {
				if(b==1 && i==0) {
					continue;
				}
				count=i;
				long c=a;
				
				while(c>0) {
					c=c/(b+i);
					count++;
				}
				ans=Math.min(ans, count);
			}
			System.out.println(ans);
			
			
			t--;
		}
	}

}

