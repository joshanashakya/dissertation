import java.util.*;import java.util.Arrays;public class Main{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int first=0,second=1;        int[] a=new int[n+1];        int count=0;        for(int i=1;i<=n;i++)        {            int num=first+second;            if(num>n)            {                break;            }            a[i]=num;            count++;            first=second;            second=num;                   }        for(int i=1;i<=n;i++)        {            int flag=0;            for(int j=1;j<=count;j++)            {                if(i==a[j])                {                    flag=1;                    break;                }            }            if(flag==1)            {                System.out.print("O");            }            else            {                System.out.print("o");            }        }    }}