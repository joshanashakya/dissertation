 import java.util.*;  public class Practise {     //public static int[][] dp;    // static int[] dp;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int  k= sc.nextInt();        String s = sc.next();        StringBuilder asn =new StringBuilder("");        if(n==1 && k==1)            System.out.println(0);        else if(k==0)            System.out.println(s);        else        {            if(s.charAt(0)!='1')            k=k-1;            asn.append("1");            for(int i=1;i<s.length();i++){                if(k>0 && s.charAt(i)!='0')                {                    asn.append("0");                    k--;                }                else                        asn.append(s.charAt(i));             }            System.out.println(asn);        }     }     private static boolean checkPrime(int n) {        for (int i = 2; i * i <= n; i++) {            if (n % i == 0)                return false;        }        return true;     }}        			  	    				       	 		 	
