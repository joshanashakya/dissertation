/** * Author: @dnhirapara * Time: 28-03-2021 - 12:01 AM */ import java.io.*;import java.util.StringTokenizer; public class B399 {    public static void main(String[] args) throws IOException {        PrintWriter out = new PrintWriter(System.out);        FastScanner fs = new FastScanner();        long N, M;        N = fs.nextLong();        M = fs.nextLong();        int X;        int cur = 0;        long ans = -1;        for (int i = 0; i < M; i++) {            X = fs.nextInt();            if (cur <= X) {                cur = X;            } else {                ans += N;                cur = X;            }        }        ans += cur;        out.println(ans);        out.close();    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         public FastScanner(String filePath) throws FileNotFoundException {            try {                br = new BufferedReader(new FileReader(filePath));            } catch (FileNotFoundException e) {                e.printStackTrace();            }        }         String next() throws IOException {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                    throw e;                }            }            return st.nextToken();        }         String nextLine() throws IOException {            String str;            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();                throw e;            }            return str;        }         int nextInt() throws IOException {            return Integer.parseInt(this.next());        }         long nextLong() throws IOException {            return Long.parseLong(this.next());        }    }}