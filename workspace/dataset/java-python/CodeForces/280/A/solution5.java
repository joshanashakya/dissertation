import java.io.*;import java.util.*; public class practice {	static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } 		public static void main(String[] args) {						FastReader scn=new FastReader();			double l=scn.nextDouble(),b=scn.nextDouble(),a=scn.nextDouble(),sol,t,pi=Math.acos(-1.0);			if(l>b){				t=l;l=b;b=t;			}			if(a==90){				sol=l*l;System.out.println(sol);return;			}			sol=l*b;			l=l/2.0;b=b/2.0;			if(a>90)a=180.0-a;			a=a*pi/180.0;			double c =(pi-a)/2;			double t1=l-b/Math.tan(c);			sol-= t1*t1*Math.tan(a);			double t2=b-l/Math.tan(c);			sol-= t2*t2*Math.tan(a);			if(t1<0){				sol=(l/Math.tan(a)+l/Math.tan(c))*l*4.0;			}			System.out.println(sol);					}}