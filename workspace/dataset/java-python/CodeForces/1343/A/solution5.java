import java.util.Scanner; public class Candies { 	public static void main(String[] args) {	Scanner sc=new Scanner(System.in);	int t=sc.nextInt();		while(t>0)	{		System.out.println(solve(sc));		t--;	}	 } 	private static int solve(Scanner sc) {		int n=sc.nextInt();				int a=3;				for(int i=2;;i++)		{			int x=n/a;						if(x*a==n)				return x;						a=a+ (int)Math.pow(2,i);						}	}	 }
