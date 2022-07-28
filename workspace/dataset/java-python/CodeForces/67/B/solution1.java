import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.ListIterator;import java.util.StringTokenizer;import java.util.AbstractList;import java.io.IOException;import java.io.BufferedReader;import java.util.LinkedList;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        restore_permutation solver = new restore_permutation();        solver.solve(1, in, out);        out.close();    }     static class restore_permutation {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int k = in.nextInt();             int arr[] = new int[n + 1];            for (int i = 1; i <= n; ++i) {                arr[i] = in.nextInt();            }             LinkedList<Integer> ans = new LinkedList<>();            for (int i = n - k + 1; i <= n; ++i) {                ans.add(i);            }             for (int i = n - k; i >= 1; --i) {                int cnt = 0;                ListIterator<Integer> iter = ans.listIterator();                while (cnt < arr[i]) {                    if (iter.next() >= i + k) {                        ++cnt;                    }                }                 iter.add(i);            }             ListIterator<Integer> iter = ans.listIterator();            boolean fst = true;            while (iter.hasNext()) {                if (!fst) {                    out.print(" ");                }                 out.print(iter.next());                fst = false;            }             out.println();        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 