import java.util.*;import java.util.Arrays;public class Main{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int count=0,less=0,zero=0;        for(int i=0;i<n;i++)        {            int a=sc.nextInt();            if(a>0)            {                count++;            }            else if(a<0)            {                less++;            }            else            {                zero++;            }        }        int c=0;        if(n%2==0)        {            c=n/2;        }        else        {            c=(n/2) +1;        }        if(count>=c)        {            System.out.println("1");        }        else if(less>count && less>=c)        {            System.out.println("-1");        }        else        {            System.out.println("0");        }    }}