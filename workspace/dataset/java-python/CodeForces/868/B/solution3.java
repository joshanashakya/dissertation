//package codeforces.practice.oneVone.Nov03_2020; import java.io.*;import java.util.*; public class B {    static InputReader in;    static PrintWriter out;     public static void main(String[] args) {        //initReaderPrinter(true);        initReaderPrinter(false);        //solve(in.nextInt());        solve(1);    }     static void solve(int testCnt) {        for (int testNumber = 0; testNumber < testCnt; testNumber++) {            int h = in.nextInt(), m = in.nextInt(), s = in.nextInt(), t1 = in.nextInt(), t2 = in.nextInt();            int t1Degree = t1 * 30 % 360, t2Degree = t2 * 30 % 360;            if(t1Degree > t2Degree) {                int temp = t1Degree;                t1Degree = t2Degree;                t2Degree = temp;            }            //60 min -> hour hand 360 / 12 = 30 degree; m / 60 * 30            //60s -> min hand 360 / 60 = 6 degree; s / 60 * 6            //t1 -> t2            int hDegree = (h * 30 + (m != 0 || s != 0 ? 1 : 0)) % 360;            int mDegree = (m * 6 + (s != 0 ? 1 : 0)) % 360;            int sDegree = s * 6;            int cnt = 0;            if(hDegree < t2Degree && hDegree > t1Degree) {                cnt++;            }            if(mDegree < t2Degree && mDegree > t1Degree) {                cnt++;            }            if(sDegree < t2Degree && sDegree > t1Degree) {                cnt++;            }            out.println(cnt == 0 || cnt == 3 ? "YES" : "NO");        }        out.close();    }     static void initReaderPrinter(boolean test) {        if (test) {            try {                in = new InputReader(new FileInputStream("src/input.in"));                out = new PrintWriter(new FileOutputStream("src/output.out"));            } catch (IOException e) {                e.printStackTrace();            }        } else {            in = new InputReader(System.in);            out = new PrintWriter(System.out);        }    }     static class InputReader {        BufferedReader br;        StringTokenizer st;         InputReader(InputStream stream) {            try {                br = new BufferedReader(new InputStreamReader(stream), 32768);            } catch (Exception e) {                e.printStackTrace();            }        }         String next() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }         Integer[] nextIntArray(int n) {            Integer[] a = new Integer[n];            for (int i = 0; i < n; i++) {                a[i] = nextInt();            }            return a;        }         Long[] nextLongArray(int n) {            Long[] a = new Long[n];            for (int i = 0; i < n; i++) {                a[i] = nextLong();            }            return a;        }    }}  