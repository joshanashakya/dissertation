import java.io.*;import java.util.*;import java.text.*;import java.math.*;import java.util.regex.*; public class Endsem {    public static void main(String[] args)    {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int[] arr=new int[n];        int sum=0,sum1=0;        if(n>=1&&n<=100)        {            for(int i=0;i<n;i++)            {                 int a=sc.nextInt();                 if(a>=1&&a<=100)                  arr[i]=a;               }            int max=0;            for(int i=0;i<n;i++)            {                if(max<=arr[i])                    max=arr[i];                sum+=arr[i];            }            int x=max;            while(true)            {                sum1=0;                for(int j=0;j<n;j++)                {                    sum1+=(x-arr[j]);                }                if(sum1>sum)                {                    System.out.println(x);                    break;                }                else                    x++;                            }        }    } }  		 			  	 		  	 	   	    		 	