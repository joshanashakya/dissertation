/** * Author: @dnhirapara * Time: 28-03-2021 - 12:39 PM */ import java.io.*;import java.util.StringTokenizer; public class A1311 {    public static void main(String[] args) throws IOException {        PrintWriter out = new PrintWriter(System.out);        FastScanner fs = new FastScanner();        int tc = fs.nextInt();        for (int _ = 0; _ < tc; _++) {            int A = fs.nextInt(), B = fs.nextInt();            if (A == B) {                out.println(0);            } else if ((A > B && (((A - B) & 1)) == 0) || (B > A && ((B - A) & 1) == 1)) {                out.println(1);            } else {                out.println(2);            }        }        out.close();    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         public FastScanner(String filePath) throws FileNotFoundException {            try {                br = new BufferedReader(new FileReader(filePath));            } catch (FileNotFoundException e) {                e.printStackTrace();            }        }         String next() throws IOException {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                    throw e;                }            }            return st.nextToken();        }         String nextLine() throws IOException {            String str;            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();                throw e;            }            return str;        }         int nextInt() throws IOException {            return Integer.parseInt(this.next());        }         long nextLong() throws IOException {            return Long.parseLong(this.next());        }    }}
