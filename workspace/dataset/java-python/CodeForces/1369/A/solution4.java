import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer;import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.HashSet;import java.util.LinkedList;import java.util.List;import java.util.Map;import java.util.Set; public class Main {     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }        public static void main(String[] args)     {         	FastReader sc = new FastReader();int t= sc.nextInt();while(t-->0) {	int a = sc.nextInt();	if ((a-4)%4== 0)System.out.println("YES");	else System.out.println("NO");	}     } } 
