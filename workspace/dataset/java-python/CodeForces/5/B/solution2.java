import java.io.*;import java.util.*;import java.math.*; public class B {    public static void main(String[] args) throws IOException {        FastScanner fs=new FastScanner();        PrintWriter out = new PrintWriter(System.out);        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         // int T = 1;         // int T=fs.nextInt();        // for (int tt=0; tt<T; tt++) {        // }        String line="";        List<String> lst = new ArrayList();        int max = -1;        // for(String s = br.readLine(); s != null; s = br.readLine()) {        //     if(s.equals("enough!")) {        //         break;        //     }        //     lst.add(s);        //     max = Math.max(max, s.length());        // }        while ( (line=br.readLine())!=null ){            lst.add(line);            max = Math.max(max, line.length());        }        StringBuilder sb = new StringBuilder();        for (int i=0; i<max; i++) {            out.print("*");        }            out.print("*");            out.print("*");                out.println();        int turn = 0;        for (int i=0; i<lst.size(); i++) {            out.print("*");            String cur = lst.get(i);            int rem = (max-cur.length())/2;            int bigger= Math.max(rem, max-rem-cur.length());            int smaller = Math.min(rem, max-rem-cur.length());            if(turn%2==0) {                for (int j=0; j<smaller; j++) {                    out.print(" ");                }                out.print(cur);                for (int j=0; j<bigger; j++) {                    out.print(" ");                }                out.print("*");            }            else {                for (int j=0; j<bigger; j++) {                    out.print(" ");                }                out.print(cur);                for (int j=0; j<smaller; j++) {                    out.print(" ");                }                out.print("*");            }            if (bigger!=smaller) {                turn++;                            }            out.println();        }         for (int i=0; i<max; i++) {            out.print("*");        }            out.print("*");            out.print("*");         out.println();         out.close();    }      static final Random random=new Random();        static void ruffleSort(int[] a) {        int n=a.length;//shuffle, then sort         for (int i=0; i<n; i++) {            int oi=random.nextInt(n), temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }        static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }                int nextInt() {            return Integer.parseInt(next());        }        int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long nextLong() {            return Long.parseLong(next());        }    } }