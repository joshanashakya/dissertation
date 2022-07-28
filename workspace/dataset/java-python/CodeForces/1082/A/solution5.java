import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; public class dpa01 {    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }      public static void main(String[] args) {        FastReader In = new FastReader();        int t = In.nextInt();        for (int i = 0; i < t; i++) {            int n = In.nextInt();            int x = In.nextInt();            int y = In.nextInt();            int d = In.nextInt();            int[] arr = new int[3];            if(Math.abs(x-y) % d == 0){                arr[0] = Math.abs(x-y) /d;            }else{                arr[0] = Integer.MAX_VALUE;            }            if((y-1) % d == 0){                arr[1] = (y-1) / d + (int)(Math.ceil(((double)x-1)/(double)d));            }else{                arr[1] = Integer.MAX_VALUE;            }            if((n-y) % d == 0){                arr[2] = (n-y) / d + (int)(Math.ceil((double)(n-x)/(double)d));            }else{                arr[2] = Integer.MAX_VALUE;            }            int res = Math.min(arr[0],Math.min(arr[1],arr[2]));            if(res == Integer.MAX_VALUE)                System.out.println(-1);            else                System.out.println(res);        }    }  }