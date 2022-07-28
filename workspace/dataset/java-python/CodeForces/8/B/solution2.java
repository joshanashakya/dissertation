import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.LinkedList;import java.util.Queue; // https://codeforces.com/problemset/problem/8/B// 쉽게 설명하면 로봇이 가는 길에 대해 유일한 경로인지 확인하는 것.public class Solve8B {    private static int[] dx = new int[] { 1, 0, -1,  0 };    private static int[] dy = new int[] { 0, 1,  0, -1 };     public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        String cmd = br.readLine();        int r = 0, c = 0;        boolean[][] checked = new boolean[200 + 1][200 + 1];        checked[100][100] = true;        for (char ch : cmd.toCharArray()) {            switch (ch) {                case 'U':                    r += 1;                    break;                case 'D':                    r -= 1;                    break;                case 'L':                    c -= 1;                    break;                case 'R':                    c += 1;                    break;            }            checked[100 + r][100 + c] = true;        }         Queue<int[]> queue = new LinkedList<>();        int[][] dist = new int[200 + 1][200 + 1];        boolean[][] visited = new boolean[200 + 1][200 + 1];        queue.offer(new int[] { 0, 0 });        visited[100][100] = true;        while (!queue.isEmpty()) {            int[] cur = queue.poll();            for (int i = 0; i < dx.length; i++) {                int tx = cur[0] + dx[i];                int ty = cur[1] + dy[i];                if (checked[100 + tx][100 + ty] && !visited[100 + tx][100 + ty]) {                    visited[100 + tx][100 + ty] = true;                    dist[100 + tx][100 + ty] = dist[100 + cur[0]][100 + cur[1]] + 1;                    queue.offer(new int[] { tx, ty });                }            }        }         if (dist[100 + r][100 + c] == cmd.length()) {            System.out.println("OK");        } else {            System.out.println("BUG");        }    }}
