import java.util.*;import java.util.Arrays;public class Main{    public static void main (String[] args)      {          Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        long[] b=new long[n];        long rem=0;        for(int i=0;i<n;i++)        {            long a=sc.nextLong();            rem=rem+a;        }        for(int i=0;i<n;i++)        {            b[i]=sc.nextLong();        }                Arrays.sort(b);        long cap=b[n-1]+b[n-2];        if(rem>cap)        {            System.out.println("NO");        }        else        {            System.out.println("YES");        }            }  }         