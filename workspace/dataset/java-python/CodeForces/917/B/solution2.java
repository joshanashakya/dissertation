import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer; public class Solution {    private static ArrayList<Edge>[] graph;    private static int n;    private static int m;    private static char[][][] res;    static class Edge {        private int end;        private int symbol;        Edge(int e, int s) {            this.end = e;            this.symbol = s;        }    }    static void dfs(int max, int lucas, int symbol) {        if (res[max][lucas][symbol]!='\u0000') return;        res[max][lucas][symbol] = 'B';        for (Edge edge:graph[max]) {            if (edge.symbol<symbol) continue;            dfs(lucas, edge.end, edge.symbol);            if (res[lucas][edge.end][edge.symbol]=='B') {                res[max][lucas][symbol] = 'A';            }        }    }    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer sToken = new StringTokenizer(reader.readLine());        n = Integer.parseInt(sToken.nextToken());        m = Integer.parseInt(sToken.nextToken());        graph = new ArrayList[n];        for (int i=0; i<n; i++) graph[i] = new ArrayList<>();        for (int i=0; i<m; i++) {            sToken = new StringTokenizer(reader.readLine());            int v = Integer.parseInt(sToken.nextToken())-1;            int u = Integer.parseInt(sToken.nextToken())-1;            int c = sToken.nextToken().charAt(0)-'a';            graph[v].add(new Edge(u, c));        }        res = new char[n][n][26];        for (int i=0; i<n; i++) {            for (int j=0; j<26; j++) res[i][i][j] = 'B';        }        StringBuilder ans = new StringBuilder();        for (int i=0; i<n; i++) {            for (int j=0; j<n; j++) {                Solution.dfs(i, j, 0);                ans.append(res[i][j][0]);            }            ans.append("\n");        }        System.out.println(ans);    }}
