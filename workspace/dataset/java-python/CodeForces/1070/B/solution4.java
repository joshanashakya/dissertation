//package practice.pset1; import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays; public class Solution {    public static void main(String[] args) throws Throwable {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        PrintWriter pw = new PrintWriter(System.out);         int n=Integer.parseInt(br.readLine());        nodes = 3200005;        str = new int[nodes];         trie = new int[nodes][2];        has = new boolean[nodes][2];        for (int i = 0; i < trie.length; i++) {            Arrays.fill(trie[i], -1);        }        color = new int[nodes];        Arrays.fill(color, 123);        depth = new int[nodes];        ans = new ArrayList<>();        for (int i = 0; i < n; i++) {            String s = br.readLine();            boolean bad = s.charAt(0) == '-';            int[] getBinary = getBinary(s.substring(1));             insert(getBinary, bad? BLACK : WHITE);        }         bfs();        if(!ok){            System.out.println(-1);            return;        }         pw.println(ans.size());        for (int j = 0; j < ans.size(); j++) {            if(ans.get(0) == 0)                pw.println("0.0.0.0/0");            else                pw.println(getIP(str[ans.get(j)], depth[ans.get(j)]));        }          pw.flush();        pw.close();    }     static int[][] trie;    static int NXT;    static boolean[][] has;    static int[] color;    static int[] depth;    static int[] str;    static int WHITE = 0, BLACK = 1;     static void insert(int[] s, int tt){        int node = 0;        int rep = 0;        int d = 0;        StringBuilder sb = new StringBuilder();        for (int i = 0; i < s.length; i++) {            d++;            rep = rep*2+s[i];            sb.append(s[i]);            if(trie[node][s[i]] == -1)                trie[node][s[i]] = ++NXT;            has[node][tt] = true;            node = trie[node][s[i]];            depth[node] = d;            str[node] = rep;        }         has[node][tt] = true;        color[node] = tt;    }     static String getIP(int biInt, int len){        String bi = Integer.toBinaryString(biInt);        int[] ret = new int[4];        char[] ss = new char[32];        Arrays.fill(ss, '0');        int diff = len - bi.length();        for (int i = diff; i < diff+bi.length(); i++)            ss[i] = bi.charAt(i-diff);        bi = new String(ss);        for (int i = 0; i < 4; i++) {            ret[i] = Integer.parseInt(bi.substring(i*8, i*8+8), 2);        }        return ret[0] + "." + ret[1] + "." + ret[2] +"." + ret[3] + "/" + len;    }     static int nodes = 200005*32+10;    static boolean ok = true;    static ArrayList<Integer> ans;    static void bfs(){        int[] q = new int[nodes];        q[0] = 0;        for (int s = 0, e = 1; s < e;) {            int u = q[s++];            if(!has[u][WHITE]){                ans.add(u);                continue;            }            if(color[u] == BLACK) {                ok = false;                return;            }             if(color[u] == WHITE && has[u][BLACK]) {                ok = false;                return;            }             for (int i = 0; i < 2; i++) {                if(trie[u][i] != -1){                    q[e++] = trie[u][i];                }            }        }    }      static int[] getBinary(String ip){        String[] split = ip.split("\\.");        String[] subnet = split[3].split("/");        split[3] = subnet[0];        int x = subnet.length == 1?32:Integer.parseInt(subnet[1]);        int[] ret = new int[x];        int idx = 0;        for (int i = 0; i < split.length; i++) {            int n = Integer.parseInt(split[i]);            for (int pw = 7; pw >= 0; pw--) {                if(idx == ret.length)                    break;                if(n >= 1<<pw){                    ret[idx] = 1;                    n-= (1<<pw);                }                idx++;            }        }         return ret;    }}
