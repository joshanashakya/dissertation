import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.FileReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author OmarYasser */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.solve(1, in, out);        out.close();    }     static class TaskA {        public void solve(int testNumber, Scanner sc, PrintWriter out) {            int w = sc.nextInt(), h = sc.nextInt();            char[][] arr = new char[w][h];            for (int i = 0; i < h; i++) {                char[] a = sc.next().toCharArray();                for (int j = 0; j < w; j++)                    arr[j][h - i - 1] = a[j];            }            for (int i = 0; i < w; i++) {                for (int j = 0; j < h / 2; j++) {                    char other = arr[i][h - j - 1];                    arr[i][h - j - 1] = arr[i][j];                    arr[i][j] = other;                }            }            StringBuilder res = new StringBuilder();            for (int i = 0; i < w; i++) {                StringBuilder sb = new StringBuilder();                for (int j = 0; j < h; j++) {                    sb.append(arr[i][j]).append(arr[i][j]);                }                res.append(sb).append("\n").append(sb).append("\n");            }            out.println(res);        }     }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public Scanner(FileReader f) {            br = new BufferedReader(f);        }         public String next() {            while (st == null || !st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (Exception e) {                }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
