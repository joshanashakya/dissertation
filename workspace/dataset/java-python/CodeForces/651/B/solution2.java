import java.util.*;import java.lang.*;import java.math.BigInteger;// import java.math.*;import java.io.*;public class Main{        public static void main (String[] args) throws java.lang.Exception	{        // your code goes here		try{            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            PrintWriter ot=new PrintWriter(System.out);            int t=1;//Integer.parseInt(br.readLine().trim());            // int total=0;            while(t-->0)            {                int n=Integer.parseInt(br.readLine().trim());                int a[]=new int[n];                boolean bool[]=new boolean[n];                String s[]=br.readLine().trim().split(" ");                for(int i=0;i<n;i++)                a[i]=Integer.parseInt(s[i]);                Arrays.sort(a);                int count=0;                for(int i=0;i<n;i++)                {                    bool[i]=true;                    for(int j=i;j<n;j++)                    {                        if(a[j]>a[i]&&bool[j]==false)                        {                            bool[j]=true;                            count++;                            break;                        }                    }                }                ot.println(count);            }                         ot.close();            br.close();                    } catch(Exception e){            e.printStackTrace();            return;        }    }    }    
