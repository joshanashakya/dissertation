import java.io.*;import java.util.*; public class Codeforces {    public static void main(String[] args) throws UnsupportedEncodingException, IOException, Exception {        StringBuilder out = new StringBuilder();        StringTokenizer tk;        Reader.init(System.in);        int n = Reader.nextInt();        int s = Reader.nextInt();        if(s%n==0){            System.out.println(s/n);        }        else{            System.out.println((s/n)+1);        }     }} class Reader {     static BufferedReader reader;    static StringTokenizer tokenizer;     static void init(InputStream input) throws UnsupportedEncodingException {        reader = new BufferedReader(                new InputStreamReader(input, "UTF-8"));        tokenizer = new StringTokenizer("");    }     static String next() throws IOException {        while (!tokenizer.hasMoreTokens()) {            //TODO add check for eof if necessary            tokenizer = new StringTokenizer(                    reader.readLine());        }        return tokenizer.nextToken();    }     static String nextLine() throws IOException {        return reader.readLine();    }     static int nextInt() throws IOException {        return Integer.parseInt(next());    }     static double nextDouble() throws IOException {        return Double.parseDouble(next());    }     static long nextLong() throws IOException {        return Long.parseLong(next());    }}