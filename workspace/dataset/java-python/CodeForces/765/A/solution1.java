import java.util.*;import java.util.Arrays;public class Main{    public static void main (String[] args)      {          Scanner sc=new Scanner(System.in);        int t=sc.nextInt();        String h=sc.next();        String[] d=new String[t];        for(int i=0;i<t;i++)        {            d[i]=sc.next();        }        if(t%2==0)        {            System.out.println("home");        }        else        {            System.out.println("contest");        }            }  } 
