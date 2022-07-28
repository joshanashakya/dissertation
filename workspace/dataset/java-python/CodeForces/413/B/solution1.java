//package codeforces.practice.oneVone.Nov03_2020; import java.io.*;import java.util.*; public class A {    static InputReader in;    static PrintWriter out;     public static void main(String[] args) {        //initReaderPrinter(true);        initReaderPrinter(false);        //solve(in.nextInt());        solve(1);    }     static void solve(int testCnt) {        for (int testNumber = 0; testNumber < testCnt; testNumber++) {            int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();            int[][] a = new int[n][m];            for(int i = 0; i < n; i++) {                for(int j = 0; j < m; j++) {                    a[i][j] = in.nextInt();                }            }            int[] ans = new int[n];            int[] exclude = new int[n];            int[] chatCnt = new int[m];            for(int i = 0; i < k; i++) {                int x = in.nextInt() - 1;                int y = in.nextInt() - 1;                chatCnt[y]++;                exclude[x]++;            }            for(int i = 0; i < n; i++) {                for(int j = 0; j < m; j++) {                    if(a[i][j] == 1) {                        ans[i] += chatCnt[j];                    }                }                ans[i] -= exclude[i];            }            for(int v : ans) {                out.print(v + " ");            }            out.println();        }        out.close();    }     static void initReaderPrinter(boolean test) {        if (test) {            try {                in = new InputReader(new FileInputStream("src/input.in"));                out = new PrintWriter(new FileOutputStream("src/output.out"));            } catch (IOException e) {                e.printStackTrace();            }        } else {            in = new InputReader(System.in);            out = new PrintWriter(System.out);        }    }     static class InputReader {        BufferedReader br;        StringTokenizer st;         InputReader(InputStream stream) {            try {                br = new BufferedReader(new InputStreamReader(stream), 32768);            } catch (Exception e) {                e.printStackTrace();            }        }         String next() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }         Integer[] nextIntArray(int n) {            Integer[] a = new Integer[n];            for (int i = 0; i < n; i++) {                a[i] = nextInt();            }            return a;        }         Long[] nextLongArray(int n) {            Long[] a = new Long[n];            for (int i = 0; i < n; i++) {                a[i] = nextLong();            }            return a;        }    }}  