import java.util.*;import java.io.*; public class Div680 {    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                                                                                                               /////////////////                                                                                                               /////////////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMMMM      MMMMMM      OOO      OOO        SSSS   SSS     EEEEEEEEEEEEE  /////////////////   HHHH        HHHH  EEEEE           MMMM MMM  MMM MMMM    OOO          OOO    SSSS       SSS   EEEEE          /////////////////   HHHH        HHHH  EEEEE           MMMM  MMMMMM  MMMM   OOO            OOO   SSSS             EEEEE          /////////////////   HHHH        HHHH  EEEEE           MMMM          MMMM  OOO              OOO   SSSSSSS         EEEEE          /////////////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO      SSSSSS       EEEEEEEEEEE    /////////////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO         SSSSSSS   EEEEEEEEEEE    /////////////////   HHHH        HHHH  EEEEE           MMMM          MMMM   OOO            OOO              SSSS  EEEEE          /////////////////   HHHH        HHHH  EEEEE           MMMM          MMMM    OOO          OOO     SSS       SSSS  EEEEE          /////////////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM      OOO      OOO        SSS    SSSS    EEEEEEEEEEEEE  /////////////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////////////                                                                                                               /////////////////                                                                                                               /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     static int[] prefixFunction(char[] s)        // O(n)    {        int n = s.length, pi[] = new int[n];        for (int i = 1, j = 0; i < n; ++i)        //j = pi[i-1] at the beginning of every iteration        {            while (j > 0 && s[i] != s[j])                j = pi[j - 1];            if (s[i] == s[j])                ++j;            pi[i] = j;        }        return pi;    }     public static void main(String[] args) throws IOException {        Scanner sc = new Scanner(System.in);        PrintWriter pw = new PrintWriter(System.out);        char[] s = sc.next().toCharArray();        char[] t = sc.next().toCharArray();        int[] c = new int[2];        for (char x : s)            c[x - '0']++;        int[] nedd = prefixFunction(t); //        System.err.println(Arrays.toString(nedd));        int id = 0;        while (true) {            int cur = t[id] - '0';            if (c[cur] == 0)                break;            c[cur]--;            pw.print(cur);            if (id == t.length - 1) {                id = nedd[id];            } else id++;        }        while (c[0]-- > 0)            pw.print(0);        while (c[1]-- > 0)            pw.print(1);         pw.println();        pw.flush();    }      static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(FileReader r) {            br = new BufferedReader(r);        }         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int[] nextIntArr(int n) throws IOException {            int[] a = new int[n];            for (int i = 0; i < n; i++) {                a[i] = nextInt();            }            return a;        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }    } }
