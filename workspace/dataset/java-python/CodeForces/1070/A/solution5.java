//Created by Aminul on 4/10/2019. import java.io.PrintWriter;import java.util.ArrayDeque;import java.util.Arrays;import java.util.Queue;import java.util.Scanner; public class CF1070A {    public static void main(String[] args) throws Exception {        Scanner in = new Scanner(System.in);        PrintWriter pw = new PrintWriter(System.out);        int d = in.nextInt(), s = in.nextInt();        pw.println(bfs(d, s));        pw.close();    }     static String bfs(int d, int s) {        boolean[][] vis = new boolean[d + 1][s + 1];        int value[][] = new int[d + 1][s + 1];        Pair prev[][] = new Pair[d + 1][s + 1];        Queue<Pair> q = new ArrayDeque<>();        q.add(new Pair(0, 0));        vis[0][0] = true;        while (!q.isEmpty()) {            Pair p = q.poll();            if (p.first == 0 && p.second == s) break;            for (int i = 0; i < 10; i++) {                int rem = (p.first * 10 + i) % d, sum = p.second + i;                if (sum <= s && !vis[rem][sum]) {                    Pair tmp = new Pair(rem, sum);                    vis[rem][sum] = true;                    value[rem][sum] = i;                    prev[rem][sum] = p;                    q.add(tmp);                }            }        }        if (!vis[0][s]) return "-1";        StringBuilder sb = new StringBuilder();        int rem = 0, sum = s;        while (!(rem == 0 && sum == 0)) {            sb.append(value[rem][sum]);            Pair tmp = prev[rem][sum];            rem = tmp.first;            sum = tmp.second;        }        return sb.reverse().toString();    }     static void debug(Object... obj) {        System.err.println(Arrays.deepToString(obj));    }     static class Pair {        int first, second;         Pair(int R, int S) {            first = R;            second = S;        }         @Override        public String toString() {            return first + " " + second;        }    }}
