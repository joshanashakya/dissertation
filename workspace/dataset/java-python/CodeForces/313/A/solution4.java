/** * Author: @dnhirapara * Time: 28-03-2021 - 12:46 AM */ import java.io.*;import java.util.StringTokenizer; public class A313 {    public static void main(String[] args) throws IOException {        PrintWriter out = new PrintWriter(System.out);        FastScanner fs = new FastScanner();        long N;        N = fs.nextInt();        if(N > 0){            out.println(N);        }else{            out.println(Math.max((int)(N/10), (int)((N/100)*10)+(N%10)));        }        out.close();    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         public FastScanner(String filePath) throws FileNotFoundException {            try {                br = new BufferedReader(new FileReader(filePath));            } catch (FileNotFoundException e) {                e.printStackTrace();            }        }         String next() throws IOException {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                    throw e;                }            }            return st.nextToken();        }         String nextLine() throws IOException {            String str;            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();                throw e;            }            return str;        }         int nextInt() throws IOException {            return Integer.parseInt(this.next());        }         long nextLong() throws IOException {            return Long.parseLong(this.next());        }    }}
