import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.concurrent.atomic.AtomicInteger;  public class Main {    static int i, j, k, n, m, t, y, x, sum;    static long mod = 1000000007;    static FastScanner fs = new FastScanner();    static PrintWriter out = new PrintWriter(System.out);    static String str;     static long ans =0;     public static void main(String[] args) {         String str1,str2;         str1 = fs.next();         str2 = fs.next();         HashMap<Character,Character> pairs = new HashMap<>();         n = str1.length();        AtomicInteger f = new AtomicInteger(0);        for(i=0;i<n;i++){            if(str1.charAt(i)!=str2.charAt(i)){                pairs.put(str1.charAt(i), str2.charAt(i));                pairs.put(str2.charAt(i),str1.charAt(i));            }        }         String str3 = "";         for(i=0;i<n;i++){            str3+=String.valueOf(pairs.getOrDefault(str2.charAt(i), str2.charAt(i)));        }         int[] valCheck = new int[26];         pairs.forEach((k,v)->{            if(valCheck[v-97]==0)                valCheck[v-97]=1;            else                f.set(1);        });           if(!str3.equals(str1) || f.get()==1)            out.println(-1);         else{             int[] vis = new int[26];             out.println(pairs.size()/2);             pairs.entrySet().stream().forEachOrdered((k) -> {                if(vis[k.getKey()-97]==0 && vis[k.getKey()-97]==0){                    vis[k.getKey()-97]=1;                    vis[k.getValue()-97]=1;                     out.println(k.getKey()+" "+k.getValue());                }            }); ;         }          out.close();    }      private static void initialize(long[] arr, long val){         int n = arr.length;         for(int i = 0;i<n;i++){            arr[i]=val;        }    }       static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }     static class Pair implements Comparable<Pair> {        int first, second;         public Pair(int first, int second) {            this.first = first;            this.second = second;        }         public int compareTo(Pair o) {            return Long.compare(first, o.first);        }     }     static void ruffleSort(int[] a) {        //ruffle        int n=a.length;        Random r=new Random();        for (int i=0; i<a.length; i++) {            int oi=r.nextInt(n), temp=a[i];            a[i]=a[oi];            a[oi]=temp;        }         //then sort        Arrays.sort(a);    }  }