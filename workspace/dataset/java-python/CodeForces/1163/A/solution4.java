import java.util.*;import java.util.Arrays;public class Main{    public static void main (String[] args)      {          Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int m=sc.nextInt();        if(m ==0)        {            System.out.println("1");        }        else if(n-m==0)        {            System.out.println("0");        }        else        {            int k=Math.min(m,n-m);            System.out.println(k);        }    }  } 
