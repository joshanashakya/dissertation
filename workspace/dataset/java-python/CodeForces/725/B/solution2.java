import java.util.*;import java.io.*;/** * * @author alanl */public class Solve {     /**     * @param args the command line arguments     */    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    public static void main(String[] args) throws IOException{        String s = readLine();        Map<Character, Integer>mp = new HashMap();        mp.put('f', 1);        mp.put('e', 2);        mp.put('d', 3);        mp.put('a', 4);        mp.put('b', 5);        mp.put('c', 6);        char col = s.charAt(s.length()-1);        long row = Long.parseLong(s.substring(0, s.length()-1));        long ans = 0;        ans+=1L*(row-1)/4*16;        if(row%2==0){            ans+=7;            ans+=mp.get(col);        }        else ans+=mp.get(col);        println(ans);    }    static String next () throws IOException {        while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(input.readLine().trim());        return st.nextToken();    }    static long readLong () throws IOException {        return Long.parseLong(next());    }    static int readInt () throws IOException {        return Integer.parseInt(next());    }    static double readDouble () throws IOException {        return Double.parseDouble(next());    }    static char readChar () throws IOException {        return next().charAt(0);    }    static String readLine () throws IOException {        return input.readLine().trim();    }    static void print(Object b) {        System.out.print(b);    }    static void println(Object b) {        System.out.println(b);    }    static void println() {        System.out.println();    }}