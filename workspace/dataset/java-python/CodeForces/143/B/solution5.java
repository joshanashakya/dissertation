import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;  public class Main {    public static void main(String[] args) {//        Scanner sc = new Scanner(System.in);       FastScanner sc = new FastScanner();       PrintWriter out = new PrintWriter(System.out);       StringBuilder st = new StringBuilder();        String s = sc.next();       String a[] = new String[2];       int i = 0;       a[0] = "";       a[1] = "";       while (i < s.length() && s.charAt(i) != '.') {           a[0] += s.charAt(i);           i++;       }       i++;       while (i < s.length()) {           a[1] += s.charAt(i);           i++;       }       int count = 1;       st.append('$');       StringBuilder st1 = new StringBuilder();       for ( i = a[0].length() - 1; i >= 0; i--) {           if (a[0].charAt(i) == '-') continue;           st1.append(a[0].charAt(i));           if (count % 3 == 0&&!((i==0)||(i==1&&a[0].charAt(i-1)=='-'))) {               st1.append(',');           }           count++;       }       st.append(st1.reverse());       st.append(".00");       for (i = 0; i < a[1].length() && i < 2; i++) {           st.setCharAt(st.length() - 2 + i, a[1].charAt(i));       }       if (s.charAt(0) == '-') {           System.out.println("(" + st + ")");       } else {           System.out.println(st);       }                out.flush();        }          static void sort(int[] a) {        ArrayList<Integer> l=new ArrayList<>();        for (int i:a) l.add(i);        Collections.sort(l);        for (int i=0; i<a.length; i++) a[i]=l.get(i);    }    static void sortReverse(long[] a) {        ArrayList<Long> l=new ArrayList<>();        for (long i:a) l.add(i);//        Collections.sort.(l);        Collections.sort(l,Collections.reverseOrder());        for (int i=0; i<a.length; i++) a[i]=l.get(i);    }     static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }        int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long[] readArrayLong(long n) {            long[] a=new long[(int)n];            for (int i=0; i<n; i++) a[i]=nextLong();            return a;        }        long nextLong() {            return Long.parseLong(next());        }    }  }