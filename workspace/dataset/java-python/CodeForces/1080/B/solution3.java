import java.util.*;import java.io.*; public class MargariteAndTheBestPresent{    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        Task solver = new Task();        solver.solve(1, in, out);        out.close();    }     static class Task {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int N = in.nextInt();            int sum = 0;            for(int i=0; i<N; i++){                int first = in.nextInt();                int second = in.nextInt();                 if(second%2 == 0) {                    if(first%2 == 0) sum = (second+first)/2;                    else sum = (second-first+1)/2;                }                 else{                    if(first%2 == 0) sum = -1*(second-first+1)/2;                    else sum = -1*(first+second)/2;                }            out.println(sum);            }        }    }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32_768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public String nextLine() {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }        public long nextLong() {            return Long.parseLong(next());        }        public double nextDouble() {            return Double.parseDouble(next());        }    }}