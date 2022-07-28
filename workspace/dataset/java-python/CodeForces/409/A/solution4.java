import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.FileReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author OmarYasser */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.solve(1, in, out);        out.close();    }     static class TaskA {        public void solve(int testNumber, Scanner sc, PrintWriter out) {            char[] s1 = sc.next().toCharArray();            char[] s2 = sc.next().toCharArray();            int res = 0;            for (int i = 0; i < s1.length; i += 2)                if (s1[i] == '[') {                    if (s2[i] == '8') res++;                    else if (s2[i] == '(') res--;                } else if (s1[i] == '8') {                    if (s2[i] == '(') res++;                    else if (s2[i] == '[') res--;                } else {                    if (s2[i] == '[') res++;                    else if (s2[i] == '8') res--;                }            out.println(res < 0 ? "TEAM 1 WINS" : res > 0 ? "TEAM 2 WINS" : "TIE");        }     }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public Scanner(FileReader f) {            br = new BufferedReader(f);        }         public String next() {            while (st == null || !st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (Exception e) {                }            return st.nextToken();        }     }} 
