import java.util.*;public class Main{    public static void main(String[] args)    {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int m=sc.nextInt();        String[] s1=new String[n];        String[] s2=new String[m];        for(int i=0;i<n;i++)        {            s1[i]=sc.next();        }        for(int i=0;i<m;i++)        {            s2[i]=sc.next();        }        int q=sc.nextInt();        for(int i=0;i<q;i++)        {            int year=sc.nextInt();            int year1=year%n;            int year2=year%m;            if(year1==0)            {                year1=n;            }            if(year2==0)            {                year2=m;            }            System.out.println(s1[year1-1]+s2[year2-1]);        }    }}
