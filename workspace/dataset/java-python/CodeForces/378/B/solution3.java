import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.util.Comparator;import java.io.InputStreamReader;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        inputClass in = new inputClass(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BSemifinals solver = new BSemifinals();        solver.solve(1, in, out);        out.close();    }     static class BSemifinals {        public void solve(int testNumber, inputClass sc, PrintWriter out) {            int n = sc.nextInt();            boolean[] b1 = new boolean[n];            boolean[] b2 = new boolean[n];            ArrayList<BSemifinals.Pair> c = new ArrayList<>();            for (int i = 0; i < n; i++) {                c.add(new BSemifinals.Pair(sc.nextInt(), i));                c.add(new BSemifinals.Pair(sc.nextInt(), n + i));            }            for (int i = 0; i < n / 2; i++) {                b1[i] = true;                b2[i] = true;            }            c.sort(Comparator.comparingLong(a -> a.a));            for (int i = 0; i < n; i++) {                if (c.get(i).b >= n) {                    b2[(int) c.get(i).b - n] = true;                } else {                    b1[(int) c.get(i).b] = true;                }            }            for (int i = 0; i < n; i++) {                if (b1[i]) {                    out.print(1);                } else                    out.print(0);            }            out.println();            for (int i = 0; i < n; i++) {                if (b2[i]) {                    out.print(1);                } else                    out.print(0);            }            out.println();          }         static class Pair {            long a;            long b;             public Pair(long a, int b) {                this.a = a;                this.b = b;            }         }     }     static class inputClass {        BufferedReader br;        StringTokenizer st;         public inputClass(InputStream in) {             br = new BufferedReader(new InputStreamReader(in));        }         public String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
