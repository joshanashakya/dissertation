/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;// import java.math.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Main{	public static void main (String[] args) throws java.lang.Exception	{		// your code goes here		try{            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            PrintWriter ot=new PrintWriter(System.out);            // int t=Integer.parseInt(br.readLine().trim());            // int total=0;            String ssp[]=br.readLine().trim().split(" ");            int n=Integer.parseInt(ssp[0]);            int m=Integer.parseInt(ssp[1]);            int r=Integer.parseInt(ssp[2]);            String sa[]=br.readLine().trim().split(" ");            int buy=Integer.MAX_VALUE;            // int temp=0;            for(int i=0;i<n;i++)            {                buy=Math.min(buy,Integer.parseInt(sa[i]));            }            String sb[]=br.readLine().trim().split(" ");            int sell=-1;            for(int i=0;i<m;i++)            {                sell=Math.max(sell,Integer.parseInt(sb[i]));            }            if(buy>=sell)            ot.println(r);            else            {                int stock=r/buy;                r=r%buy;                stock=stock*sell;                r+=stock;                ot.println(r);            }            ot.close();            br.close();                    } catch(Exception e){            e.printStackTrace();            return;        }    }}    