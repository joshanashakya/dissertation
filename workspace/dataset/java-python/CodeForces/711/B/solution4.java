import java.util.*;import java.lang.*;// import java.math.*;import java.io.*;public class Main{    public static long sum=0;    public static int x=-1,y=-1;    public static void main (String[] args) throws java.lang.Exception	{        // your code goes here		try{            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            PrintWriter ot=new PrintWriter(System.out);            int t=1;//Integer.parseInt(br.readLine().trim());            // int total=0;            while(t-->0)            {                String ss[]=br.readLine().trim().split(" ");                int n=Integer.parseInt(ss[0]);                if(n==1)                ot.println(3);                else                {                     long a[][]=new long[n][n];                    for(int i=0;i<n;i++)                    {                        String s[]=br.readLine().trim().split(" ");                        for(int j=0;j<n;j++)                        {                            a[i][j]=Long.parseLong(s[j]);                            if(a[i][j]==0)                            {                                x=i;                                y=j;                            }                        }                    }                    if(x==0)                    {                        for(int i=0;i<n;i++)                        sum+=a[1][i];                    }                    else                    {                        for(int i=0;i<n;i++)                        sum+=a[0][i];                    }                    long sum_of_empty=0;                    for(int i=0;i<n;i++)                    sum_of_empty+=a[x][i];                        long ans=sum-sum_of_empty;                    a[x][y]=ans;                                        if(!check(a,n)||ans<=0)                    ot.println(-1);                    else                    ot.println(ans);                                    }            }            ot.close();            br.close();                    } catch(Exception e){            e.printStackTrace();            return;        }    }    public static boolean check(long a[][],int n){        long row=0;        for(int i=0;i<n;i++)        {            row+=a[i][0];        }        for(int i=1;i<n;i++)        {            long summ=0;            for(int j=0;j<n;j++)            summ+=a[j][i];                        if(summ!=row)            return false;        }        long col=0;        for(int i=0;i<n;i++)        col+=a[0][i];        for(int i=1;i<n;i++)        {            long summ=0;            for(int j=0;j<n;j++)            {                summ+=a[i][j];            }            if(summ!=col)            return false;        }        long diag=0;        for(int i=0;i<n;i++)        diag+=a[i][i];        if(diag!=row)        return false;        diag=0;        for(int i=0;i<n;i++)        diag+=a[i][n-i-1];        if(diag!=row)        return false;        return true;    }}    