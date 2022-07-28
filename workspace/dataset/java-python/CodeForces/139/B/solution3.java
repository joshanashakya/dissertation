import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Artem Gilmudinov */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Reader in = new Reader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, Reader in, PrintWriter out) {            int n = in.ni();            TaskB.Room[] rooms = new TaskB.Room[n];            for (int i = 0; i < n; i++) {                rooms[i] = new TaskB.Room(in.ni(), in.ni(), in.ni());            }            int m = in.ni();            TaskB.Roll[] rolls = new TaskB.Roll[m];            for (int i = 0; i < m; i++) {                rolls[i] = new TaskB.Roll(in.ni(), in.ni(), in.ni());            }            int res = 0;            for (int i = 0; i < n; i++) {                TaskB.Room room = rooms[i];                int p = room.a * 2 + 2 * room.b;                int minPrice = Integer.MAX_VALUE;                for (int j = 0; j < m; j++) {                    TaskB.Roll roll = rolls[j];                    if (room.h > roll.a) {                        continue;                    }                    int cnt = roll.a / room.h;                    int price = (p % (cnt * roll.b) == 0 ? p / (cnt * roll.b) : p / (cnt * roll.b) + 1) * roll.p;                    minPrice = Math.min(price, minPrice);                }                res += minPrice;            }            out.println(res);        }         class Room {            int a;            int b;            int h;             public Room(int a, int b, int h) {                this.a = a;                this.b = b;                this.h = h;            }         }         class Roll {            int a;            int b;            int p;             public Roll(int a, int b, int p) {                this.a = a;                this.b = b;                this.p = p;            }         }     }     static class Reader {        private BufferedReader in;        private StringTokenizer st = new StringTokenizer("");        private String delim = " ";         public Reader(InputStream in) {            this.in = new BufferedReader(new InputStreamReader(in));        }         public String next() {            if (!st.hasMoreTokens()) {                st = new StringTokenizer(rl());            }            return st.nextToken(delim);        }         public String rl() {            try {                return in.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public int ni() {            return Integer.parseInt(next());        }     }} 