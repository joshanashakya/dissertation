/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;// import java.math.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Main{	public static void main (String[] args) throws java.lang.Exception	{		// your code goes here		try{            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            PrintWriter ot=new PrintWriter(System.out);            int t=1;//Integer.parseInt(br.readLine().trim());            // int total=0;            while(t-->0)            {                String s=br.readLine().trim();                int n=s.length();                int ind=n-1;                for(int i=0;i<n;i++)                {                    if(s.charAt(i)=='0')                    {                        ind=i;                        break;                    }                }                ot.println(s.substring(0,ind)+s.substring(ind+1,n));            }            ot.close();            br.close();                    } catch(Exception e){            e.printStackTrace();            return;        }    }}    