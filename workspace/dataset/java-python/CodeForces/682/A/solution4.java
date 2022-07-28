import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class AlyonaAndNumbers {    public static void main(String[] args) {        FastReader fs = new FastReader();        StringBuilder sb = new StringBuilder();        int n = fs.nextInt();        int m = fs.nextInt();        long result = 0;        for(int i = 1; i <= n; i++) {            result += (i + m) / 5 - i / 5;        }        System.out.println(result);    }     static class FastReader {        BufferedReader br;        StringTokenizer st;        public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while(st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         float nextFloat() {            return Float.parseFloat(next());        }    }}
