/* The equuatons ar not lines     Handle corner cases  */  import java.io.*; import java.util.*; public class pt{     public static void main (String[] args)     {         FastReader sc=new FastReader();         PrintWriter out = new PrintWriter(System.out);                 int a = sc.nextInt();                 int b = sc.nextInt();                 int c = sc.nextInt();                          int a2 = sc.nextInt();                 int b2 = sc.nextInt();                 int c2 = sc.nextInt();                              if(a==0&&b==0&&a2==0&&b2==0)		{			if(c==0&&c2==0)				out.println("-1");			else				out.println("0");		}		else if(a*b2==b*a2)		{			if(c*b2==b*c2&&c*a2==a*c2)				out.println("-1");			else				out.println("0");		}		else		{			out.println("1");		}                                       out.flush();         }       static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()          {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }  }
