import static java.lang.Math.max;import static java.lang.Math.min;import static java.lang.Math.abs;import java.util.*;import java.io.*;import java.math.*;    public class x1439B   {      static HashSet<Integer>[] edges;      public static void main(String hi[]) throws Exception      {         FastScanner infile = new FastScanner();         int T = infile.nextInt();         StringBuilder sb = new StringBuilder();         matcha:while(T-->0)         {            int N = infile.nextInt();            int M = infile.nextInt();            int K = infile.nextInt();            edges = new HashSet[N+1];            for(int i=1; i <= N; i++)               edges[i] = new HashSet<Integer>();            for(int i=0; i < M; i++)            {               int a = infile.nextInt();               int b = infile.nextInt();               edges[a].add(b);  edges[b].add(a);            }            TreeSet<Integer> bst = new TreeSet<Integer>((x,y) -> {               if(edges[x].size() == edges[y].size())                  return Integer.compare(x, y);               return Integer.compare(edges[x].size(), edges[y].size());            });            for(int v=1; v <= N; v++)               bst.add(v);            while(bst.size() > 0)            {               int curr = bst.first();               if(edges[curr].size() >= K)               {                  ArrayList<Integer> group = new ArrayList<Integer>();                  for(int v=1; v <= N; v++)                     if(edges[v].size() >= K)                        group.add(v);                  sb.append("1 "+group.size()+"\n");                  for(int v: group)                     sb.append(v+" ");                  sb.append("\n");                  continue matcha;               }               else if(edges[curr].size() == K-1)               {                  ArrayList<Integer> clique = new ArrayList<Integer>();                  clique.add(curr);                  for(int next: edges[curr])                     clique.add(next);                  boolean works = true;                  lol:for(int i=0; i < clique.size(); i++)                     for(int j=i+1; j < clique.size(); j++)                        if(!edges[clique.get(i)].contains(clique.get(j)))                        {                           works = false;                           break lol;                        }                  if(works)                  {                     sb.append("2\n");                     for(int v: edges[curr])                        sb.append(v+" ");                     sb.append(curr+"\n");                     continue matcha;                  }               }               bst.remove(curr);               for(int next: edges[curr])               {                  bst.remove(next);                  edges[next].remove(curr);                  bst.add(next);               }            }            sb.append("-1\n");         }         System.out.print(sb);      }   }   class FastScanner    {        private int BS = 1 << 16;        private char NC = (char) 0;        private byte[] buf = new byte[BS];        private int bId = 0, size = 0;        private char c = NC;        private double cnt = 1;        private BufferedInputStream in;         public FastScanner() {            in = new BufferedInputStream(System.in, BS);        }         public FastScanner(String s) {            try {                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);            } catch (Exception e) {                in = new BufferedInputStream(System.in, BS);            }        }         private char getChar() {            while (bId == size) {                try {                    size = in.read(buf);                } catch (Exception e) {                    return NC;                }                if (size == -1) return NC;                bId = 0;            }            return (char) buf[bId++];        }         public int nextInt() {            return (int) nextLong();        }         public int[] nextInts(int N) {            int[] res = new int[N];            for (int i = 0; i < N; i++) {                res[i] = (int) nextLong();            }            return res;        }         public long[] nextLongs(int N) {            long[] res = new long[N];            for (int i = 0; i < N; i++) {                res[i] = nextLong();            }            return res;        }         public long nextLong() {            cnt = 1;            boolean neg = false;            if (c == NC) c = getChar();            for (; (c < '0' || c > '9'); c = getChar()) {                if (c == '-') neg = true;            }            long res = 0;            for (; c >= '0' && c <= '9'; c = getChar()) {                res = (res << 3) + (res << 1) + c - '0';                cnt *= 10;            }            return neg ? -res : res;        }         public double nextDouble() {            double cur = nextLong();            return c != '.' ? cur : cur + nextLong() / cnt;        }         public double[] nextDoubles(int N) {            double[] res = new double[N];            for (int i = 0; i < N; i++) {                res[i] = nextDouble();            }            return res;        }         public String next() {            StringBuilder res = new StringBuilder();            while (c <= 32) c = getChar();            while (c > 32) {                res.append(c);                c = getChar();            }            return res.toString();        }         public String nextLine() {            StringBuilder res = new StringBuilder();            while (c <= 32) c = getChar();            while (c != '\n') {                res.append(c);                c = getChar();            }            return res.toString();        }         public boolean hasNext() {            if (c > 32) return true;            while (true) {                c = getChar();                if (c == NC) return false;                else if (c > 32) return true;            }        }   }
