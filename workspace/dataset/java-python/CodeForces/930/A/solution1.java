//stan hu tao//join nct ridin by first year culture repsimport static java.lang.Math.max;import static java.lang.Math.min;import static java.lang.Math.abs;import static java.lang.System.out;import java.util.*;import java.io.*;import java.math.*; public class x930A{    static ArrayDeque<Integer>[] edges;    public static void main(String hi[]) throws Exception    {        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(infile.readLine());        int N = Integer.parseInt(st.nextToken());        edges = new ArrayDeque[N+1];        for(int i=1; i <= N; i++)            edges[i] = new ArrayDeque<Integer>();        int[] par = readArr(N-1, infile, st);        for(int i=2; i <= N; i++)            edges[par[i-2]].add(i);        dp = new int[N+1];        dfs(1);        int[] res = new int[N+1];        res[0] = 1;        for(int x: dp)            res[x] ^= 1;        int lol = 0;        for(int x: res)            lol += x;        System.out.println(lol);    }    public static int[] dp;    public static void dfs(int curr)    {        for(int next: edges[curr])        {            dp[next] = dp[curr]+1;            dfs(next);        }    }    public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception    {        int[] arr = new int[N];        st = new StringTokenizer(infile.readLine());        for(int i=0; i < N; i++)            arr[i] = Integer.parseInt(st.nextToken());        return arr;    }}