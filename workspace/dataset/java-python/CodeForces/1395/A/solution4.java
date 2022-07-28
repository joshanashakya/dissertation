import java.util.*;
import java.io.*;

public class CFA {
  BufferedReader br;
  PrintWriter out;
  StringTokenizer st;
  boolean eof;
  private static final long MOD = 1000L * 1000L * 1000L + 7;
  private static final int[] dx = {0, -1, 0, 1};
  private static final int[] dy = {1, 0, -1, 0};
  private static final String yes = "Yes";
  private static final String no = "No";

  void solve() {
    int T = nextInt();
//    int T = 1;
    for (int i = 0; i < T; i++) {
      helper();
    }
  }

  void helper() {
    int[] arr = nextIntArr(4);
    int odd = findOdd(arr);
    if (odd <= 1) {
      outln(yes);
      return;
    }
    int min = findMin(arr);
    if (min <= 0) {
      outln(no);
      return;
    }
    arr[0]--;
    arr[1]--;
    arr[2]--;
    arr[3] += 3;
    odd = findOdd(arr);
    outln(odd <= 1 ? yes : no);
  }

  int findOdd(int[] arr) {
    int res = 0;
    for (int v : arr) {
      if (v % 2 == 1) {
        res++;
      }
    }
    return res;
  }

  int findMin(int[] arr) {
    int min = Math.min(arr[0], arr[1]);
    min = Math.min(min, arr[2]);
    return min;
  }

  void shuffle(int[] a) {
    int n = a.length;
    for(int i = 0; i < n; i++) {
      int r = i + (int) (Math.random() * (n - i));
      int tmp = a[i];
      a[i] = a[r];
      a[r] = tmp;
    }
  }

  long gcd(long a, long b) {
    while(a != 0 && b != 0) {
      long c = b;
      b = a % b;
      a = c;
    }
    return a + b;
  }
  int gcd(int a, int b) {
    while(a != 0 && b != 0) {
      int c = b;
      b = a % b;
      a = c;
    }
    return a + b;
  }
  private void outln(Object o) {
    out.println(o);
  }
  private void out(Object o) {
    out.print(o);
  }
  private void formatPrint(double val) {
    outln(String.format("%.9f", val));
  }
  public CFA() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);
    solve();
    out.close();
  }
  public static void main(String[] args) {
    new CFA();
  }
  public long[] nextLongArr(int n) {
    long[] res = new long[n];
    for(int i = 0; i < n; i++)
      res[i] = nextLong();
    return res;
  }
  public int[] nextIntArr(int n) {
    int[] res = new int[n];
    for(int i = 0; i < n; i++)
      res[i] = nextInt();
    return res;
  }
  public String nextToken() {
    while (st == null || !st.hasMoreTokens()) {
      try {
        st = new StringTokenizer(br.readLine());
      } catch (Exception e) {
        eof = true;
        return null;
      }
    }
    return st.nextToken();
  }
  public String nextString() {
    try {
      return br.readLine();
    } catch (IOException e) {
      eof = true;
      return null;
    }
  }
  public int nextInt() {
    return Integer.parseInt(nextToken());
  }
  public long nextLong() {
    return Long.parseLong(nextToken());
  }
  public double nextDouble() {
    return Double.parseDouble(nextToken());
  }
}
