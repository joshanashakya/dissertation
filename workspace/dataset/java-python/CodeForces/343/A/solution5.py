import java.util.*;import java.io.*; /** * Made by egor https://github.com/chermehdi/egor. *  * @author Azuz *  */public class Main {     void solve(Scanner in, PrintWriter out) {      long a = in.nextLong();      long b = in.nextLong();      long ans = 0;      while (true) {        if (a == 1) {          ans += b;          break;        } else if (b == 1) {          ans += a;          break;        }        if (a > b) {          long x = a / b;          ans += x;          a -= b * x;        } else if (a + 1 == b) {          ans += a + 1;          break;        } else {          a = swap(b, b = a);        }      }        out.println(ans);     }      public long swap(long a, long b) {      return a;    }      public static void main(String[] args) {        try(Scanner in = new Scanner(System.in);            PrintWriter out = new PrintWriter(System.out)) {            new Main().solve(in, out);        }    }}
