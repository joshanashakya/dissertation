import java.util.*;import java.io.*;import static java.lang.Math.*; public class PracticeProblem{    /*     * This FastReader code is taken from GeeksForGeeks.com     * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/     *     * The article was written by Rishabh Mahrsee     */    public static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }     public static FastReader in = new FastReader();    public static PrintWriter out = new PrintWriter(System.out);    public static final int MOD = (int)1e9 + 7;     public static void main(String[] args)    {        solve();        out.close();    }     private static long power(long a, long b)    {        long result = 1;        for (; b > 0; a = a * a % MOD, b >>= 1)            if ((b & 1) != 0)                result = result * a % MOD;        return result;    }     private static void solve()    {        String line = in.nextLine();        int n = line.length();        boolean[] arr = new boolean[n];         int cur = 0;        for (int i = n - 1; i >= 0; i--)            arr[cur++] = line.charAt(i) == '1';         long answer = 0;        long bit = 1;        for (int i = 0; i < n; i++)        {            if (arr[i])                answer = (answer + bit) % MOD;            bit = bit * 2 % MOD;        }        answer = answer * power(2, n - 1) % MOD;        out.println(answer);    } }
