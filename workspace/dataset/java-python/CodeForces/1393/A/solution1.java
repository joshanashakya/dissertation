import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class Main{
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
        long[] nextArray(long n) {
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
    static class FastWriter extends PrintWriter {
            FastWriter(){
                super(System.out);
            }
            void println(int[] array) {
                for(int i=0; i<array.length; i++) {
                    print(array[i]+" ");
                }
                println();
            }
            void println(long [] array) {
                for(int i=0; i<array.length; i++) {
                    print(array[i]+" ");
                }
                println();
            }
        }
    public static void main(String[] args){
        FastScanner in = new FastScanner();
        FastWriter out = new FastWriter();
        int t=in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            out.println((n/2)+1);
        }
        out.close();
    }
}
