import java.io.*;import java.util.*;import java.math.*; public class Main {      public void solve() throws IOException{         int n = in.nextInt();        int m = in.nextInt();         int[] r = new int[101];        int[] b = new int[101];         List<Integer> res = new ArrayList<>();        List<Integer> xx = new ArrayList<>();         for(int i = 0; i < n; i++){            xx.add(in.nextInt());            res.add(xx.get(i));        }         Collections.sort(xx);        for(int i = 0; i < xx.size(); i++){            if(i % 2 == 0){                r[xx.get(i)] = 1;            }else{                b[xx.get(i)] = 1;            }        }         int[] rcum = new int[102];        int[] bcum = new int[102];         for(int i = 1; i <= 101; i++){            rcum[i] = rcum[i - 1] + r[i - 1];            bcum[i] = bcum[i - 1] + b[i - 1];        }         for(int i = 0; i < m; i++){             int left = in.nextInt();            int right = in.nextInt();             int rballs = rcum[right + 1] - rcum[left];            int bballs = bcum[right + 1] - bcum[left];             if(Math.abs(rballs - bballs) > 1){                out.println(-1);                return;            }        }         HashMap<Integer, Integer> map = new HashMap<>();         for(int i = 0; i < n; i++){            map.put(xx.get(i), i % 2);        }         for(int i = 0; i < n; i++){            out.print(map.get(res.get(i)) + " ");        }          return;    }     FastScanner in;    PrintWriter out;     static class FastScanner {         BufferedReader br;        StringTokenizer st;         FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         String nextLine() throws IOException {            if (st == null || !st.hasMoreTokens())                return br.readLine();            StringBuilder result = new StringBuilder(st.nextToken());            while (st.hasMoreTokens()) {                result.append(" ");                result.append(st.nextToken());            }            return result.toString();        }         int nextInt() throws IOException {            return Integer.parseInt(next());        }         long nextLong() throws IOException {            return Long.parseLong(next());        }         double nextDouble() throws IOException {            return Double.parseDouble(next());        }     }     void run() throws IOException {        in = new FastScanner(System.in);        out = new PrintWriter(System.out, false);        solve();        out.close();    }     public static void main(String[] args) throws IOException{        new Main().run();    }     public void printArr(int[] arr){        for(int i = 0; i < arr.length; i++){            out.print(arr[i] + " ");        }        out.println();    }     public long gcd(long a, long b){        if(a == 0) return b;        return gcd(b % a, a);    }     public boolean isPrime(long num){         if(num == 0 || num == 1){            return false;        }         for(int i = 2; i * i <= num; i++){            if(num % i == 0){                return false;            }        }         return true;    }     class Pair{        int x; int y;        Pair(int ix, int iy){            x = ix;            y = iy;        }    }     class Tuple{        int x; int y; int z;        Tuple(int ix, int iy, int iz){            x = ix;            y = iy;            z = iz;        }    }}