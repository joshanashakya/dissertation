// Created by Whiplash99import java.io.*;import java.util.*;public class C{    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    static StringBuilder sb2=new StringBuilder();    static int solve(ArrayDeque<Integer> Q, int type) throws IOException    {        sb2.setLength(0);        int N=Q.size();        if((N&1)==1)            N--;        int copy=N;         while(Q.size()>1)        {            while(copy-->0)            {                int tmp = Q.poll();                int tmp2 = Q.poll();                 sb2.append("? ").append(tmp).append(" ").append(tmp2).append("\n");                System.out.println(sb2);                System.out.flush();                sb2.setLength(0);                char ch = br.readLine().trim().charAt(0);                 if (type == 1)                {                    if (ch == '>')                        Q.addLast(tmp);                    else                        Q.addLast(tmp2);                } else                {                    if (ch == '<')                        Q.addLast(tmp);                    else                        Q.addLast(tmp2);                }                copy-=2;            }             N=Q.size();            copy=N;            if((copy&1)==1)                copy--;        }        return Q.poll();    }    public static void main(String[] args) throws IOException    {          int i,N;         int T=Integer.parseInt(br.readLine().trim());        StringBuilder sb=new StringBuilder();         ArrayDeque<Integer> Q1,Q2;         Q1=new ArrayDeque<>();        Q2=new ArrayDeque<>();        while(T-->0)        {            N=Integer.parseInt(br.readLine().trim());            Q1.clear();            Q2.clear();             for(i=2;i<=N;i+=2)            {                sb.append("? ").append(i-1).append(" ").append(i).append("\n");                System.out.println(sb);                System.out.flush();                sb.setLength(0);                char ch=br.readLine().trim().charAt(0);                 if(ch=='>')                {                    Q1.addLast(i-1);                    Q2.addLast(i);                }                else                {                    Q1.addLast(i);                    Q2.addLast(i-1);                }            }            if((N&1)==1)            {                Q1.addLast(N);                Q2.addLast(N);            }             int max=solve(Q1,1);            int min=solve(Q2,2);             sb.append("! ").append(min).append(" ").append(max).append("\n");            System.out.println(sb);            System.out.flush();            sb.setLength(0);        }    }}
