import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int j=0;j<t;j++) {
			int n=s.nextInt();
			int k=s.nextInt();
			int c=n-k;
			c=c+k/2;
			System.out.println(c);
			for(int i=k+1;i<=n;i++) {
				System.out.print(i+" ");
			}
			for(int i=k-1;i>=(k+1)/2;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
 
	}
}
