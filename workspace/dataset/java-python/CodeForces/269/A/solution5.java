import java.util.*;import java.io.*; public class magicalboxes{	public static void main(String[] args) {		FastReader sc=new FastReader();		int n=sc.nextInt();        int xx = 0;        for (int i = 0; i < n; i++) {            int k = sc.nextInt();            int a = sc.nextInt();            int m = k + 1;            if (a > 1) {                int yy = 0;                int bb = 1;                while (bb < a) {                    bb *= 4;                    yy++;                }                 m = yy + k;            }            xx = Math.max(m,xx);         }        System.out.println(xx);    }}class FastReader {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         } }
