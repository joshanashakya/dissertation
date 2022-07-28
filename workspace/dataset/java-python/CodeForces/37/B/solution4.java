import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.AbstractCollection;import java.util.PriorityQueue;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int N = in.nextInt();            int max = in.nextInt();            int reg = in.nextInt();            PriorityQueue<spell> allSpells = new PriorityQueue<>((spell f, spell s) -> s.pow - f.pow);            for (int i = 0; i < N; i++) {                allSpells.offer(new spell(in.nextInt(), in.nextInt(), i + 1));            }            StringBuilder log = new StringBuilder();            PriorityQueue<spell> activeSpells = new PriorityQueue<>((spell f, spell s) -> s.dmg - f.dmg);            int sumDmg = 0;            int bossHealth = max;            int killTime = 0;            int usedSpells = 0;            for (int time = 1; ; time++) {                bossHealth -= sumDmg;                bossHealth = Math.min(bossHealth + reg, max);                if (bossHealth <= 0) break;                killTime = time;                while (!allSpells.isEmpty() && allSpells.peek().pow >= (100.0 * bossHealth) / max) {                    activeSpells.offer(allSpells.poll());                }                if (!activeSpells.isEmpty()) {                    spell cur = activeSpells.poll();                    sumDmg += cur.dmg;                    usedSpells++;                    log.append(time - 1);                    log.append(' ');                    log.append(cur.numb);                    log.append('\n');                }                if (activeSpells.isEmpty() && reg >= sumDmg) {                    out.println("NO");                    return;                }            }            out.println("YES");            out.println(killTime + " " + usedSpells);            out.println(log);        }         class spell {            int pow;            int dmg;            int numb;             spell(int p, int d, int n) {                pow = p;                dmg = d;                numb = n;            }         }     }     static class InputReader {        private BufferedReader reader;        private StringTokenizer stt;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream));        }         public String nextLine() {            try {                return reader.readLine();            } catch (IOException e) {                return null;            }        }         public String next() {            while (stt == null || !stt.hasMoreTokens()) {                stt = new StringTokenizer(nextLine());            }            return stt.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
