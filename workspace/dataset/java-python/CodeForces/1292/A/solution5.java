import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.*;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; public class First {     public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        int t;        //t = in.nextInt();        t = 1;        while (t > 0) {            solver.call(in,out);            t--;        }        out.close();    }     static class TaskA {        public void call(InputReader in, PrintWriter out) {            int n, q;            n = in.nextInt();            q = in.nextInt();             int[][] arr = new int[2][n];             int a, b, c = 0;             for (int i = 0; i < q; i++) {                a = in.nextInt() - 1;                b = in.nextInt() - 1;                 if(arr[a][b]==0){                    arr[a][b]=1;                      for (int j = b-1; j <=b+1; j++) {                        if(j<0 || j>=n){                            continue;                        }                        if(a==0){                            if(arr[1][j]==1){                                c++;                            }                        }                        else{                            if(arr[0][j]==1){                                c++;                            }                        }                    }                 }                else{                    for (int j = b-1; j <=b+1; j++) {                        if(j<0 || j>=n){                            continue;                        }                        if(a==0){                            if(arr[1][j]==1){                                c--;                            }                        }                        else{                            if(arr[0][j]==1){                                c--;                            }                        }                    }                    arr[a][b]=0;                 }                 if(c>0){                    out.println("NO");                }                else{                    out.println("YES");                }              }        }    }     static class answer implements Comparable<answer>{        int a,b;         public answer(int a, int b) {            this.a = a;            this.b = b;        }         @Override        public int compareTo(answer o) {            return this.a - o.a;        }    }     static long gcd(long a, long b)    {        if (b == 0)            return a;        return gcd(b, a % b);    }     static void sort(int[] a) {        ArrayList<Integer> l=new ArrayList<>();        for (int i:a) l.add(i);        Collections.sort(l);        for (int i=0; i<a.length; i++) a[i]=l.get(i);    }     static final Random random=new Random();     static void shuffleSort(int[] a) {        int n=a.length;        for (int i=0; i<n; i++) {            int oi=random.nextInt(n), temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }        public long nextLong(){            return Long.parseLong(next());        }        public double nextDouble() {            return Double.parseDouble(next());        }     }}
