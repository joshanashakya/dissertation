import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		while(test!=0) {
			int n=s.nextInt();
			int k=s.nextInt();
			int count=n-k;
			count+=k/2;
			System.out.println(count);
			for(int i=k+1;i<=n;i++) {
				System.out.print(i+" ");
			}
			for(int i=k-1;i>=(k+1)/2;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
			test--;
		}

	}

}

