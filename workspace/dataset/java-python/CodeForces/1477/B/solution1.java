//stan hu tao//join nct ridin by first year culture repsimport static java.lang.Math.max;import static java.lang.Math.min;import static java.lang.Math.abs;import static java.lang.System.out;import java.util.*;import java.io.*;import java.math.*; public class x1477B{    public static void main(String hi[]) throws Exception    {        FastScanner infile = new FastScanner();        int T = infile.nextInt();        StringBuilder sb = new StringBuilder();        matcha:while(T-->0)        {            int N = infile.nextInt();            int Q = infile.nextInt();            char[] input = infile.next().toCharArray();            int[] arr = new int[N+1];            for(int i=0; i < N; i++)                arr[i+1] = input[i]-'0';            input = infile.next().toCharArray();            int[] target = new int[N+1];            for(int i=0; i < N; i++)                target[i+1] = input[i]-'0';            int[][] queries = new int[Q][2];            for(int i=0; i < Q; i++)            {                queries[i][0] = infile.nextInt();                queries[i][1] = infile.nextInt();            }            TreeMap<Integer, Integer> set = new TreeMap<Integer, Integer>();            for(int i=0; i <= N; i++)                set.put(i, target[i]);            for(int q=Q-1; q >= 0; q--)            {                int left = queries[q][0];                int right = queries[q][1];                set.put(left-1, set.get(set.ceilingKey(left-1)));                int ones = 0;                int curr = right;                int val = set.get(set.ceilingKey(right));                while(left <= curr)                {                    int temp = set.get(set.floorKey(curr));                    if(val == 1)                        ones += curr-set.floorKey(curr);                    curr = set.floorKey(curr);                    val = temp;                    if(curr >= left)                        set.remove(curr);                }                if(2*ones == right-left+1)                {                    sb.append("NO\n");                    continue matcha;                }                else if(2*ones < right-left+1)                    set.put(right, 0);                else                    set.put(right, 1);            }            String res = "YES";            for(int i=1; i <= N; i++)                if(set.get(set.ceilingKey(i)) != arr[i])                    res = "NO";            sb.append(res+"\n");        }        System.out.print(sb);    }}class FastScanner{    private int BS = 1 << 16;    private char NC = (char) 0;    private byte[] buf = new byte[BS];    private int bId = 0, size = 0;    private char c = NC;    private double cnt = 1;    private BufferedInputStream in;     public FastScanner() {        in = new BufferedInputStream(System.in, BS);    }     public FastScanner(String s) {        try {            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);        } catch (Exception e) {            in = new BufferedInputStream(System.in, BS);        }    }     private char getChar() {        while (bId == size) {            try {                size = in.read(buf);            } catch (Exception e) {                return NC;            }            if (size == -1) return NC;            bId = 0;        }        return (char) buf[bId++];    }     public int nextInt() {        return (int) nextLong();    }     public int[] nextInts(int N) {        int[] res = new int[N];        for (int i = 0; i < N; i++) {            res[i] = (int) nextLong();        }        return res;    }     public long[] nextLongs(int N) {        long[] res = new long[N];        for (int i = 0; i < N; i++) {            res[i] = nextLong();        }        return res;    }     public long nextLong() {        cnt = 1;        boolean neg = false;        if (c == NC) c = getChar();        for (; (c < '0' || c > '9'); c = getChar()) {            if (c == '-') neg = true;        }        long res = 0;        for (; c >= '0' && c <= '9'; c = getChar()) {            res = (res << 3) + (res << 1) + c - '0';            cnt *= 10;        }        return neg ? -res : res;    }     public double nextDouble() {        double cur = nextLong();        return c != '.' ? cur : cur + nextLong() / cnt;    }     public double[] nextDoubles(int N) {        double[] res = new double[N];        for (int i = 0; i < N; i++) {            res[i] = nextDouble();        }        return res;    }     public String next() {        StringBuilder res = new StringBuilder();        while (c <= 32) c = getChar();        while (c > 32) {            res.append(c);            c = getChar();        }        return res.toString();    }     public String nextLine() {        StringBuilder res = new StringBuilder();        while (c <= 32) c = getChar();        while (c != '\n') {            res.append(c);            c = getChar();        }        return res.toString();    }     public boolean hasNext() {        if (c > 32) return true;        while (true) {            c = getChar();            if (c == NC) return false;            else if (c > 32) return true;        }    }}
