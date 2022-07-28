import javax.swing.text.MutableAttributeSet;import java.awt.image.BandedSampleModel;import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.*;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /*@author kalZor */ public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        FastReader in = new FastReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        Solver solver = new Solver();        solver.solve(1, in, out);        out.close();    }     static class Solver {        public final int mod = (int) (1e9 + 7);        public int[] ans = new int[6];        public int[] a = new int[]{4 , 8, 15, 16, 23, 42};        public void solve(int testNumber, FastReader in, PrintWriter out) {            HashSet<Integer> set = new HashSet<>();            HashSet<Integer> set2 = new HashSet<>();            for(int x:a) set.add(x);            outer:for(int i=1;i<6;i+=3){                out.println("? "+(i)+" "+(i+1));                out.flush();                int fir = in.nextInt();                out.println("? "+(i+1)+" "+(i+2));                out.flush();                int sec = in.nextInt();                for(int j=0;j<a.length;j++){                    for(int k=0;k<a.length;k++){                        if(j==k) continue;                        if(a[j]*a[k]==fir){                            set.remove(a[j]);                            set.remove(a[k]);                            if(sec%a[j]==0&&set.contains(sec/a[j])){                                ans[i-1] = a[k];                                ans[i] = a[j];                                ans[i+1] = sec/a[j];                                continue outer;                            }                            if(sec%a[k]==0&&set.contains(sec/a[k])){                                ans[i-1] = a[j];                                ans[i] = a[k];                                ans[i+1] = sec/a[k];                                continue outer;                            }                        }                    }                }            }            out.print("! ");            for(int x:ans) out.print(x+" ");        }    }     static class Pair implements Comparable<Pair>{        int a;        int b;        public Pair(int a, int b) {            this.a = a;            this.b = b;        }        public int compareTo(Pair o) {            if(this.a==o.a)                return this.b - o.b;            return this.a - o.a;        }    }    static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader(InputStream stream){            br = new BufferedReader(new                    InputStreamReader(stream));        }         public String next(){            while (st == null || !st.hasMoreElements()){                try{                    st = new StringTokenizer(br.readLine());                }                catch (IOException e){                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt(){            return Integer.parseInt(next());        }         public long nextLong(){            return Long.parseLong(next());        }         public double nextDouble(){            return Double.parseDouble(next());        }         public String nextLine(){            String str = "";            try{                str = br.readLine();            }            catch (IOException e){                e.printStackTrace();            }            return str;        }         public int[] nextArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }    }} 
