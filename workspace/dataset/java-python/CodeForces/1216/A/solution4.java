  import java.util.*;import java.io.*;public class A{    public static FastReader sc=new FastReader();        public static PrintWriter  out = new PrintWriter(System.out);         public static void taskSolver(){        int n=sc.nextInt();      char ch[]=sc.next().toCharArray();int count=0;      for(int i=0;i<n;i+=2){         if(ch[i]==ch[i+1]){             count++;             if(ch[i]=='a')ch[i]='b';             else ch[i]='a';         }      }      out.println(count);      for(char ch1:ch)out.print(ch1);      out.println();    }          public static void main(String args[]) throws java.lang.Exception{                         taskSolver();           out.close();        }           static  class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }         String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }         int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }         String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      } 