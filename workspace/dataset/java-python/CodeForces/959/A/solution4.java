import java.io.*;import java.util.StringTokenizer;// نورت الكود يا كبير اتفضل // يا رب Acceptedpublic class Copy {    public static void main(String[] args) {        FastReader in = new FastReader();        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));         out.println((((in.nextInt()) & 1) == 1) ? "Ehab" : "Mahmoud");        out.close();    }     private static class FastReader {        BufferedReader br;        StringTokenizer st;         FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }    }}
