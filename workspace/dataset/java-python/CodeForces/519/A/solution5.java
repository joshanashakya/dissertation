import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Map;import java.util.HashMap;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Stirbul */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        AAAndBAndChess solver = new AAAndBAndChess();        solver.solve(1, in, out);        out.close();    }     static class AAAndBAndChess {        public void solve(int testNumber, FastReader in, PrintWriter out) {            Map<Character, Integer> map = new HashMap<>();            map.put('q', 9);            map.put('r', 5);            map.put('b', 3);            map.put('n', 3);            map.put('p', 1);            map.put('k', 0);             int white = 0;            int black = 0;            for (int i = 0; i < 8; ++i) {                String s = in.nextLine();                for (int j = 0; j < s.length(); ++j) {                    if (s.charAt(j) != '.') {                        if (Character.isUpperCase(s.charAt(j))) {                            white += map.get(Character.toLowerCase(s.charAt(j)));                        } else {                            black += map.get(s.charAt(j));                        }                    }                }            }             if (white > black) {                out.println("White");            } else if (white < black) {                out.println("Black");            } else {                out.println("Draw");            }        }     }     static class FastReader {        BufferedReader br;         public FastReader(InputStream inputStream) {            br = new BufferedReader(new InputStreamReader(inputStream));        }         public String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }     }} 