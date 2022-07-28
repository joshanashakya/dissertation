import java.io.*;import java.lang.Math;import java.util.*; public class Main  {     public BufferedReader in;    public PrintStream out;     public boolean log_enabled = false;        public boolean multiply_tests = true;     public static boolean do_gen_test = false;        public void gen_test() {                        }        private class TestCase {         public Object solve() {                        int n = readInt();            int[] a = readIntArray(2*n);                        Arrays.sort(a);                        return a[n] - a[n-1];                        //return strf("%f", 0);                        //out.printf("Case #%d: \n", caseNumber);            //return null;        }                public int caseNumber;                TestCase(int number) {            caseNumber = number;        }                public void run(){            Object r = this.solve();                        if ((r != null))            {                //outputCaseNumber(r);                out.println(r);            }        }                public String impossible(){            return "IMPOSSIBLE";        }                public String strf(String format, Object... args)        {            return String.format(format, args);        }        //        public void outputCaseNumber(Object r){//            //out.printf("Case #%d:", caseNumber);//            if (r != null)//            {//              //  out.print(" ");//                out.print(r);//            }//            out.print("\n");//        }    }     public void run() {        //while (true)        {            int t = multiply_tests ?  readInt() : 1;            for (int i = 0; i < t; i++) {                TestCase T = new TestCase(i + 1);                T.run();            }        }    }             public Main(BufferedReader _in, PrintStream _out){        in = _in;        out = _out;    }         public static void main(String args[]) {        Locale.setDefault(Locale.US);        Main S;        try {            S = new Main(                        new BufferedReader(new InputStreamReader(System.in)),                        System.out                );        } catch (Exception e) {            return;        }                S.run();            }     private StringTokenizer tokenizer = null;     public int readInt() {        return Integer.parseInt(readToken());    }     public long readLong() {        return Long.parseLong(readToken());    }     public double readDouble() {        return Double.parseDouble(readToken());    }     public String readLn() {        try {            String s;            while ((s = in.readLine()).length() == 0);            return s;        } catch (Exception e) {            return "";        }    }     public String readToken() {        try {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                tokenizer = new StringTokenizer(in.readLine());            }            return tokenizer.nextToken();        } catch (Exception e) {            return "";        }    }     public int[] readIntArray(int n) {        int[] x = new int[n];        readIntArray(x, n);        return x;    }        public int[] readIntArrayBuf(int n) {        int[] x = new int[n];        readIntArrayBuf(x, n);        return x;    }     public void readIntArray(int[] x, int n) {        for (int i = 0; i < n; i++) {            x[i] = readInt();        }    }        public long[] readLongArray(int n) {        long[] x = new long[n];        readLongArray(x, n);        return x;    }        public long[] readLongArrayBuf(int n) {        long[] x = new long[n];        readLongArrayBuf(x, n);        return x;    }     public void readLongArray(long[] x, int n) {        for (int i = 0; i < n; i++) {            x[i] = readLong();        }    }     public void logWrite(String format, Object... args) {        if (!log_enabled) {            return;        }         out.printf(format, args);    }        public void readLongArrayBuf(long[] x, int n) {                char[]buf = new char[1000000];        long r = -1;        int k= 0, l = 0;        long d;                while (true)        {            try{                l = in.read(buf, 0, 1000000);            }            catch(Exception E){};                        for (int i=0; i<l; i++)            {                if (('0'<=buf[i])&&(buf[i]<='9'))                {                    if (r == -1)                    {                        r = 0;                    }                    d = buf[i] - '0';                    r = 10 * r + d;                }                else                {                    if (r != -1)                    {                        x[k++] = r;                    }                                        r = -1;                }            }                        if (l<1000000)                return;        }    }        public void readIntArrayBuf(int[] x, int n) {                char[]buf = new char[1000000];        int r = -1;        int k= 0, l = 0;        int d;                while (true)        {            try{                l = in.read(buf, 0, 1000000);            }            catch(Exception E){};                        for (int i=0; i<l; i++)            {                if (('0'<=buf[i])&&(buf[i]<='9'))                {                    if (r == -1)                    {                        r = 0;                    }                    d = buf[i] - '0';                    r = 10 * r + d;                }                else                {                    if (r != -1)                    {                        x[k++] = r;                    }                                        r = -1;                }            }                        if (l<1000000)                return;        }    }        public void printArray(long[] a, int n)    {        printArray(a, n, ' ');    }        public void printArray(int[] a, int n)    {        printArray(a, n, ' ');    }                public void printArray(long[] a, int n, char dl)    {        long x;         int i, l = 0;        for (i=0; i<n; i++)        {            x = a[i];                        if (x<0)            {                x = -x;                l++;            }                        if (x==0)            {                l++;            }            else            {                while (x>0)                {                    x /= 10;                    l++;                }            }        }                l += n-1;                char[] s = new char[l];                l--;        boolean z;        for (i=n-1; i>=0;  i--)        {            x = a[i];            z = false;                        if (x<0)            {                x = -x;                z = true;            }                        do{                s[l--] = (char)('0' + (x % 10));                x /= 10;            } while (x>0);                        if (z)            {                s[l--] = '-';            }                        if (i>0)            {                s[l--] = dl;            }        }                out.println(new String(s));    }        public void printArray(int[] a, int n, char dl)    {        int x;         int i, l = 0;        for (i=0; i<n; i++)        {            x = a[i];                        if (x<0)            {                x = -x;                l++;            }                        if (x==0)            {                l++;            }            else            {                while (x>0)                {                    x /= 10;                    l++;                }            }        }                l += n-1;                char[] s = new char[l];                l--;        boolean z;        for (i=n-1; i>=0;  i--)        {            x = a[i];            z = false;                        if (x<0)            {                x = -x;                z = true;            }                        do{                s[l--] = (char)('0' + (x % 10));                x /= 10;            } while (x>0);                        if (z)            {                s[l--] = '-';            }                        if (i>0)            {                s[l--] = dl;            }        }                out.println(new String(s));    }        public void printMatrix(int[][] a, int n, int m)    {        int x;         int i,j, l = 0;        for (i=0; i<n; i++)        {            for (j=0; j<m; j++)            {                x = a[i][j];                            if (x<0)                {                    x = -x;                    l++;                }                 if (x==0)                {                    l++;                }                else                {                    while (x>0)                    {                        x /= 10;                        l++;                    }                }            }                        l += m-1;        }                l += n-1;                        char[] s = new char[l];                l--;        boolean z;        for (i=n-1; i>=0;  i--)        {            for (j=m-1; j>=0;  j--)            {                x = a[i][j];                z = false;                            if (x<0)                {                    x = -x;                    z = true;                }                 do{                    s[l--] = (char)('0' + (x % 10));                    x /= 10;                } while (x>0);                 if (z)                {                    s[l--] = '-';                }                 if (j>0)                {                    s[l--] = ' ';                }            }                        if (i>0)            {                 s[l--] = '\n';            }        }                out.println(new String(s));    }        public void printMatrix(long[][] a, int n, int m)    {        long x;         int i,j, l = 0;        for (i=0; i<n; i++)        {            for (j=0; j<m; j++)            {                x = a[i][j];                            if (x<0)                {                    x = -x;                    l++;                }                 if (x==0)                {                    l++;                }                else                {                    while (x>0)                    {                        x /= 10;                        l++;                    }                }            }                        l += m-1;        }                l += n-1;                        char[] s = new char[l];                l--;        boolean z;        for (i=n-1; i>=0;  i--)        {            for (j=m-1; j>=0;  j--)            {                x = a[i][j];                z = false;                            if (x<0)                {                    x = -x;                    z = true;                }                 do{                    s[l--] = (char)('0' + (x % 10));                    x /= 10;                } while (x>0);                 if (z)                {                    s[l--] = '-';                }                 if (j>0)                {                    s[l--] = ' ';                }            }                        if (i>0)            {                 s[l--] = '\n';            }        }                out.println(new String(s));    }        }
