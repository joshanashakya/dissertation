import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Collection;import java.io.InputStreamReader;import java.util.HashSet;import java.util.StringTokenizer;import java.util.Queue;import java.io.BufferedReader;import java.util.LinkedList;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BChatOrder solver = new BChatOrder();        solver.solve(1, in, out);        out.close();    }     static class BChatOrder {        int n;        String[] arr;         public void readInput(Scanner sc) {            n = sc.nextInt();            arr = new String[n];            for (int i = 0; i < n; i++)                arr[i] = sc.next();        }         public void solve(int testNumber, Scanner sc, PrintWriter pw) {            readInput(sc);            HashSet<String> set = new HashSet<>();            Queue<String> q = new LinkedList<>();            for (int i = n - 1; i >= 0; i--) {                if (set.add(arr[i]))                    q.add(arr[i]);            }            while (!q.isEmpty())                pw.println(q.poll());        }     }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() {            try {                while (st == null || !st.hasMoreTokens())                    st = new StringTokenizer(br.readLine());                return st.nextToken();            } catch (Exception e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }     }}   	  	 		 			      			  							
