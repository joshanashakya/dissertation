import java.util.*;import java.io.*;import java.math.*;import java.lang.Math.*; public class Main {    public static void main (String[] args) throws Exception    {                Scanner sc=new Scanner(System.in);        int a=sc.nextInt();        int b=sc.nextInt();        int c=sc.nextInt();                int x=0;        if((c%a==0)||(c%b==0))        {            x=1;        }        else        {          for(int m=0;m<=10000;m++)        {            for(int n=0;n<=10000;n++)            {                if(m*a+n*b==c)                {                    x=1;                    break;                }                else if(m*a+n*b>c)                {                    break;                }            }            if(x==1)            {                break;            }        }        }        if(x==1)        System.out.println("Yes");        else        System.out.println("No");    }}