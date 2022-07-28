import java.io.BufferedReader;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.OutputStream;import java.io.OutputStreamWriter;import java.io.PrintWriter;import java.util.StringTokenizer; public class B747 {   public static void main(String[] args){    InputStream inputStream = System.in;    OutputStream outputStream = System.out;    InputReader in = new InputReader(inputStream);    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));     Solver solver = new Solver();    solver.solve(in, out);    out.close();  }   static class Solver {     InputReader in;    PrintWriter out;     public void solve(InputReader in, PrintWriter out) {      this.in = in;      this.out = out;       int n = in.readInt();      char[] s = in.read().toCharArray();       if (n % 4 != 0) {        out.print("===");        return;      }       int goal = n / 4;      int a = count(s, 'A');      int c = count(s, 'C');      int g = count(s, 'G');      int t = count(s, 'T');       if (a > goal || c > goal || g > goal || t > goal){        out.print("===");        return;      }       char ch = 'A';      int co = a;       for (int i = 0; i < s.length; i++){        if (s[i] == '?'){          while (co == goal){            if (ch == 'A'){              ch = 'C';              co = c;            } else if (ch == 'C'){              ch = 'G';              co = g;            } else if (ch == 'G'){              ch = 'T';              co = t;            } else {              out.print("should not happen 1");              return;            }          }          s[i] = ch;          co++;        }      }       out.print(s);    }     private int count(char[] s, char c){      int count = 0;      for (char value : s) {        if (value == c) {          count++;        }      }      return count;    }  }   static class InputReader {    private BufferedReader reader;    private StringTokenizer tokenizer;     public InputReader(InputStream stream) {      this.reader = new BufferedReader(new InputStreamReader(stream));    }     public String read() {      try {        if (tokenizer == null || !tokenizer.hasMoreTokens()) {          tokenizer = new StringTokenizer(reader.readLine());        }      } catch (IOException ex) {        throw new RuntimeException(ex);      }      return tokenizer.nextToken();    }     public int readInt() {      return Integer.parseInt(read());    }     public long readLong() {      return Long.parseLong(read());    }     public void readIntArrays(int[]... arrays) {      for (int i = 0; i < arrays[0].length; i++) {        for (int j = 0; j < arrays.length; j++) {          arrays[j][i] = readInt();        }      }    }  }}