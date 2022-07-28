import java.util.Scanner;

public class _0621BoboniuLikestoColorBalls {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		int w=sc.nextInt();
		int min= Math.min(r, Math.min(b, g));
		if(r%2==0 && g%2==0 && b%2==0) {
			System.out.println("YES");
		}
		else if(r%2!=0 && g%2!=0 && b%2!=0 && min>=1) {
			System.out.println("YES");
		}
		else {
			int count=0;
			if(r%2!=0) {
				count++;
			}
			if(g%2!=0) {
				count++;
			}
			if(b%2!=0) {
				count++;
			}
			if(count==2 && min>=1 && w%2!=0 ) {
				System.out.println("YES");
			}
			else if(count==1 && w%2==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		cases--;
		}
	}

}

