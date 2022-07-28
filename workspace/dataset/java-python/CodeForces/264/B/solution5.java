import java.util.*;import java.io.*;import static java.lang.Math.*; public class PracticeProblem{    /*     * This FastReader code is taken from GeeksForGeeks.com     * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/     *     * The article was written by Rishabh Mahrsee     */    public static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }     public static FastReader in = new FastReader();    public static PrintWriter out = new PrintWriter(System.out);    public static final int N = (int)1e5;     public static void main(String[] args)    {        int n = in.nextInt();         int[] arr = new int[n];        for (int i = 0; i < n; i++)            arr[i] = in.nextInt();         int[] dp = new int[n];        int answer = -1;         Map<Integer, Integer> primeMax = new HashMap<>();         for (int i = 0; i < n; i++)        {            // Prime factorize arr[i]            int cur = arr[i];            while (cur % 2 == 0)            {                dp[i] = max(dp[i], primeMax.getOrDefault(2, 0));                cur /= 2;            }            for (int j = 3; j * j <= cur; j += 2)            {                while (cur % j == 0)                {                    dp[i] = max(dp[i], primeMax.getOrDefault(j, 0));                    cur /= j;                }            }             if (cur > 1)                dp[i] = max(dp[i], primeMax.getOrDefault(cur, 0));             dp[i]++;             cur = arr[i];            while (cur % 2 == 0)            {                primeMax.put(2, max(primeMax.getOrDefault(2, 0), dp[i]));                cur /= 2;            }            for (int j = 3; j * j <= cur; j += 2)            {                while (cur % j == 0)                {                    primeMax.put(j, max(primeMax.getOrDefault(j, 0), dp[i]));                    cur /= j;                }            }             if (cur > 1)                primeMax.put(cur, max(primeMax.getOrDefault(cur, 0), dp[i]));             answer = max(answer, dp[i]);        }        out.println(answer);        out.close();    }  }