// Don't place your source in a packageimport java.util.*;import java.lang.*;import java.io.*;import java.math.*;      // Please name your class Mainpublic class Main {    static Scanner in = new Scanner(System.in);    public static void main (String[] args) throws java.lang.Exception {        PrintWriter out = new PrintWriter(System.out);         int T=Int();        for(int t=0;t<T;t++){            int p=Int();int f=Int();            int cnt1=Int();int cnt2=Int();            int s=Int();int w=Int();            Solution sol=new Solution();            sol.solution(out,p,f,cnt1,cnt2,s,w);         }        out.flush();     }     public static long Long(){        return in.nextLong();    }    public static int Int(){        return in.nextInt();    }    public static String Str(){        return in.next();    }}  class Solution{     public void solution(PrintWriter out,long p,long f,long cnt1,long cnt2,long w1,long w2){        long res=0;        long dp[]=new long[(int)(cnt1)+1];//player1 : take i : w1        Arrays.fill(dp,-1);         for(int i=0;i<dp.length;i++){            long remain=p-i*w1;            if(remain<0)break;            dp[i]=Math.min(remain/w2,cnt2);        }         for(int i=0;i<dp.length;i++){            if(dp[i]==-1)break;            long take1=i+dp[i];            long take2=0;            long remain1=cnt1-i;            long remain2=cnt2-dp[i];             PriorityQueue<long[]>pq=new PriorityQueue<>((a,b)->{                return Long.compare(a[0],b[0]);            });            pq.add(new long[]{w1,remain1});            pq.add(new long[]{w2,remain2});             long F=f;            while(pq.size()>0&&f>0){                long top[]=pq.poll();                 long count=F/top[0];                long take=Math.min(top[1],count);                take2+=take;                F=F-take*top[0];            }             res=Math.max(res,take1+take2);        }        System.out.println(res);    }     } 
