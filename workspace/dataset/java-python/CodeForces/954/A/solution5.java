import java.io.*;import java.util.StringTokenizer; public class Main {     public static void main(String[] args) throws IOException {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int t = 1;            for (int tt = 0; tt < t; tt++) {                int k = in.nextInt();                char arr[] = in.next().toCharArray();                int ans = 0;                for (int i = 0; i < arr.length; i++) {                    if (i < arr.length - 1 && ((arr[i] == 'U' && arr[i + 1] == 'R') || (arr[i] == 'R' && arr[i + 1] == 'U'))) {                        i++;                    }                    ans++;                }                out.println(ans);            }          }    }     private static int naib(int a, int b) {        return a / (nod(a, b)) * b;    }     private static int nod(int a, int b) {        while (a != 0 && b != 0) {            if (a > b) {                a = a % b;            } else {                b = b % a;            }        }        return a + b;    }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public Long nextLong() {            return Long.parseLong(next());        }         public Double nextDouble() {            return Double.parseDouble(next());        }         public int[] readArray(int n) {            int arr[] = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = nextInt();            }            return arr;        }    }}
