import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastI in = new FastI(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AAcaciusAndString solver = new AAcaciusAndString();        solver.solve(1, in, out);        out.close();    }     static class AAcaciusAndString {        static int check(StringBuilder ch) {            String a = "abacaba";            int count = 0;            for (int i = 0; i + a.length() - 1 < ch.length(); i++) {                int j;                for (j = 0; j < 7; j++) {                    if (ch.charAt(i + j) != a.charAt(j)) {                        break;                    }                }                if (j == 7) {                    count++;                }            }            return count;        }         public void solve(int testNumber, FastI sc, PrintWriter out) {            int t = sc.nextInt();            loop:            while (t > 0) {                t--;                int n = sc.nextInt();                StringBuilder s = new StringBuilder(sc.nextLine());                String a = "abacaba";                int count = check(s);                if (count == 1) {                    for (int i = 0; i < s.length(); i++) {                        if (s.charAt(i) == '?') {                            s.setCharAt(i, 'd');                        }                    }                    out.println("Yes");                    out.println(s);                    continue;                }                if (count == 0) {                    for (int i = 0; i + a.length() - 1 < n; i++) {                        int j;                        for (j = 0; j < 7; j++) {                            if (s.charAt(i + j) != a.charAt(j) && s.charAt(i + j) != '?') {                                break;                            }                        }                        if (j == 7) {                            StringBuilder tmp = new StringBuilder(s);                            for (j = 0; j < 7; j++) {                                tmp.setCharAt(i + j, a.charAt(j));                            }                            int c = check(tmp);                            if (c == 1) {                                for (j = 0; j < i; j++) {                                    if (tmp.charAt(j) == '?') {                                        tmp.setCharAt(j, 'd');                                    }                                }                                for (j = i + 7; j < n; j++) {                                    if (tmp.charAt(j) == '?') {                                        tmp.setCharAt(j, 'd');                                    }                                }                                out.println("Yes");                                out.println(tmp);                                continue loop;                            }                        }                    }                }                out.println("No");            }        }     }     static class FastI {        BufferedReader br;        StringTokenizer st;         public FastI(InputStream inputStream) {            br = new BufferedReader(new                    InputStreamReader(inputStream));         }         public String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }     }} 
