import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.util.HashSet;import java.util.Set;import java.util.StringTokenizer; /** * Created by Katushka on 28.01.2020. */public class Shockers {     public static void main(String[] args) {        InputReader in = new InputReader(System.in);        int n = in.nextInt();         Set<Character> possible = new HashSet<>();        for (char ch = 'a'; ch < 'z' + 1; ch++) {            possible.add(ch);        }         int ans = 0;        boolean known = false;        for (int i = 0; i < n - 1; i++) {            String s = in.nextString();            int result = s.charAt(0);            s = s.substring(2);            if (known && (result == '!' || result == '?')) {                ans++;                continue;            }             if (result == '.') {                for (int j = 0; j < s.length(); j++) {                    if (possible.contains(s.charAt(j))) {                        possible.remove(s.charAt(j));                    }                }            } else if (result == '!') {                Set<Character> newPossible = new HashSet<>();                for (int j = 0; j < s.length(); j++) {                    if (possible.contains(s.charAt(j))) {                        newPossible.add(s.charAt(j));                    }                }                possible = newPossible;            } else if (result == '?') {                possible.remove(s.charAt(0));            }            if (possible.size() == 1) {                known = true;            }        }        System.out.println(ans);    }     private static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    final String str = reader.readLine();                    tokenizer = new StringTokenizer(str);                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public String nextString() {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public char nextChar() {            return next().charAt(0);        }    }}
