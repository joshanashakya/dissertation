import java.io.*;import java.util.StringTokenizer;// نورت الكود يا كبير اتفضل // يا رب Acceptedpublic class LuckyPermutationTriple {    public static void main(String[] args) {        FastReader in = new FastReader();        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));         int n = in.nextInt();        if ((n & 1) == 1) {            for (int i = 0; i < n; i++)                out.print(i + " ");            out.println();            for (int i = 0; i < n; i++)                out.print(i + " ");            out.println();            for (int i = 0; i < n; i++)                out.print(((i * 2) % n) + " ");        }else         out.print("-1");        out.println();        out.close();    }     private static class FastReader {        BufferedReader br;        StringTokenizer st;         FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}
