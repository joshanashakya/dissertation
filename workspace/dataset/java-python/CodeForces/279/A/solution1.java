import java.io.*;import java.lang.reflect.Array;import java.util.*;import java.math.*;   public class Task{    public static void main(String[] args) throws IOException    {        new Task().run();    }    StreamTokenizer in;     Scanner ins;    PrintWriter out;     int nextInt() throws IOException    {        in.nextToken();              return (int)in.nval;    }        long nextLong() throws IOException    {        in.nextToken();              return (long)in.nval;    }        char nextChar() throws IOException{        in.nextToken();        return (char)in.ttype;    }        String nextString() throws IOException{        in.nextToken();        return in.sval;    }    long gcdLight(long a, long b){        a = Math.abs(a);        b = Math.abs(b);        while(a != 0 && b != 0){            if(a > b)                a %= b;            else                b %= a;        }        return a + b;    }    ForGCD gcd(int a,int b)    {        ForGCD tmp = new ForGCD();        if(a == 0)        {            tmp.x = 0;            tmp.y = 1;            tmp.d = b;        }        else        {            ForGCD tmp1 = gcd(b%a, a);            tmp.d = tmp1.d;            tmp.y = tmp1.x;            tmp.x = tmp1.y - tmp1.x*(b/a);        }                return tmp;    }         int x,y;    void run() throws IOException    {         in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));        ins = new Scanner(System.in);        out = new PrintWriter(System.out);        try        {            if(System.getProperty("xDx")!=null)            {                in = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));                ins = new Scanner(new FileReader("input.txt"));                out = new PrintWriter(new FileWriter("output.txt"));            }        }        catch(Exception e)        {                    }                x = nextInt();        y = nextInt();        Point cur = new Point(0, 0);        int res = 0;        int dx[] = {1, 0, -1, 0};        int dy[] = {0, 1, 0, -1};        boolean ok = true;                for(int i = 0; ok; i++){            int k = i/2 + 1;            Point nextP = new Point(cur.x + k*dx[i%4], cur.y + k*dy[i%4]);            if(dx[i%4] == 0 && cur.x == x && Math.min(cur.y, nextP.y) <= y &&                     y <= Math.max(cur.y, nextP.y) || dy[i%4] == 0 && cur.y == y &&                    Math.min(cur.x, nextP.x) <= x && x <= Math.max(cur.x, nextP.x)){                                ok = false;            }else{                res++;            }            cur = nextP;        }        out.print(res);        out.close();    }    class Point{        public int x,y;         public Point(int x, int y) {            this.x = x;            this.y = y;        }            }    private long pow(long x, long p) {        if(p == 0){            return 1;        }        long res = pow(x, p/2);        res *= res;        if(p%2 == 1){            res *= x;        }                return res;    }        class ForGCD    {        int x,y,d;    }     class Boxes implements Comparable    {        public long k,a;        public Boxes(long k, long a){            this.k = k;            this.a = a;        }                public int compareTo(Object obj)        {            Boxes b = (Boxes) obj;            if(k < b.k)                                          return -1;            else                  if(k == b.k)                    return 0;                else                    return 1;        }            }}