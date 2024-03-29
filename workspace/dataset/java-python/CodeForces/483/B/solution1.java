import java.io.*;import java.util.*;import java.math.*; public class Main {     FastScanner in;    PrintWriter out;     static class FastScanner {         BufferedReader br;        StringTokenizer st;         FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         String nextLine() throws IOException {            if (st == null || !st.hasMoreTokens())                return br.readLine();            StringBuilder result = new StringBuilder(st.nextToken());            while (st.hasMoreTokens()) {                result.append(" ");                result.append(st.nextToken());            }            return result.toString();        }         int nextInt() throws IOException {            return Integer.parseInt(next());        }         long nextLong() throws IOException {            return Long.parseLong(next());        }         double nextDouble() throws IOException {            return Double.parseDouble(next());        }     }     void run() throws IOException {        in = new FastScanner(System.in);        out = new PrintWriter(System.out, false);        solve();        out.close();    }     public static void main(String[] args) throws IOException{        new Main().run();    }     public void printArr(int[] arr){        for(int i = 0; i < arr.length; i++){            out.print(arr[i] + " ");        }        out.println();    }     public long gcd(long a, long b){        if(a == 0) return b;        return gcd(b % a, a);    }     public boolean isPrime(long num){         if(num == 0 || num == 1){            return false;        }         for(int i = 2; i * i <= num; i++){            if(num % i == 0){                return false;            }        }         return true;    }     class Pair{        int x; int y;        Pair(int ix, int iy){            x = ix;            y = iy;        }    }     class Tuple{        int x; int y; int z;        Tuple(int ix, int iy, int iz){            x = ix;            y = iy;            z = iz;        }    }     public void solve() throws IOException{         int c1 = in.nextInt(), c2 = in.nextInt(), x = in.nextInt(), y = in.nextInt();        int lcm = x * y;         long l = 2L, r = 1000000000000L;        long v = Long.MAX_VALUE;         while(l != r){            long mid = (l + r) / 2;             long dl = mid / lcm;            long dx = mid / x;            long dy = mid / y;             long rx = Math.max(c1 - (dy - dl), 0L);            long ry = Math.max(c2 - (dx - dl), 0L);                         if(rx + ry <= (mid - dx - dy + dl) ){                v = Math.min(v, mid);                r = mid;            }else{                l = mid + 1;            }        }         out.println(v);         return;    }   }
