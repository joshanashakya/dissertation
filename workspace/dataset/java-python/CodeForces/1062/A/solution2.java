// template : secondThread import java.io.*;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;   public   class main2 {           public static void main(String[] args) {        try {              PrintWriter fop = new PrintWriter(System.out);            FastScanner fsca = new FastScanner();             int n = fsca.nextInt();           int A[] = fsca.readArray(n);            int consecutive = 1 ;           int max = -1 ;             for (int i = 1; i <n ; i++) {                if (A[i] == A[i-1]+1)                    consecutive++ ;                else {                    max = Math.max(max , consecutive) ;                    consecutive = 1 ;                }            }            max = Math.max(max , consecutive) ;             int conse_first = 1 ;            for (int i = 1; i <n ; i++) {                if (A[i] == A[i-1] + 1)conse_first++ ;                else break;            }            if (A[0] != 1)                conse_first-- ;             int conse_last = 1 ;            for (int i=n-1 ; i>0 ; i--){                if (A[i] == A[i-1]+1)conse_last++ ;                else break;            }             if (A[n-1] != 1000)                conse_last-- ;             if (max == n &&( A[n-1] == 1000 || A[n-1] == n)){                fop.println(n-1);            }            else {                int temp = Math.max(conse_first-1 , conse_last-1) ;                fop.println(Math.max(temp ,Math.max(0, max - 2)));             }                                       fop.flush();            fop.close();        }        catch (Exception e){            return;        }       }    /*-----------------------------------------------------------------------------------------------------------------------------------------------*/         static void sieve(int n){        boolean[] flag = new boolean[n] ;         for (int i=2 ; i*i<n ; i++){            if (flag[i])                continue;            else                for (int j= i*i ; j<=n ; j+= i){                    flag[j] = true;                }        }      }    static int gcd(int a , int b){        if (b > a){            int tenp = b ;            b = a ;            a = tenp ;        }        int temp = 0 ;        while (b != 0){            a %= b ;            temp = b ;            b = a ;            a = temp ;        }        return a ;    }     static long gcd_long( long a , long b){        if (b > a){            long tenp = b ;            b = a ;            a = tenp ;        }        long temp = 0 ;        while (b != 0){            a %= b ;            temp = b ;            b = a ;            a = temp ;        }        return a ;    }      static final Random random=new Random();     static void ruffleSort(int[] a) {        int n=a.length;//shuffle, then sort        for (int i=0; i<n; i++) {            int oi=random.nextInt(n), temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }        static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }        int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long[] readLongArray(int n){            long[] a = new long[n];            for (int i=0 ; i<n ; i++)                a[i] = nextLong() ;            return a ;        }        long nextLong() {            return Long.parseLong(next());        }    }      }    
