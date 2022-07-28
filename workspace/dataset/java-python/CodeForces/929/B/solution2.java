import java.io.*;import java.util.*; public class B {    static class Reader {        BufferedReader in;         Reader() throws IOException {            in = new BufferedReader(new InputStreamReader(System.in));        }         Reader(String name) throws IOException {            in = new BufferedReader(new FileReader(name));        }         StringTokenizer tokin = new StringTokenizer("");         String next() throws IOException {            while (!tokin.hasMoreTokens()) {                tokin = new StringTokenizer(in.readLine());            }            return tokin.nextToken();        }         int nextInt() throws IOException {            return Integer.parseInt(next());        }         long nextLong() throws IOException {            return Long.parseLong(next());        }    }     static class Writer {        PrintWriter cout;         Writer() throws IOException {            cout = new PrintWriter(System.out);        }         Writer(String name) throws IOException {            cout = new PrintWriter(new FileWriter(name));        }         StringBuilder out = new StringBuilder();         void print(Object a) {            out.append(a);        }         void close() {            cout.print(out.toString());            cout.close();        }    }     public static void main(String args[]) throws IOException {        Reader in = new Reader();        Writer out = new Writer();        int n = in.nextInt();        int k = in.nextInt();        int a[][] = new int[n][3];        int b[][] = new int[n][4];        int c[][] = new int[n][3];        ///  READING P - 1   S - 2        for (int i = 0; i < n; i++) {            String s = in.next();            for (int j = 0; j < 3; j++) {                if ((int) s.charAt(j) == (int) 'P')                    a[i][j] = 1;                if ((int) s.charAt(j) == (int) 'S')                    a[i][j] = 2;            }            for (int j = 0; j < 4; j++) {                if ((int) s.charAt(4 + j) == (int) 'P')                    b[i][j] = 1;                if ((int) s.charAt(4 + j) == (int) 'S')                    b[i][j] = 2;            }            for (int j = 0; j < 3; j++) {                if ((int) s.charAt(9 + j) == (int) 'P')                    c[i][j] = 1;                if ((int) s.charAt(9 + j) == (int) 'S')                    c[i][j] = 2;            }        }        //// READING         /// a, b, c nol        for (int i = 0; i < n && k > 0; i++) {            //////////////////// a            if (a[i][0] == 0 && a[i][1] != 2 && k > 0) {                a[i][0] = 3;                k--;            }            if (a[i][1] == 0 && a[i][0] != 2 && a[i][2] != 2 && k > 0) {                a[i][1] = 3;                k--;            }            if (a[i][2] == 0 && a[i][1] != 2 && k > 0) {                a[i][2] = 3;                k--;            }            //////////////////// b            if (b[i][0] == 0 && b[i][1] != 2 && k > 0) {                b[i][0] = 3;                k--;            }            if (b[i][1] == 0 && b[i][0] != 2 && b[i][2] != 2 && k > 0) {                b[i][1] = 3;                k--;            }            if (b[i][2] == 0 && b[i][1] != 2 && b[i][3] != 2 && k > 0) {                b[i][2] = 3;                k--;            }            if (b[i][3] == 0 && b[i][2] != 2 && k > 0) {                b[i][3] = 3;                k--;            }            //////////////////// с            if (c[i][0] == 0 && c[i][1] != 2 && k > 0) {                c[i][0] = 3;                k--;            }            if (c[i][1] == 0 && c[i][0] != 2 && c[i][2] != 2 && k > 0) {                c[i][1] = 3;                k--;            }            if (c[i][2] == 0 && c[i][1] != 2 && k > 0) {                c[i][2] = 3;                k--;            }         }         //// a, b, c 1        for (int i = 0; i < n && k > 0; i++) {            //////////// a            if (a[i][0] == 0 && k > 0) {                a[i][0] = 3;                k--;            }            if (a[i][1] == 0 && (a[i][0] != 2 || a[i][2] != 2) && k > 0) {                a[i][1] = 3;                k--;            }            if (a[i][2] == 0 && k > 0) {                a[i][2] = 3;                k--;            }            //////// b            if (b[i][0] == 0 && k > 0) {                b[i][0] = 3;                k--;            }            if (b[i][1] == 0 && (b[i][0] != 2 || b[i][2] != 2) && k > 0) {                b[i][1] = 3;                k--;            }             if (b[i][2] == 0 && (b[i][1] != 2 || b[i][3] != 2) && k > 0) {                b[i][2] = 3;                k--;            }            if (b[i][3] == 0 && k > 0) {                b[i][3] = 3;                k--;            }            //////////////// c            if (c[i][0] == 0 && k > 0) {                c[i][0] = 3;                k--;            }            if (c[i][1] == 0 && (c[i][0] != 2 || c[i][2] != 2) && k > 0) {                c[i][1] = 3;                k--;            }            if (c[i][2] == 0 && k > 0) {                c[i][2] = 3;                k--;            }        }        // a, b, c 2        for (int i = 0; i < n && k > 0; i++) {            for (int j = 0; j < 3; j++) {                if (a[i][j] == 0 && k > 0) {                    a[i][j] = 3;                    k--;                }                if (c[i][j] == 0 && k > 0) {                    c[i][j] = 3;                    k--;                }            }            for (int j = 0; j < 4; j++) {                if (b[i][j] == 0 && k > 0) {                    b[i][j] = 3;                    k--;                }            }        }        long ans = 0;        for (int i = 0; i < n; i++) {            for (int j = 0; j < 3; j++) {                if (a[i][j] == 2 && j + 1 < 3 && a[i][j + 1] != 0)                    ans++;                if (a[i][j] == 2 && j - 1 > -1 && a[i][j - 1] != 0)                    ans++;                if (c[i][j] == 2 && j + 1 < 3 && c[i][j + 1] != 0)                    ans++;                if (c[i][j] == 2 && j - 1 > -1 && c[i][j - 1] != 0)                    ans++;            }            for (int j = 0; j < 4; j++) {                if (b[i][j] == 2 && j + 1 < 4 && b[i][j + 1] != 0)                    ans++;                if (b[i][j] == 2 && j - 1 > -1 && b[i][j - 1] != 0)                    ans++;            }        }         out.print(ans + "\n");        for (int i = 0; i < n; i++) {            for (int j = 0; j < 3; j++) {                if (a[i][j] == 0)                    out.print(".");                if (a[i][j] == 1)                    out.print("P");                if (a[i][j] == 2)                    out.print("S");                if (a[i][j] == 3)                    out.print("x");            }            out.print("-");            for (int j = 0; j < 4; j++) {                if (b[i][j] == 0)                    out.print(".");                if (b[i][j] == 1)                    out.print("P");                if (b[i][j] == 2)                    out.print("S");                if (b[i][j] == 3)                    out.print("x");            }            out.print("-");            for (int j = 0; j < 3; j++) {                if (c[i][j] == 0)                    out.print(".");                if (c[i][j] == 1)                    out.print("P");                if (c[i][j] == 2)                    out.print("S");                if (c[i][j] == 3)                    out.print("x");            }            out.print("\n");        }        out.close();    }}