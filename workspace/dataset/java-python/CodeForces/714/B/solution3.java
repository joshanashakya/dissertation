import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class FilyaAndHomework {    public static void main(String[] args) {        FastReader fs = new FastReader();        StringBuilder sb = new StringBuilder();        int t = fs.nextInt();        int a = -1, b = -1, c = -1;        for(int tt = 0; tt < t; tt++) {            int curr = fs.nextInt();            if(a == -1) a  = curr;            else if(b == -1 && curr != a) b = curr;            else if(c == -1 && curr != a && curr != b) c = curr;            else if(curr != a && curr != b && curr != c) {                System.out.println("NO");                return;            }        }        if(c == -1) {            System.out.println("YES");            return;        }else {            if(((a + b) / 2 == c && (a + b) % 2 == 0) || ((a + c) / 2 == b && (a + c) % 2 == 0)                    || ((b + c) / 2 == a && (b + c) % 2 == 0)) {                System.out.println("YES");            }else {                System.out.println("NO");            }        }    }     static class FastReader {        BufferedReader br;        StringTokenizer st;        public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while(st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         float nextFloat() {            return Float.parseFloat(next());        }    }}
