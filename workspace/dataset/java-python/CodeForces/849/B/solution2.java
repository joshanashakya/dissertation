 import java.util.*;import java.lang.*;import java.io.*;public class Prac{         static class InputReader {         private final InputStream stream;        private final byte[] buf = new byte[8192];        private int curChar, snumChars;        public InputReader(InputStream st) {            this.stream = st;        }         public int read() {            if (snumChars == -1)                throw new InputMismatchException();            if (curChar >= snumChars) {                curChar = 0;                try {                    snumChars = stream.read(buf);                }                 catch (IOException e) {                    throw new InputMismatchException();                }                if (snumChars <= 0)                    return -1;            }            return buf[curChar++];        }        public int ni() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public long nl() {            int c = read();            while (isSpaceChar(c)) {            c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public int[] nia(int n) {            int a[] = new int[n];            for (int i = 0; i < n; i++) {                a[i] = ni();            }            return a;        }         public String rs() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                    c = read();            } while (!isSpaceChar(c));            return res.toString();        }        public String nextLine() {            int c = read();            while (isSpaceChar(c))                c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isEndOfLine(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }     }    public static class Key {         private final int x;        private final int y;         public Key(int x, int y) {            this.x = x;            this.y = y;        }         @Override        public boolean equals(Object o) {            if (this == o) return true;            if (!(o instanceof Key)) return false;            Key key = (Key) o;            return x == key.x && y == key.y;        }         @Override        public int hashCode() {            int result = x;            result = 31 * result + y;            return result;        }     }        static PrintWriter w = new PrintWriter(System.out);    static long mod=998244353L,mod1=1000000007;    static class Pair{        int x,y;        public Pair(int x,int y){            this.x=x;            this.y=y;        }    }    static long arr[],n;    static boolean valid(long x1,long y1,long x2,long y2){        long x2x1=x2-x1,y2y1=y2-y1;        ArrayList<Long> a=new ArrayList<>();        for(long i=0;i<n;i++){            if(x2x1*(arr[(int)i]-y1)==y2y1*(i-x1))continue;            else a.add(i);        }        if(a.size()==1)return true;        else if(a.size()>1){            boolean f=true;            x2=a.get(1);x1=a.get(0);y1=arr[(int)x1];y2=arr[(int)x2];            for(long x:a){                if((x2-x1)*(arr[(int)x]-y1)-(y2-y1)*(x-x1)!=0){                    return false;                }            }            long x2x3=x2-x1,y2y3=y2-y1;            if(y2y1*x2x3==y2y3*x2x1)return true;            else return false;                        }        return false;    }    public static void main(String [] args){        InputReader sc=new InputReader(System.in);        n=sc.ni();        arr=new long[(int)n];        for(int i=0;i<n;i++)arr[i]=sc.ni();        boolean f=valid(0,arr[0],1,arr[1])|valid(1,arr[1],2,arr[2])|valid(0,arr[0],2,arr[2]);        w.println(f?"YES":"NO");                w.close();    }}
