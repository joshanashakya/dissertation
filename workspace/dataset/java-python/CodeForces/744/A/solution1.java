import java.io.*;import java.util.*;public class Ishu{    static Scanner scan = new Scanner(System.in);    static List<Integer>[] graph = new ArrayList[1];    static boolean[] visited = new boolean[1];    static int[] com = new int[1];    static boolean[] isgov = new boolean[1];    static boolean[] arr = new boolean[1];    static int dfs(int ver)    {    visited[ver] = true;    int res = 1;        int n = graph[ver].size();    int i;    for(i=0;i<n;++i)        {        int u = graph[ver].get(i);        if(!visited[u-1])            res += dfs(u-1);        }    return res;    }        static void dfss(int ver, int res)    {    visited[ver] = true;    arr[ver] = true;    com[ver] = res;    int n = graph[ver].size();    int i;        for(i=0;i<n;++i)        {        int u = graph[ver].get(i);        if(!visited[u-1])            dfss(u-1,res);        }    }    static void tc()    {    int n = scan.nextInt();    int m = scan.nextInt();    int k = scan.nextInt();    isgov = new boolean[n];    graph = new ArrayList[n];    visited = new boolean[n];    com = new int[n];    arr = new boolean[n];    int i;        for(i=0;i<n;++i)        graph[i] = new ArrayList<Integer>();    for(i=0;i<k;++i)        {        int c = scan.nextInt();        isgov[c-1] = true;        }        for(i=0;i<m;++i)        {        int u = scan.nextInt();        int v = scan.nextInt();        graph[u-1].add(v);        graph[v-1].add(u);        }        int max = Integer.MIN_VALUE;    int ans = 0;    for(i=0;i<n;++i)        {        if(!isgov[i])            continue;        int res = dfs(i);        com[i] = res;        if(res > max)            max = res;        }        Arrays.fill(visited,false);        for(i=0;i<n;++i)        if(isgov[i])            {            ans += (com[i] * (com[i] - 1)) / 2;            dfss(i,com[i]);            }          ans = ans - m;         // System.out.println(ans);//    for(i=0;i<n;++i) //        System.out.println((i+1) + " " + com[i] + " " + isgov[i]);  //    System.out.println(max);        for(i=0;i<n;++i)        if(arr[i])            isgov[i] = true;                for(i=0;i<n;++i)        if(!isgov[i])            {            ans += max;            max++;            }        System.out.println(ans);    }    public static void main(String[] args)    {    int t = 1;    //t = scan.nextInt();    while(t-- > 0)        tc();    }}