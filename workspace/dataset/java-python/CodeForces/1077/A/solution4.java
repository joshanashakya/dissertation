 import java.util.ArrayList;import java.util.Scanner;  public class ForgJumping {         public static void main(String[] args) {                Scanner scan = new Scanner (System.in);             int cases=scan.nextInt();long a,b,k;long x=0;ArrayList <Long> results=new ArrayList();for(int i=0;i<cases;i++){ a=scan.nextLong();b=scan.nextLong();k=scan.nextLong();if(k%2==0)x=(a*(k/2)-b*(k/2));elsex=(a*(k/2+1)-b*(k/2));results.add(x);x=0;}for(int i=0;i<results.size();i++)System.out.println(results.get(i));       }    }
