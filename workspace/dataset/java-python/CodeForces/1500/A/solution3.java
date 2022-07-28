//stan hu tao
//join nct ridin by first year culture reps
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class x1500A
{
    static final int MAX = 5000000;
    public static void main(String hi[]) throws Exception
    {
        FastScanner infile = new FastScanner();
        int N = infile.nextInt();
        int[] arr = infile.nextInts(N);
        int[] p1 = new int[MAX+1];
        int[] p2 = new int[MAX+1];
        for(int i=0; i <= MAX; i++)
            p1[i] = p2[i] = -1;
        for(int a=0; a < N; a++)
            for(int b=a+1; b < N; b++)
            {
                if(p1[arr[a]+arr[b]] == -1)
                {
                    p1[arr[a]+arr[b]] = a;
                    p2[arr[a]+arr[b]] = b;
                }
                else if(p1[arr[a]+arr[b]] != a && p2[arr[a]+arr[b]] != a && p1[arr[a]+arr[b]] != b && p2[arr[a]+arr[b]] != b)
                {
                    System.out.println("YES");
                    System.out.println((p1[arr[a]+arr[b]]+1)+" "+(p2[arr[a]+arr[b]]+1)+" "+(a+1)+" "+(b+1));
                    return;
                }
            }
        System.out.println("NO");
    }
}
class FastScanner
{
    private int BS = 1 << 16;
    private char NC = (char) 0;
    private byte[] buf = new byte[BS];
    private int bId = 0, size = 0;
    private char c = NC;
    private double cnt = 1;
    private BufferedInputStream in;

    public FastScanner() {
        in = new BufferedInputStream(System.in, BS);
    }

    public FastScanner(String s) {
        try {
            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
        } catch (Exception e) {
            in = new BufferedInputStream(System.in, BS);
        }
    }

    private char getChar() {
        while (bId == size) {
            try {
                size = in.read(buf);
            } catch (Exception e) {
                return NC;
            }
            if (size == -1) return NC;
            bId = 0;
        }
        return (char) buf[bId++];
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int[] nextInts(int N) {
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = (int) nextLong();
        }
        return res;
    }

    public long[] nextLongs(int N) {
        long[] res = new long[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextLong();
        }
        return res;
    }

    public long nextLong() {
        cnt = 1;
        boolean neg = false;
        if (c == NC) c = getChar();
        for (; (c < '0' || c > '9'); c = getChar()) {
            if (c == '-') neg = true;
        }
        long res = 0;
        for (; c >= '0' && c <= '9'; c = getChar()) {
            res = (res << 3) + (res << 1) + c - '0';
            cnt *= 10;
        }
        return neg ? -res : res;
    }

    public double nextDouble() {
        double cur = nextLong();
        return c != '.' ? cur : cur + nextLong() / cnt;
    }

    public double[] nextDoubles(int N) {
        double[] res = new double[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextDouble();
        }
        return res;
    }

    public String next() {
        StringBuilder res = new StringBuilder();
        while (c <= 32) c = getChar();
        while (c > 32) {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public String nextLine() {
        StringBuilder res = new StringBuilder();
        while (c <= 32) c = getChar();
        while (c != '\n') {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public boolean hasNext() {
        if (c > 32) return true;
        while (true) {
            c = getChar();
            if (c == NC) return false;
            else if (c > 32) return true;
        }
    }
}
