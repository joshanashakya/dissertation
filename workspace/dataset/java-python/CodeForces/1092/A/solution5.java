  import java.util.*;import java.io.*;  public class A{    public static void taskSolver(FastReader sc){    int n=sc.nextInt();    int k=sc.nextInt();       String s="";int x=0;       for(int i=1;i<=k;i++){           char ch=(char)('a'+x);           s=s+ch;           x++;       }       String s1=s;       int y=n/k;y--;       for(int z=1;z<=y;z++){           s=s+s1;       }       for(int i=1;i<=n%k;i++)s=s+'a';       System.out.println(s);    }    public static void main(String args[]){       FastReader sc=new FastReader();        int t=sc.nextInt();        while(t-->0){                 taskSolver(sc);        }   }     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }           }  