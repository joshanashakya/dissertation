import java.util.*; public class questionCF { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);								int n=sc.nextInt();		int k=sc.nextInt();		int t=sc.nextInt();				 if (t < k) {		      System.out.print(t);		    } else if (t >= k && t <= n) {		    	System.out.print(k);		    } else {		    	System.out.print(k - (t - n));		    }			}}		