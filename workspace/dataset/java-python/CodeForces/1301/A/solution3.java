import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.lang.reflect.Array;import java.util.*;public class Main{    static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] nextArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }        long[] nextArray(long n) {            long[] a = new long[(int) n];            for (int i = 0; i < n; i++) a[i] = nextLong();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }    static class FastWriter extends PrintWriter {            FastWriter(){                super(System.out);            }            void println(int[] array) {                for(int i=0; i<array.length; i++) {                    print(array[i]+" ");                }                println();            }            void println(long [] array) {                for(int i=0; i<array.length; i++) {                    print(array[i]+" ");                }                println();            }        }        static ArrayList<Integer> list=new ArrayList<>();    public static void main(String[] args){        FastScanner in = new FastScanner();        FastWriter out = new FastWriter();        int t=in.nextInt();        outer:while (t-->0) {            String str1=in.next();            String str2=in.next();            String str3=in.next();            boolean flag=true;            for (int i = 0; i < str3.length(); i++) {                if(str3.charAt(i)!=str2.charAt(i)&&str3.charAt(i)!=str1.charAt(i)){                    flag=false;                    break ;                }            }            if(flag){                out.println("YES");            }else{                out.println("NO");            }        }        out.close();    }}
