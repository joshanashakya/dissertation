import java.util.*;import java.lang.*;import java.io.*; public class Main{	PrintWriter out = new PrintWriter(System.out);	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    StringTokenizer tok = new StringTokenizer("");    String next() throws IOException {        if (!tok.hasMoreTokens()) { tok = new StringTokenizer(in.readLine()); }        return tok.nextToken();    }    int ni() throws IOException { return Integer.parseInt(next()); }    long nl() throws IOException { return Long.parseLong(next()); }        int n,root,ct;    ArrayList<Integer>[]A;    int[]P,C,B,S;      void solve() throws IOException {        for (int tc=1;tc>0;tc--) {            n=ni();            A=new ArrayList[n+1];            for (int i=0;i<=n;i++) A[i]=new ArrayList();            P=new int[n+1];            C=new int[n+1];            for (int i=1;i<=n;i++) {                P[i]=ni();                C[i]=ni();                if (P[i]==0) root=i;                else A[P[i]].add(i);            }                        B=new int[n+1];            S=new int[n+1];            ct=1;                        if (!dfs(root)) out.println("NO");            else {                out.println("YES");                for (int i=1;i<=n;i++) out.print(B[i]+" ");                out.println();            }                    }        out.flush();    }        boolean dfs(int u) {        int curr=ct;        S[u]=1;                if (A[u].size()==0) {            B[u]=ct;            ct++;            if (C[u]>0) return false;            else return true;        }                for (Integer v:A[u]) {            if (!dfs(v)) return false;            S[u]+=S[v];        }                if (C[u]>=S[u]) return false;        B[u]=curr+C[u];        if (B[u]<ct)             for (Integer v:A[u]) update(v,B[u]);                ct++;        return true;    }        void update(int u,int w) {        if (B[u]>=w) B[u]++;        for (Integer v:A[u]) update(v,w);    }        public static void main(String[] args) throws IOException {        new Main().solve();    }}
