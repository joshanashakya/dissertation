import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    private static class Edge {
        int to, w;

        public Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(rd.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Edge>[] G = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(rd.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1, v = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());
            G[u].add(new Edge(v, w));
        }
        if (k == 1) {
            int[] r = new int[n];
            for (int i = 0; i < n; i++) {
                int v = G[i].get(0).to;
                if (r[v] > 0) {
                    System.out.println(0);
                    return;
                }
                r[v]++;
            }
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(G[i], (x, y) -> Integer.compare(x.w, y.w));
        }
        int[][][][] b = new int[10][10][10][10];
        ArrayList<Integer>[] groups = new ArrayList[k + 1];
        for (int i = 1; i <= k; i++) {
            groups[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int deg = G[i].size();
            groups[deg].add(i);
        }
        // SET[i][x] -> group i, ci = x: all nodes after moving from group i along nodes with ci=x.
        int[][][] sets = new int[10][10][n];
        for (int i = 1; i <= k; i++) {
            for (int x = 0; x < i; x++) {
                sets[i][x] = setFrom(i, x, G, groups);
            }
        }
        for (int i = 1; i <= k; i++) {
            for (int x = 0; x < i; x++) {
                for (int j = i + 1; j <= k; j++) {
                    for (int y = 0; y < j; y++) {
                        b[i][x][j][y] = isOk(i, x, j, y, G, sets) ? 1 : 0;
                    }
                }
            }
        }
        System.out.println(recursiveCount(new int[k + 1], 1, b, k));
    }

    private static int recursiveCount(int[] c, int pos, int[][][][] b, int k) {
        if (pos == k + 1) {
            for (int i = 1; i <= k; i++) {
                for (int j = i + 1; j <= k; j++) {
                    if (b[i][c[i]][j][c[j]] == 0) return 0;
                }
            }
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < pos; i++) {
            c[pos] = i;
            ans += recursiveCount(c, pos + 1, b, k);
        }
        return ans;
    }

    // ci = x
    private static int[] setFrom(int i, int x, ArrayList<Edge>[] G, ArrayList<Integer>[] groups) {
        int[] res = new int[G.length];
        for (int nd : groups[i]) {
            res[G[nd].get(x).to]++;
            if (res[G[nd].get(x).to] > 1) return null;
        }
        return res;
    }

    // ci=x, cj=y.
    private static boolean isOk(int i, int x, int j, int y, ArrayList<Edge>[] G, int[][][] sets) {
        int[] s1 = sets[i][x], s2 = sets[j][y];
        if (s1 == null || s2 == null) return false;
        for (int t = 0; t < G.length; t++) {
            if (s1[t] > 0 && s2[t] > 0) {
                return false;
            }
        }
        return true;
    }
}

