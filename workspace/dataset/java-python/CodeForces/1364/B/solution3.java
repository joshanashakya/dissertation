  import java.io.*;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Main1 {        public static void main(String[] args) {         try {              FastScanner in = new FastScanner();            PrintWriter out = new PrintWriter(System.out);               int t = in.nextInt() ;            while (t-- > 0){                 int n = in.nextInt() ;                int A[] = in.readArray(n) ;                 StringBuilder sb = new StringBuilder() ;                int ct = 2 ;                sb.append(A[0] + " ") ;                for (int i = 1; i <n-1 ; i++) {                    if ( (A[i] > A[i-1] && A[i] > A[i+1] )|| (A[i] < A[i-1] && A[i] < A[i+1])  ){                        ct++ ;                        sb.append(A[i] + " ") ;                    }                }                sb.append(A[n-1]) ;                 System.out.println(ct);                System.out.println(sb);                 }                       out.flush();            out.close();          }        catch (Exception e){            return   ;        }                        }      static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }          long nextLong() {            return Long.parseLong(next());        }    }  }        
