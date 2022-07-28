import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.stream.IntStream;import java.util.Arrays;import java.util.Set;import java.util.HashMap;import java.io.IOException;import java.util.Random;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.util.Map;import java.io.BufferedReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author dmytro.prytula */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BDobavlenieTochek solver = new BDobavlenieTochek();        solver.solve(1, in, out);        out.close();    }     static class BDobavlenieTochek {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int[] x = in.nextArr(n);             GeekInteger.save_sort(x);             long ans = 0;             int[] dist = new int[n - 1];            for (int i = 0; i < n - 1; i++) {                dist[i] = x[i + 1] - x[i];            }             Map<Integer, Integer> ms = GeekInteger.multiSet(dist);             dist = GeekInteger.toArray(ms.keySet());             int gcd = GeekInteger.gcd(dist);              for (int i = 0; i < dist.length; i++) {                ans += (dist[i] / gcd - 1) * ms.get(dist[i]);            }             out.print(ans);         }     }     static class GeekInteger {        public static Map<Integer, Integer> multiSet(int[] arr) {            Map<Integer, Integer> co = new HashMap<>();            for (int i : arr) co.merge(i, 1, Integer::sum);            return co;        }         public static void save_sort(int[] array) {            shuffle(array);            Arrays.sort(array);        }         public static int[] shuffle(int[] arr) {            Random r = new Random();            for (int i = 1, j; i < arr.length; i++) {                j = r.nextInt(i);                swap(arr, i, j);            }            return arr;        }         public static void swap(int[] arr, int i, int j) {            arr[i] = arr[i] ^ arr[j];            arr[j] = arr[i] ^ arr[j];            arr[i] = arr[i] ^ arr[j];        }         public static int[] toArray(Set<Integer> set) {            int[] a = new int[set.size()];            int k = 0;            for (int cur : set) {                a[k++] = cur;            }            return a;//        set.stream().collect(Collectors.toList()).        }         public static int gcd(int[] a) {            int gcd = 0;            for (int i : a) gcd = gcd(gcd, i);            return gcd;        }         public static int gcd(int a, int b) {            return b == 0 ? a : gcd(b, a % b);        }     }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String nextToken() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(nextToken());        }         public int[] nextArr(int size) {            return Arrays.stream(new int[size]).map(c -> nextInt()).toArray();        }     }} 
