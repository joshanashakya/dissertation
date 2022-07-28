 import java.util.*;import java.lang.*;import java.io.*;import java.math.*;public class Prac{         static class InputReader {         private final InputStream stream;        private final byte[] buf = new byte[8192];        private int curChar, snumChars;        public InputReader(InputStream st) {            this.stream = st;        }         public int read() {            if (snumChars == -1)                throw new InputMismatchException();            if (curChar >= snumChars) {                curChar = 0;                try {                    snumChars = stream.read(buf);                }                 catch (IOException e) {                    throw new InputMismatchException();                }                if (snumChars <= 0)                    return -1;            }            return buf[curChar++];        }        public int ni() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public long nl() {            int c = read();            while (isSpaceChar(c)) {            c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public int[] nia(int n) {            int a[] = new int[n];            for (int i = 0; i < n; i++) {                a[i] = ni();            }            return a;        }         public String rs() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                    c = read();            } while (!isSpaceChar(c));            return res.toString();        }        public String nextLine() {            int c = read();            while (isSpaceChar(c))                c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isEndOfLine(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }     }    public static class Key {         private final int x;        private final int y;         public Key(int x, int y) {            this.x = x;            this.y = y;        }         @Override        public boolean equals(Object o) {            if (this == o) return true;            if (!(o instanceof Key)) return false;            Key key = (Key) o;            return x == key.x && y == key.y;        }         @Override        public int hashCode() {            int result = x;            result = 31 * result + y;            return result;        }     }    static class Pair{        int x,y;        public Pair(int x,int y){            this.y=y;            this.x=x;        }    }          static PrintWriter w = new PrintWriter(System.out);    static long mod=998244353L,mod1=1000000007;            public static void main(String [] args){        InputReader sc=new InputReader(System.in);        int n=sc.ni();        boolean f=false,f1=false;        int c=0;        TreeSet<Character> set=new TreeSet<>();        TreeSet<Character> temp=new TreeSet<>();        for(int i=0;i<26;i++)set.add((char)(i+'a'));        for(int i=0;i<n-1;i++){                        char arr[]=sc.nextLine().toCharArray();            if(arr[0]=='.'){                for(int j=2;j<arr.length;j++)set.remove(arr[j]);            }            else if(arr[0]=='!'){                if(f)c++;                else {                    temp.clear();                    for(int j=2;j<arr.length;j++){                        if(set.contains(arr[j]))temp.add(arr[j]);                    }                    set.retainAll(temp);                }            }            else {                if(f)c++;                else set.remove(arr[2]);                            }            if(set.size()==1){                f=true;            }        }        w.println(c);        w.close();    }}