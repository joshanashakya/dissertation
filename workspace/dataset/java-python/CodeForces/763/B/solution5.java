import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.Writer;import java.io.OutputStreamWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author prakharjain */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        DTimofeyAndRectangles solver = new DTimofeyAndRectangles();        solver.solve(1, in, out);        out.close();    }     static class DTimofeyAndRectangles {        public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.nextInt();             rect[] rects = new rect[n];             out.println("YES");            for (int i = 0; i < n; i++) {                int x1 = in.nextInt();                int y1 = in.nextInt();                int x2 = in.nextInt();                int y2 = in.nextInt();                 x2 += 1000000000;                y1 += 1000000000;                 rects[i] = new rect(x1, y1, x2, y2, i);                 int ans = 0;                 if (x2 % 2 == 1) {                    ans += 1;                }                 if (y1 % 2 == 1) {                    ans += 2;                }                 out.println(ans + 1);            } //        Map<Integer, List<range>> xlmap = new HashMap<>();//        Map<Integer, List<range>> xrmap = new HashMap<>();//        Map<Integer, List<range>> ylmap = new HashMap<>();//        Map<Integer, List<range>> yrmap = new HashMap<>();////        for (int i = 0; i < n; i++) {//            rect cr = rects[i];////            //left ver//            range cr1 = new range(cr.y1, cr.y2, i);////            //right ver//            range cr2 = new range(cr.y1, cr.y2, i);////            //up hor//            range cr3 = new range(cr.x1, cr.x2, i);////            range cr4 = new range(cr.x1, cr.x2, i);////            if (!xlmap.containsKey(cr.x1)) {//                xlmap.put(cr.x1, new ArrayList<>());//            }////            if (!ylmap.containsKey(cr.y1)) {//                ylmap.put(cr.y1, new ArrayList<>());//            }////            if (!xrmap.containsKey(cr.x2)) {//                xrmap.put(cr.x2, new ArrayList<>());//            }////            if (!yrmap.containsKey(cr.y2)) {//                yrmap.put(cr.y2, new ArrayList<>());//            }////            xlmap.get(cr.x1).add(cr1);//            ylmap.get(cr.y1).add(cr3);//            xrmap.get(cr.x2).add(cr2);//            yrmap.get(cr.y2).add(cr4);//        }////        for (int key : xlmap.keySet()) {//            xlmap.get(key).sort((t1, t2) -> t1.l - t2.l);//        }////        for (int key : ylmap.keySet()) {//            ylmap.get(key).sort((t1, t2) -> t1.l - t2.l);//        }////        for (int key : xrmap.keySet()) {//            xrmap.get(key).sort((t1, t2) -> t1.l - t2.l);//        }////        for (int key : yrmap.keySet()) {//            yrmap.get(key).sort((t1, t2) -> t1.l - t2.l);//        }////        g = new List[n];////        for (int i = 0; i < n; i++) {//            g[i] = new ArrayList();//        }////        for (int i = 0; i < n; i++) {//            rect cr = rects[i];////            List<range> cl = xrmap.get(cr.x1);//            range r1 = indices(cl, cr.y1, cr.y2);////            for (int j = r1.l; j <= r1.r; j++) {//                g[cr.i].add(cl.get(j).i);//                //g[cl.get(j).i].add(cr.i);//            }////            cl = ylmap.get(cr.y2);//            r1 = indices(cl, cr.x1, cr.x2);////            for (int j = r1.l; j <= r1.r; j++) {//                g[cr.i].add(cl.get(j).i);//                //g[cl.get(j).i].add(cr.i);//            }////            cl = xlmap.get(cr.x2);//            r1 = indices(cl, cr.y1, cr.y2);////            for (int j = r1.l; j <= r1.r; j++) {//                g[cr.i].add(cl.get(j).i);//                //g[cl.get(j).i].add(cr.i);//            }////            cl = yrmap.get(cr.y1);//            r1 = indices(cl, cr.x1, cr.x2);////            for (int j = r1.l; j <= r1.r; j++) {//                g[cr.i].add(cl.get(j).i);//                //g[cl.get(j).i].add(cr.i);//            }//        }////        int[] ans = new int[n];////        List<Integer> vd = new ArrayList<>();////        for (int i = 0; i < n; i++) {//            vd.add(i);//        }////        vd.sort((v1, v2) -> g[v2].size() - g[v1].size());////        for (int k = 0; k < n; k++) {////            int i = vd.get(k);////            Set<Integer> s = new HashSet<>();////            for (int j = 0; j < g[i].size(); j++) {//                int v = (int) g[i].get(j);////                if (ans[v] != 0) {//                    s.add(ans[v]);//                }//            }////            for (int j = 1; j <= 4; j++) {//                if (!s.contains(j)) {//                    ans[i] = j;//                    break;//                }//            }//        }////        out.println("YES");////        for (int i = 0; i < n; i++) {//            out.println(ans[i]);//        }        }         class rect {            int x1;            int y1;            int x2;            int y2;            int i;             public rect(int x1, int y1, int x2, int y2, int i) {                this.x1 = x1;                this.y1 = y1;                this.x2 = x2;                this.y2 = y2;                this.i = i;            }         }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public int nextInt() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void print(Object... objects) {            for (int i = 0; i < objects.length; i++) {                if (i != 0) {                    writer.print(' ');                }                writer.print(objects[i]);            }        }         public void println(Object... objects) {            print(objects);            writer.println();        }         public void close() {            writer.close();        }         public void println(int i) {            writer.println(i);        }     }} 