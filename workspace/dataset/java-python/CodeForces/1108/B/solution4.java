import java.io.*;import java.util.*; import static java.lang.Integer.*; public class Main {    public static void main(String[] args) throws IOException {        FastReader in = new FastReader(System.in);        PrintWriter pw = new PrintWriter(System.out);        int n = in.nextInt();        HashMap<Integer, Integer> map = new HashMap<>();        ArrayList<Integer> ocr = new ArrayList<>();        ArrayList<Integer> all = new ArrayList<>();        for (int i = 0; i < n; i++) {            int d = in.nextInt();            int oc = map.getOrDefault(d, 0);            oc++;            map.put(d, oc);        }        for (Map.Entry<Integer, Integer> m: map.entrySet()) {            int val = m.getValue();            int key = m.getKey();            if (val > 1) {                ocr.add(key);            }            all.add(key);        }        Collections.sort(all);        int num1 = all.get(0) * all.get(all.size() - 1);        for (int i = 0; i < all.size(); i++) {            if (num1 % all.get(i) != 0) ocr.add(all.get(i));        }        Collections.sort(ocr);        int num2 = ocr.get(0) * ocr.get(ocr.size() - 1);        pw.println(num1 + " " + num2);        pw.close();    }      static void debug(Object... obj) {        System.err.println(Arrays.deepToString(obj));    }     static class FastReader {        InputStream is;        private byte[] inbuf = new byte[1024];        private int lenbuf = 0, ptrbuf = 0;         public FastReader(InputStream is) {            this.is = is;        }         public int readByte() {            if (lenbuf == -1) throw new InputMismatchException();            if (ptrbuf >= lenbuf) {                ptrbuf = 0;                try {                    lenbuf = is.read(inbuf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (lenbuf <= 0) return -1;            }            return inbuf[ptrbuf++];        }         public boolean isSpaceChar(int c) {            return !(c >= 33 && c <= 126);        }         private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }         public int skip() {            int b;            while ((b = readByte()) != -1 && isSpaceChar(b)) ;            return b;        }         public String next() {            int b = skip();            StringBuilder sb = new StringBuilder();            while (!(isSpaceChar(b))) {                sb.appendCodePoint(b);                b = readByte();            }            return sb.toString();        }          public String nextLine() {            int c = skip();            StringBuilder sb = new StringBuilder();            while (!isEndOfLine(c)) {                sb.appendCodePoint(c);                c = readByte();            }            return sb.toString();        }         public int nextInt() {            int num = 0, b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }            while (true) {                if (b >= '0' && b <= '9') {                    num = (num << 3) + (num << 1) + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }         public long nextLong() {            long num = 0;            int b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }             while (true) {                if (b >= '0' && b <= '9') {                    num = (num << 3) + (num << 1) + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }         public double nextDouble() {            return Double.parseDouble(next());        }         public char[] next(int n) {            char[] buf = new char[n];            int b = skip(), p = 0;            while (p < n && !(isSpaceChar(b))) {                buf[p++] = (char) b;                b = readByte();            }            return n == p ? buf : Arrays.copyOf(buf, p);        }         public char readChar() {            return (char) skip();        }    } }    	 		 	  		 	  	 					  	 	
