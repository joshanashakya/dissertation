import java.io.*;import java.util.*;import java.lang.*;    public class aim    {        public static void main(String args[])throws IOException            {            Scanner sc = new Scanner(System.in);                   int n = sc.nextInt();                   int m=sc.nextInt();                                      int k=sc.nextInt();                   int l=sc.nextInt();                   int a[]=new int[n];                   int b[]=new int[m];                   for(int i=0;i<n;i++)                   a[i]=sc.nextInt();                   for(int i=0;i<m;i++)                   b[i]=sc.nextInt();                                      if(a[k-1]<b[m-l])                   System.out.println("YES");                   else                    System.out.println("NO");                                }            }