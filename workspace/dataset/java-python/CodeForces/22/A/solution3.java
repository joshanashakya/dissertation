import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class C {    static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] nextArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }    static class FastWriter extends PrintWriter {        FastWriter() {            super(System.out);        }         void println(int[] array) {            for (int i = 0; i < array.length; i++) {                print(array[i] + " ");            }            println();        }         void println(long[] array) {            for (int i = 0; i < array.length; i++) {                print(array[i] + " ");            }            println();        }    }    public static void main(String[] args) {        // Yo bitch !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!        FastScanner in = new FastScanner();        FastWriter out = new FastWriter();//        int t=in.nextInt();//        while(t-->0){//            int n=in.nextInt();//            int[] ar=in.nextArray(n);//        }        int n=in.nextInt();        int[] ar=in.nextArray(n);        Arrays.sort(ar);        if(n==1){            out.println("NO");        }else{            for (int i = 1; i < n; i++) {                if(ar[i]!=ar[i-1]){                    System.out.println(ar[i]);                    return;                }            }            out.println("NO");        }        out.close();    }}