import java.util.*;public class P2 { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int t =sc.nextInt();				while(t-->0) {			int a=sc.nextInt();			int b=sc.nextInt();			int x=sc.nextInt();			int y=sc.nextInt();			int f=Math.max(x, a-x-1);			int sum=f*b;					int s=Math.max(y, b-y-1);			int sum2=s*a;			int r=Math.max(sum2, sum);			System.out.println(r);		} 	}}