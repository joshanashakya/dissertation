import java.nio.file.FileAlreadyExistsException;import java.sql.SQLOutput;import java.util.*; public class Example {    static int[] dp;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        //  int t=sc.nextInt        int  n=0;        String s =sc.next();        long nn = s.length();      if(nn==1 && s.charAt(0)=='1')          System.out.println(0);           else if(nn==1)          System.out.println(0);          else      {          if(s.lastIndexOf("1")==0)          System.out.println((int)Math.ceil((nn-1)/(double)2));          else              System.out.println((int)Math.ceil((nn)/(double)2));        }     }     private static long Gcd(long a, long b) {        if (b == 0)            return a;        else            return Gcd(b, a % b);    } }		 			 		 	   						 		   		 		