 import java.util.*;import java.lang.*;import java.io.*;import java.math.*;import java.text.*;public class Prac{         static class InputReader {         private final InputStream stream;        private final byte[] buf = new byte[8192];        private int curChar, snumChars;        public InputReader(InputStream st) {            this.stream = st;        }         public int read() {            if (snumChars == -1)                throw new InputMismatchException();            if (curChar >= snumChars) {                curChar = 0;                try {                    snumChars = stream.read(buf);                }                 catch (IOException e) {                    throw new InputMismatchException();                }                if (snumChars <= 0)                    return -1;            }            return buf[curChar++];        }        public int ni() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public long nl() {            int c = read();            while (isSpaceChar(c)) {            c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public int[] nia(int n) {            int a[] = new int[n];            for (int i = 0; i < n; i++) {                a[i] = ni();            }            return a;        }         public String rs() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                    c = read();            } while (!isSpaceChar(c));            return res.toString();        }        public String nextLine() {            int c = read();            while (isSpaceChar(c))                c = read();            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isEndOfLine(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }     }    public static class Key {         private final int x;        private final int y;         public Key(int x, int y) {            this.x = x;            this.y = y;        }         @Override        public boolean equals(Object o) {            if (this == o) return true;            if (!(o instanceof Key)) return false;            Key key = (Key) o;            return x == key.x && y == key.y;        }         @Override        public int hashCode() {            int result = x;            result = 31 * result + y;            return result;        }     }        static PrintWriter w = new PrintWriter(System.out);    static long mod=998244353L,mod1=1000000007;        public static void main(String [] args){        InputReader sc=new InputReader(System.in);        int n=sc.ni(),m=sc.ni();        int max=0;        int arr[][]=new int[m][2];        for(int i=0;i<m;i++){            arr[i][0]=sc.ni();            arr[i][1]=sc.ni();        }        int c=0,ans=0;        ArrayList<Integer> a=new ArrayList<>();        for(int i=1;i<=100;i++){            boolean f=false;            for(int j=0;j<m;j++){                int fl=arr[j][1];                int s=(fl-1)*(i)+1,e=fl*i;                if(arr[j][0]<s||arr[j][0]>e){                    f=true;                    break;                }            }            if(!f){                a.add(i);            }        }        if(a.size()==0)w.println(-1);                else {            ans=(int)Math.ceil((double)n/(double)a.get(0));            boolean f=false;            for(int i:a){                if(Math.ceil((double)n/(double)i)!=ans){                    f=true;                }            }            w.println(f?-1:ans);        }        w.close();    }}