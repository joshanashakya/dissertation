import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; public class dpa01 {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }      public static void main(String[] args) {        FastReader In = new FastReader();        int n = In.nextInt();        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());        int l = In.nextInt();        for (int i = 0; i < n-1; i++) {            pq.add(In.nextInt());        }        int cont = l;        while(l <= pq.peek()){            l++;            pq.add(pq.poll()-1);        }        System.out.println(l-cont);    }  }
