//https://codeforces.com/problemset/problem/977/B import java.io.*;import java.util.*;  public class Main{   public static void main(String[] args) {      MyScanner sc = new MyScanner();      out = new PrintWriter(new BufferedOutputStream(System.out));            // Start writing your solution here. -------------------------------------      int s = sc.nextInt();      String n = sc.nextLine();      Map<String, Integer> map = new HashMap<>();       for(int i = 0; i < n.length() - 1; i++ ) {          String current = n.substring(i, i+2);          if (map.containsKey(current)){              map.put(current, map.get(current) + 1);          } else {              map.put(current, 1);          }      }       String ss = "";      int max = 0;      for(Map.Entry<String, Integer> entry : map.entrySet()) {          if (entry.getValue() > max) {              max = entry.getValue();              ss = entry.getKey();          }       }          // .stream().forEach((k,v) -> {          //     if (v > max) {          //         max = v;          //         ss = k;          //     }          // });      out.println(ss);      // Stop writing your solution here. -------------------------------------      out.close();   }          /*      int n      = sc.nextInt();        // read input as integer      long k     = sc.nextLong();       // read input as long      double d   = sc.nextDouble();     // read input as double      String str = sc.next();           // read input as String      String s   = sc.nextLine();       // read whole line as String       int result = 3*n;      out.println(result);                    // print via PrintWriter      */                       //-----------PrintWriter for faster output---------------------------------   public static PrintWriter out;         //-----------MyScanner class for faster input----------   public static class MyScanner {      BufferedReader br;      StringTokenizer st;       public MyScanner() {         br = new BufferedReader(new InputStreamReader(System.in));      }       String next() {          while (st == null || !st.hasMoreElements()) {              try {                  st = new StringTokenizer(br.readLine());              } catch (IOException e) {                  e.printStackTrace();              }          }          return st.nextToken();      }       int nextInt() {          return Integer.parseInt(next());      }       long nextLong() {          return Long.parseLong(next());      }       double nextDouble() {          return Double.parseDouble(next());      }       String nextLine(){          String str = "";	  try {	     str = br.readLine();	  } catch (IOException e) {	     e.printStackTrace();	  }	  return str;      }    }   //--------------------------------------------------------}