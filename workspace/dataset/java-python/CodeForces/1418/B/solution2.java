import java.util.*;public class LnUL{    public static void main(String args[])    {        Scanner in=new Scanner(System.in);        int t=in.nextInt();        int i,j;        while(t-->0)        {            int n=in.nextInt();            int a[]=new int[n];            int l[]=new int[n];            int b[]=new int[n];            for(i=0;i<n;i++)            {                a[i]=in.nextInt();                b[i]=a[i];            }            int c=0;            for(i=0;i<n;i++)            {                l[i]=in.nextInt();                if(l[i]==0)                c++;            }            int u[]=new int[c];            int p=0;            for(i=0;i<n;i++)            {                if(l[i]==0)                u[p++]=a[i];            }            Arrays.sort(u);                        for(i=0;i<n;i++)            {                if(l[i]==1)                System.out.print(a[i]+" ");                else                System.out.print(u[--c]+" ");            }            System.out.println();        }    }}//https://codeforces.com/problemset/problem/1466/C    
