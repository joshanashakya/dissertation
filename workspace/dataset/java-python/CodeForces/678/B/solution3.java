//package main; import java.io.*;import java.util.*;import java.math.*; public final class Main {    BufferedReader br;    StringTokenizer stk;        public static void main(String[] args) throws Exception {        new Main().run();    }        {        stk = null;        br = new BufferedReader(new InputStreamReader(System.in));    }        long mod = 998244353;    StringBuilder res = new StringBuilder(1000005);    void run() throws Exception {        int year = ni(), Y = year;                int day = 0;        while(true) {            day++;            if(isLeapYear(year)) {                day++;            }            year++;            day %= 7;            if(day == 0 && isLeapYear(Y) == isLeapYear(year)) {                System.out.println(year);                return;            }        }    }        boolean isLeapYear(int year) {        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));    }        //Reader & Writer    String nt() throws Exception {        if (stk == null || !stk.hasMoreTokens())            stk = new StringTokenizer(br.readLine(), " ");        return stk.nextToken();    }     char[] nc() throws Exception {        return nt().toCharArray();    }     int ni() throws Exception {        return Integer.parseInt(nt());    }     long nl() throws Exception {        return Long.parseLong(nt());    }        double nd() throws Exception {        return Double.parseDouble(nt());    }        //Some Misc methods    long get(int l, int r, long[] a) {        return l == 0 ? a[r] : a[r] - a[l - 1];    }        void shuffle(long[] a) {        Random r = new Random();        for(int i = 0; i < a.length; i++) {            int idx = r.nextInt(a.length);            long temp = a[i];            a[i] = a[idx];            a[idx] = temp;        }    }        void reverse(long[] a) {        for(int i = 0, j = a.length - 1; i < j; i++, j--) {            long temp = a[i];            a[i] = a[j];            a[j] = temp;        }    }        void print(int[] a) {        System.out.println(Arrays.toString(a));    }}