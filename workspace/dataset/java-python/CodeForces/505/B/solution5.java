import java.util.*;import java.io.*;/** * * @author alanl */public class Main{    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    static int ans = 0, n, m;    static Set<Integer>s;    static ArrayList<edge>adj[];    public static void main(String[] args) throws IOException{        n = readInt();        m = readInt();        adj = new ArrayList[n+1];        for(int i = 1; i<=n; i++)adj[i] = new ArrayList();        for(int i = 0; i<m; i++){            int a = readInt(), b = readInt(), w = readInt();            adj[a].add(new edge(b, w));            adj[b].add(new edge(a, w));        }        int q = readInt();        for(int i = 0; i<q; i++){            int a = readInt(), b = readInt();            ans = 0;            s = new HashSet();            dfs(a, b, -1, new boolean[n+1]);            println(s.size());        }    }    static void dfs(int u, int end, int cur, boolean[]vis){        if(u==end){            s.add(cur);            return;        }        vis[u] = true;        if(cur==-1){            for(edge e:adj[u]){                if(!vis[e.v]){                    dfs(e.v, end, e.w, vis);                }            }        }        else{            for(edge e:adj[u]){                if(!vis[e.v] && e.w==cur){                    dfs(e.v, end, cur, vis);                }            }        }        vis[u] = false;    }    static class edge{        int v, w;        edge(int v0, int w0){            v = v0;            w = w0;        }    }    static String next () throws IOException {        while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(input.readLine().trim());        return st.nextToken();    }    static long readLong () throws IOException {        return Long.parseLong(next());    }    static int readInt () throws IOException {        return Integer.parseInt(next());    }    static double readDouble () throws IOException {        return Double.parseDouble(next());    }    static char readChar () throws IOException {        return next().charAt(0);    }    static String readLine () throws IOException {        return input.readLine().trim();    }    static void print(Object b) {        System.out.print(b);    }    static void println(Object b) {        System.out.println(b);    }    static void println() {        System.out.println();    }}