import java.util.*;public class Main{       public static void main(String args[])    {        	 Scanner s=new Scanner(System.in);       int T=s.nextInt();       for(int t=0;t<T;t++)       {           int n=s.nextInt();           int a=s.nextInt();           int b=s.nextInt();           int c=s.nextInt();           int d=s.nextInt();           if(Math.abs(a-b)*n<=c+d && (a+b)*n>=Math.abs(c-d))           {               System.out.println("YES");           }           else           System.out.println("NO");       }              }        }   