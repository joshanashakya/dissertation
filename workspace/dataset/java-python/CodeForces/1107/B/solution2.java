import java.util.Scanner; public class _0707Digitalroot { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		long n=sc.nextLong();		for(int i=0;i<n;i++) {			long k=sc.nextLong();			long x=sc.nextLong();			System.out.println(((k-1)*9L)+x);		}	} }