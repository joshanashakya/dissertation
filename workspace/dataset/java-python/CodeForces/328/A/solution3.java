import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class ArithmeticOrGeometric {     private static BufferedReader bufferedReader;    private static StringTokenizer st;     public static void main(String[] args) throws IOException {         bufferedReader = new BufferedReader(new InputStreamReader(System.in));        int a1 = Integer.parseInt(next());        int a2 = Integer.parseInt(next());        int a3 = Integer.parseInt(next());        int a4 = Integer.parseInt(next());         int d = a2 - a1;         if (d == a3 - a2 && d == a4 - a3) {            System.out.println(a4 + d);        } else if (a1 * a3 == a2 * a2 && a2 * a4 == a3 * a3 && a4*a4%a3==0) {            System.out.println((a4 * a4)/a3);        } else {            System.out.println(42);        }     }     static String next() throws IOException {         while (st == null || !st.hasMoreElements()) {            st = new StringTokenizer(bufferedReader.readLine());        }         return st.nextToken();    }}