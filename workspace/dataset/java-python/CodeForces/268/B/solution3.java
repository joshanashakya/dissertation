import java.util.*; public class Example {    static int[] dp;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        //  int t=sc.nextIn        //  t        int  n =sc.nextInt();        long sum=0;     for(int i=1;i<=n-1;i++){         sum+=(n-i)*i;     }     sum+=n;        System.out.println(sum);      }     private static long Gcd(long a, long b) {        if (b == 0)            return a;        else            return Gcd(b, a % b);    } }	  	      		  			  	   			 				
