import java.util.*;import java.lang.String;import java.lang.Math;import java.util.Arrays; public class Capitalization2{          public static void main(String[] args)    {        Scanner sc=new Scanner(System.in);       int t;     t=sc.nextInt();     for(int i=0;i<t;i++)     {         int n,d;         n=sc.nextInt();         d=sc.nextInt();         int netres=0;         int [] a=new int[n];         int [] res=new int [n];         for(int j=0;j<n;j++)         {             a[j]=sc.nextInt();             if(a[j]<=d)             {                                  res[netres]=a[j];                 netres++;             }         }                      if(netres==0||netres==1)         System.out.println("NO");         else if(netres==n)         System.out.println("YES");         else         {             Arrays.sort(res,0,netres);                          if((res[0]+res[1])<=d)             {                 System.out.println("YES");             }             else             {                 System.out.println("NO");             }                      }     }                  }                   }                                                                                                                 
