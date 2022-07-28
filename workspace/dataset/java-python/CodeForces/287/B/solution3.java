import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter; public class Main {    public static int mod = 1000000007;    public static int[][][] dp;    public static int MAX_VAL;    public static PrintWriter out;    public static int num = 0;     public static void main(String[] args) throws IOException {        //InputReader ir = new InputReader(System.in);        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));        out = new PrintWriter(System.out);            String[] str = bf.readLine().split(" ");            long N = Long.parseLong(str[0]);            long K = Long.parseLong(str[1]);             long max = totalPipes(K,K);             if(N == K)                out.println(1);            else if (N > max) {                out.println(-1);            } else {                 long left = 0;                long right = K;                while (left < right) {                    long mid = (left + right) / 2;                    if (totalPipes(mid, K) >= N) {                        right = mid;                    } else {                        left = mid + 1;                    }                }                if (totalPipes(left, K) >= N)                    out.println(left);                else                    out.println(-1);            }          out.flush();     }     private static long totalPipes(long i, long k) {         return i * k - sumOfNnums(i - 1) - (i - 1);      }     public static long sumOfNnums(long n) {        return (n * (n + 1)) / 2;    }      private static int upperBound(Integer[] arr, int N, int target) {        int low = 0;        int high = N - 1;        while (low < high) {            int mid = (low + high + 1) / 2;            if (target >= arr[mid]) {                low = mid;            } else {                high = mid - 1;            }        }         return high;    }      class Pair<S extends Comparable<S>, T extends Comparable<T>> implements Comparable<Pair<S, T>> {        S first;        T second;         Pair(S f, T s) {            first = f;            second = s;        }         @Override        public int compareTo(Pair<S, T> o) {            int t = first.compareTo(o.first);            if (t == 0) return second.compareTo(o.second);            return t;        }         @Override        public int hashCode() {            return (31 + first.hashCode()) * 31 + second.hashCode();        }         @Override        public boolean equals(Object o) {            if (!(o instanceof Pair)) return false;            if (o == this) return true;            Pair p = (Pair) o;            return first.equals(p.first) && second.equals(p.second);        }         @Override        public String toString() {            return "Pair{" + first + ", " + second + "}";        }    }  }  
