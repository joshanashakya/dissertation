import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Scanner;import java.util.StringTokenizer; import static java.lang.Math.max;import java.util.HashSet; public class Test {//=============================Solution===================================//        public static void main(String[] args) {         Reader input = new Reader();        PrintWriter out = new PrintWriter(System.out);        String s = input.next();        int a = input.nextInt() % 1440;           int h = Integer.parseInt(s.substring(0, 2));        int m = Integer.parseInt(s.substring(3));        int ph = a / 60;        int pm = a - ph * 60;         h += ph;        m += pm;             if (m >= 60) {            m -= 60;            h++;        }        if (h >= 24) {            h -= 24;        }        out.printf("%02d:%02d", h, m);        out.close();    }  //========================================================================//    static class Reader {                BufferedReader br;        StringTokenizer st;         public Reader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {             while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException ex) {                    ex.printStackTrace();                }            }            return st.nextToken();        }         String nextLine() {             String str = "";            try {                str = br.readLine();            } catch (IOException ex) {                ex.printStackTrace();            }            return str;        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }    }}