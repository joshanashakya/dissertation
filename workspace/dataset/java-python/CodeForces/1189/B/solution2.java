import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;import java.util.*;  import java.io.*;  public class abc{     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      public static int gcd(int a,int b)    {        return b==0?a:gcd(b,a%b);    }     public static boolean isPrime(long n)    {        if(n==2)return true;        int i=2;        while(i*i<=n)        {            if(n%i==0) return false;            i++;        }        return true;    }        public static long[] remove(long n)    {        long res[]=new long[1000000000];        long rese=0;        int i=0;        while(n>0)        {            long dig=n%10;            n=n/10;            if(dig>0)            {                rese=dig;                	res[i++]=rese;            }        }        return res;    }     public static void main(String[] args)     {    	        FastReader ob=new FastReader();        int n = ob.nextInt();        ArrayList<Integer> al = new ArrayList<>();        for (int i = 0; i < n; i++) {            int x = ob.nextInt();            al.add(x);        }        Collections.sort(al);        if (al.get(n - 1) < al.get(n - 2) + al.get(n - 3)) {            System.out.println("YES");            for (int i = 0; i < n - 3; i++) {                System.out.print(al.get(i) + " ");            }            System.out.println(al.get(n - 3) + " " + al.get(n - 1) + " " + al.get(n - 2));        } else {            System.out.println("NO");        }    }}