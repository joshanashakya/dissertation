import java.util.*;public class arrival{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int a[]=new int[n];        int c1=0,c2=0,d1=1000,d2=0;        for(int i=0;i<n;i++)        {            a[i]=sc.nextInt();            if(a[i]>c1)            {                c1=a[i];                c2=i;            }            if(a[i]<=d1)            {                d1=a[i];                d2=i;            }        }        if(d2>c2)        System.out.println(c2+n-1-d2);        else        System.out.println(c2+n-2-d2);                    }}