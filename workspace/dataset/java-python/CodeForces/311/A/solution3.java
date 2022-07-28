import java.awt.Point;import java.util.*;import java.io.*;import static java.lang.Math.*; public class PracticeProblem{    /*     * This FastReader code is taken from GeeksForGeeks.com     * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/     *     * The article was written by Rishabh Mahrsee     */    public static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }     public static FastReader in = new FastReader();    public static PrintWriter out = new PrintWriter(System.out);    public static final int MOD = (int)1e9 + 7;     public static void main(String[] args)    {        solve();         out.close();    }     public static void solve()    {        long n = in.nextInt(), k = in.nextInt();         if ((n * (n - 1)) / 2 <= k)        {            out.println("no solution");            return;        }         for (int i = 0; i < n; i++)        {            out.println(0 + " " + i);        }     } }
