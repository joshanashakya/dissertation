import java.util.*; public class CodeForces{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        long n=sc.nextLong();        long arr[]=new long[(int)n];        long score=0;        for(int i=0;i<(int)n;i++)        {            arr[i]=sc.nextLong();            score+=arr[i];        }        Arrays.sort(arr);        long s=0;        long sum[]=new long[(int)n-1];        for(int i=(int)n-1;i>=1;i--)        {            s+=arr[i];            sum[i-1]=s;        }        for(int i=0;i<(int)n-1;i++)        {            score+=arr[i]+sum[i];        }        System.out.println(score);    }}
