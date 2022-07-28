import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.lang.reflect.Array;import java.util.*;public class Main{    static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] nextArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }        long[] nextArray(long n) {            long[] a = new long[(int) n];            for (int i = 0; i < n; i++) a[i] = nextLong();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }    static class FastWriter extends PrintWriter {            FastWriter(){                super(System.out);            }            void println(int[] array) {                for(int i=0; i<array.length; i++) {                    print(array[i]+" ");                }                println();            }            void println(long [] array) {                for(int i=0; i<array.length; i++) {                    print(array[i]+" ");                }                println();            }        }        static ArrayList<Integer> list=new ArrayList<>();    public static void main(String[] args){        FastScanner in = new FastScanner();        FastWriter out = new FastWriter();        int t=in.nextInt();        outer:while (t-->0) {            int n=in.nextInt();            String str=in.next();            int i=0,cnt=0,ans=0;            while(i<n-1){                if(str.charAt(i)=='A'){                    if(str.charAt(i+1)=='P'){                        cnt=0;int j=i+1;                        while(j<n&&str.charAt(j)=='P'){                            cnt++;                            j++;                        }                        i=j;                        ans=Math.max(cnt,ans);                    }else {                        i++;                    }                }else{                    i++;                }            }            out.println(ans);        }        out.close();    }}