import java.util.*;public class bank{    public static void main(String[] args){        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();       int sum=0;       if(n>=100)       {           int temp=n/100;           sum=sum+temp;           n=n-(temp*100);       }       if(n>=20)       {           int temp=n/20;           sum=sum+temp;           n=n-(temp*20);       }       if(n>=10)       {           int temp=n/10;           sum=sum+temp;           n=n-(temp*10);       }        if(n>=5)       {           int temp=n/5;           sum=sum+temp;           n=n-(temp*5);       }        if(n>=1)       {           int temp=n/1;           sum=sum+temp;           n=n-(temp*1);       }       System.out.println(sum);           }}