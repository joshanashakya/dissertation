  import java.util.*;import java.io.*;public class A{    public static FastReader sc=new FastReader();        public static PrintWriter  out = new PrintWriter(System.out);         public static void taskSolver(){        int n=sc.nextInt();     int arr[]=new int[n];     for(int i=0;i<n;i++)arr[i]=sc.nextInt();     int min=Integer.MAX_VALUE;     for(int i=0;i<n;i++){         int num=arr[i];int coins=0;         for(int j=0;j<n;j++){             if(num%2==0){                 if(arr[j]%2!=0)coins++;             }             else{                if(arr[j]%2==0)coins++;              }         }         min=Math.min(min,coins);     }     out.println(min);    }          public static void main(String args[]) throws java.lang.Exception{                         taskSolver();           out.close();        }           static  class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }         String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }         int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }         String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      } 