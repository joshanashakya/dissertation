import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer;import java.io.BufferedReader;import java.util.Comparator;import java.util.Collections;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            long N = in.nextInt();            long A = in.nextInt();            long cf = in.nextInt();            long cm = in.nextInt();            long m = in.nextLong();            long[] pref = new long[(int) N];            ArrayList<long[]> arr = new ArrayList<>();            for (int i = 0; i < N; i++) {                arr.add(new long[]{in.nextInt(), i});            }            Collections.sort(arr, new Comparator<long[]>() {                 public int compare(long[] ints, long[] t1) {                    return Long.compare(ints[0], t1[0]);                }            });            pref[0] = arr.get(0)[0];            for (int i = 1; i < N; i++) {                pref[i] = pref[i - 1] + arr.get(i)[0];            }            long res = -1;            ArrayList<long[]> resArr = new ArrayList<>();            if (A * N - pref[(int) N - 1] <= m) {                res = cf * N + A * cm;                resArr = new ArrayList<>();                resArr.add(new long[]{-1, -1});                resArr.add(new long[]{A, 0});            } else {                for (long notMax = N; notMax >= 1; notMax--) {                    long low = 0;                    long high = notMax - 1;                    while (low < high) {                        long mid = (low + high + 1) / 2;                        if (arr.get((int) mid)[0] * (mid + 1) - pref[(int) mid] <= m) {                            low = mid;                        } else {                            high = mid - 1;                        }                    }                    int mid = (int) (low);                    long newMin = Math.min(A, (m - (arr.get(mid)[0] * (low + 1) - pref[mid])) / (low + 1) + arr.get(mid)[0]);                    if (m >= 0 && newMin * cm + cf * (N - notMax) > res) {                        res = Math.max(res, newMin * cm + cf * (N - notMax));                        resArr = new ArrayList<>();                        resArr.add(new long[]{newMin, mid});                        resArr.add(new long[]{A, notMax});                    }                    m -= A - arr.get((int) notMax - 1)[0];                }            }            out.println(res);            long[] fState = new long[(int) N];            for (int i = 0; i <= resArr.get(0)[1]; i++) {                fState[(int) arr.get(i)[1]] = resArr.get(0)[0];            }            for (int i = (int) resArr.get(0)[1] + 1; i < resArr.get(1)[1]; i++) {                fState[(int) arr.get(i)[1]] = arr.get(i)[0];            }            for (int i = (int) resArr.get(1)[1]; i < N; i++) {                fState[(int) arr.get(i)[1]] = A;            }            for (long j : fState) {                out.println(j);            }        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }     }} 