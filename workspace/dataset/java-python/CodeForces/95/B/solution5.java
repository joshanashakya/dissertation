import java.util.*;
import java.io.*;

// Solution

public class Main 
{    
  public static void main (String[] argv) 
  {
	  new Main();
  } 
     
  
  String s;
  boolean test = false;
  public Main() {
	  FastReader in = new FastReader(new BufferedReader(new InputStreamReader(System.in)));
	  //FastReader in = new FastReader(new BufferedReader(new FileReader("Main.in")));
      s = in.next();
      char[] a = s.toCharArray();
      int n = a.length;
      
      
      if (n % 2 == 1) {
          minLonger(n/2 + 1);
          return;
      }
      
      int cmp = tooBig(a);
      
      if (cmp == 0) {
          System.out.println(s);
          return;
      }
      
      if (cmp == 1) {
          minLonger(n/2 + 1);
          return;
      }
      
      solveEqLen(a);
      
  }
  
  private void solveEqLen(char[] a) {
      int n = a.length;
      int h = n / 2;
      int n4 = 0, n7 = 0;
      int last4 = 0, llast4 = 0;
      int i = 0;
      while (i < n && (a[i] == '4' || a[i] == '7')) {
          if (a[i] == '4') {
              ++n4;
              llast4 = last4;
              last4 = i;
              if (n4 > h) {
                  paint(a, '7', i, n - 1);
                  System.out.println(new String(a));
                  return;                                   
              }
          }else {
              ++n7;              
              if (n7 > h) {
                  
                      a[last4] = '7';
                      --n4;
                      //System.out.println("last4 = " + last4 + ", h = " + h + ", n = " + n + ", n4 = "  + n4 + ", n7 = " + n7 + ", i = " + i);
                      if (last4 + h - n4 < n) {
                          paint(a, '4', last4 + 1, last4 + h - n4);
                          paint(a, '7', last4 + h - n4 + 1, n - 1);
                      }else {
                          int j = last4 - 1;
                          while (a[j] == '4') {
                              --j;
                              --n4;
                          }
                          while (a[j] == '7') --j;
                          a[j] = '7';
                          --n4;
                          paint(a, '4', j + 1, j + h - n4);
                          paint(a, '7', j + h - n4 + 1, n - 1);
                      }
                  
                  System.out.println(new String(a));
                  return;
              }
          }
          ++i;
      }
      if (i == n) {
         System.out.println(s);
         return;
      }      
      
      if (a[i] < '4') {
          if (n4 == h) {
              paint(a, '7', i, n - 1);
              System.out.println(new String(a));
              return;
          }else {
              paint(a, '4', i, i + h - n4 - 1);
              paint(a, '7', i + h - n4, n - 1);
              System.out.println(new String(a));
              return;
          }
      }
      
      if (a[i] < '7' && n7 < h) {
          
              a[i] = '7';              
              
              paint(a, '4', i + 1, i + h - n4);
              paint(a, '7', i + h - n4 + 1, n - 1);
              System.out.println(new String(a));
              return;
          }else {
              a[last4] = '7';
              --n4;
              if (last4 + h - n4 < n) {
                  paint(a, '4', last4 + 1, last4 + h - n4);
                  paint(a, '7', last4 + h - n4 + 1, n - 1);
              }else {
                  int j = last4 - 1;
                          while (a[j] == '4') {
                              --j;
                              --n4;
                          }
                          while (a[j] == '7') --j;
                          a[j] = '7';
                          --n4;
                          paint(a, '4', j + 1, j + h - n4);
                          paint(a, '7', j + h - n4 + 1, n - 1);
              }
              System.out.println(new String(a));
              return;
          }
  }
  
  private void paint(char[] a, char c, int l, int r) {
      for (int i = l; i <= r; ++i) a[i] = c;
  }
  
  // precondition: n % 2 == 0
  // return 0 if  a == 7744
  //        1 if  a > 7744
  //       -1 if  a < 7744
  private int tooBig(char[] a) {
      int n = a.length;
      int h = n / 2;
      for(int i = 0; i < h; i++) {
          if (a[i] > '7') return 1;
          if (a[i] < '7') return -1;
      }
      
      for(int i = h; i < n; i++) {
          if (a[i] > '4') return 1;
          if (a[i] < '4') return -1;
      }
      return 0;
  }
  
  
  private void minLonger(int rep) {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < rep; ++i)sb.append(4);
      for(int i = 0; i < rep; ++i)sb.append(7);
      System.out.println(sb);
  }
  
  class Car implements Comparable<Car>{
      int s, e, i;
      public Car(int ss,  int ee, int ii) {
          s = ss;
          e = ee;
          i = ii;
      }
      
      @Override
      public int compareTo(Car o) {
          return s - o.s;          
      }
  }
     
  private int max(int a, int b) {
      return a >  b ? a : b;
  }
  
  private int min(int a, int b) {
      return a >  b ? b : a;
  }
  
  
  static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(BufferedReader in)
        {            
            br = in;
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    String line = br.readLine();
                    if (line == null || line.length() == 0) return "";
                    st = new StringTokenizer(line);
                }
                catch (IOException  e)
                {
                    return "";
                    //e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                return "";
                //e.printStackTrace();
            }
            return str;
        }
    }
}
