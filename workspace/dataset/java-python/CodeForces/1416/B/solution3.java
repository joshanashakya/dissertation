//package codeforces.round673div2; import java.io.*;import java.util.*; public class D {    static InputReader in;    static PrintWriter out;     public static void main(String[] args) {        //initReaderPrinter(true);        initReaderPrinter(false);        solve(in.nextInt());        //solve(1);            }     static void solve(int testCnt) {        for (int testNumber = 0; testNumber < testCnt; testNumber++) {            int n = in.nextInt();            int sum = 0;            int[] a = new int[n + 1];            for(int i = 1; i <= n; i++) {                a[i] = in.nextInt();                sum += a[i];            }            if(sum % n != 0) {                out.println(-1);            }            else {                int d = sum / n;                List<int[]> ops = new ArrayList<>();                for(int i = 2; i <= n; i++) {                    if(a[i] % i != 0) {                        ops.add(new int[]{1, i, i - a[i] % i});                        a[i] += i - a[i] % i;                    }                    ops.add(new int[]{i, 1, a[i] / i});                }                for(int i = 2; i <= n; i++) {                    ops.add(new int[]{1, i, d});                }                out.println(ops.size());                for(int i = 0; i < ops.size(); i++) {                    int[] op = ops.get(i);                    out.println(op[0] + " " + op[1] + " " + op[2]);                }            }        }        out.close();    }     static void initReaderPrinter(boolean test) {        if (test) {            try {                in = new InputReader(new FileInputStream("src/input.in"));                out = new PrintWriter(new FileOutputStream("src/output.out"));            } catch (IOException e) {                e.printStackTrace();            }        } else {            in = new InputReader(System.in);            out = new PrintWriter(System.out);        }    }     static class InputReader {        BufferedReader br;        StringTokenizer st;         InputReader(InputStream stream) {            try {                br = new BufferedReader(new InputStreamReader(stream), 32768);            } catch (Exception e) {                e.printStackTrace();            }        }         String next() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }         Integer[] nextIntArray(int n) {            Integer[] a = new Integer[n];            for (int i = 0; i < n; i++) {                a[i] = nextInt();            }            return a;        }         Long[] nextLongArray(int n) {            Long[] a = new Long[n];            for (int i = 0; i < n; i++) {                a[i] = nextLong();            }            return a;        }    }}  