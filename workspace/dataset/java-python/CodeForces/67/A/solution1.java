import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;     int oo = 5000;     void run(FastScanner in, PrintWriter out) {         // LRLRLRLRRRLRLRL        // L = left has higher marks        // R = right ...        //  LLLLLL        // 7654321         //  RRRRR        // 123456        //    =         // RRRLL        // 12341?         int N = in.nextInt();        char[] ca = in.next().toCharArray();         int[] ret = new int[N];        // 1234567        //  LLLRRL        for (int i = 0; i < ca.length; ) {            // i compares ret[i] vs ret[i+1]             //  0123456            //  LLLLLLLRRRRRR LLLRRR            // 87654321234567 321234            // 0123456             int start = i;            while (i < ca.length && (ca[i] == 'L' || ca[i] == '=')) {                i++;            }            int end = i;             int c = 1;            for (int j = end; j > start; j--) {                ret[j] = c;                if (ca[j-1] == 'L') c++;            }            ret[start] = Math.max(ret[start], ret[start+1]+1);             c = 2;            while (i < ca.length && (ca[i] == 'R' || ca[i] == '=')) {                if (i-1 >= 0 && ca[i] == '=') c--;                ret[i+1] = c;                c++;                i++;            }         }        if (ca[0] == '=') ret[0] = ret[1];        for (int i = ret.length-1; i > 0; i--) {            if (ca[i-1] == '=') {                ret[i-1] = ret[i];            }        }         // out.println(sum);        // out.println(Arrays.toString(ret));        for (int x : ret) out.print(x+" ");        out.println();    }     static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }} // 432123112113212234//  LLLRRL=RL=RLLR=RR
