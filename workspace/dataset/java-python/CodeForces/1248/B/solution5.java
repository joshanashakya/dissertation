 import java.util.*;  public class Practise {     //public static int[][] dp;    // static int[] dp;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);   int n =sc.nextInt();    int[] arrr =new int[n];    for(int i=0;i<n;i++){        arrr[i]=sc.nextInt();     }    Arrays.sort(arrr);    long a= 0;    long b=0;    for(int i=0;i<n;i++){        if(i<n/2)            a+=arrr[i];        else            b+=arrr[i];    }long ans= a*a+b*b;        System.out.println(ans);     }     private static boolean checkPrime(int n) {        for (int i = 2; i * i <= n; i++) {            if (n % i == 0)                return false;        }        return true;     }}         		 		  			    	  		 	    	