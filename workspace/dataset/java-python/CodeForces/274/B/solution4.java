import java.util.*;import java.io.*;import static java.lang.Math.*; public class PracticeProblem{    public static FastReader in = new FastReader();    public static PrintWriter out = new PrintWriter(System.out);    public static Set<Integer>[] graph;    public static long[] written;     public static void main(String[] args)    {        int n = in.nextInt();         graph = new Set[n];        for (int i = 0; i < n; i++)            graph[i] = new HashSet<>();         for (int i = 0; i < n - 1; i++)        {            int a = in.nextInt() - 1;            int b = in.nextInt() - 1;             graph[a].add(b);            graph[b].add(a);        }         written = new long[n];        for (int i = 0; i < n; i++)            written[i] = in.nextInt();         long[] answer = dfs(0, -1);         out.println(abs(answer[0]) + abs(answer[1]));         out.close();    }     public static long[] dfs(int vertex, int parent)   // [decreasing, increasing]    {        long maxIncreasing = 0;        long minDecreasing = 0;         for (int neighbor : graph[vertex])        {            if (neighbor != parent)            {                long[] answer = dfs(neighbor, vertex);                minDecreasing = min(minDecreasing, answer[0]);                maxIncreasing = max(maxIncreasing, answer[1]);            }        }         long cur = maxIncreasing + minDecreasing + written[vertex];         if (cur < 0)            maxIncreasing += abs(cur);        else            minDecreasing -= abs(cur);         return new long[] {minDecreasing, maxIncreasing};    }     /*     * This FastReader code is taken from GeeksForGeeks.com     * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/     *     * The article was written by Rishabh Mahrsee     */    public static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}
