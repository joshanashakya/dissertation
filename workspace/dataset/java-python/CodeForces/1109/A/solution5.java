import java.io.*;import java.util.*;public class Solution{    public static void main(String ag[])    {        Scanner sc=new Scanner(System.in);        int i,j,k;        int N=sc.nextInt();                long A[]=new long[N+1];        for(i=1;i<=N;i++)        {            A[i]=sc.nextLong();        }                HashMap<Long,Long> odd=new HashMap<>();        HashMap<Long,Long> even=new HashMap<>();                odd.put(0L,1L);        long xor=0;        long ans=0;        for(i=1;i<=N;i++)        {            xor^=A[i];            if(i%2==0)            {                if(odd.containsKey(xor))                {                    ans+=odd.get(xor);                    odd.put(xor,odd.get(xor)+1);                }                else                 {                    odd.put(xor,1L);                }            }            else             {                if(even.containsKey(xor))                {                    ans+=even.get(xor);                    even.put(xor,even.get(xor)+1);                }                else                 {                    even.put(xor,1L);                }             }        }        System.out.println(ans);    }}