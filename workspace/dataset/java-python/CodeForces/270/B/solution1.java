import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Multithreading {    public static void main(String[] args) {        FastReader fs = new FastReader();        StringBuilder sb = new StringBuilder();        int t = fs.nextInt();        int[] arr = new int[t];        for(int tt = 0; tt < t; tt++) {            arr[tt] = fs.nextInt();        }        for(int i = t - 1; i >= 1; i--) {            if(arr[i - 1] > arr[i]) {                System.out.println(i);                return;            }        }        System.out.println(0);    }     static class FastReader {        BufferedReader br;        StringTokenizer st;        public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while(st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         float nextFloat() {            return Float.parseFloat(next());        }    }}