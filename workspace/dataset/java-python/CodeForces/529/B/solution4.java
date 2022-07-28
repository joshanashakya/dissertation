import java.util.Arrays;import java.io.InputStream;import java.io.InputStreamReader;import java.io.BufferedReader;import java.io.OutputStream;import java.io.PrintWriter;import java.util.Comparator;import java.io.IOException;import java.util.StringTokenizer; /** * Built using CHelper plug-in * Actual solution is at the top * @author Kartik Singal (ka4tik) */public class Main {	public static void main(String[] args) {		InputStream inputStream = System.in;		OutputStream outputStream = System.out;		InputReader in = new InputReader(inputStream);		PrintWriter out = new PrintWriter(outputStream);		TaskB solver = new TaskB();		solver.solve(1, in, out);		out.close();	}} class TaskB {    public void solve(int testNumber, InputReader in, PrintWriter out) {         int n = in.nextInt();        Rectangle rectangles[] = new Rectangle[n];        for (int i = 0; i < n; i++) {            rectangles[i] = new Rectangle(in.nextInt(), in.nextInt());            int temp=rectangles[i].w;            rectangles[i].w=rectangles[i].h;            rectangles[i].h=temp;        }        long ans = Long.MAX_VALUE;        for (int i = 1; i <=1000; i++) {            final int h = i;            int used = 0;            int w = 0;            boolean possible = true;            for (Rectangle rectangle : rectangles) {                if (rectangle.h > h && rectangle.w > h) {                    possible = false;                    break;                }                if (rectangle.h > h) {                    used++;                    if (used*2 > n) {                        possible = false;                        break;                    }                    w += rectangle.h;                    rectangle.used = true;                }                else if(rectangle.w>h)                {                    w += rectangle.w;                    rectangle.used = true;                }            }            Arrays.sort(rectangles, new Comparator<Rectangle>() {                public int compare(Rectangle o1, Rectangle o2) {                        return (o2.w - o2.h) - (o1.w - o1.h);                }            });            for (Rectangle rectangle : rectangles) {                if (rectangle.used)                    continue;                if (rectangle.h <= h && rectangle.w <= h) {                    if (rectangle.w - rectangle.h > 0 && (used+1)*2 <= n) {                        used++;                        w += rectangle.h;                    } else                        w += rectangle.w;                }                else                    assert(false);            }            for (Rectangle rectangle : rectangles) {                rectangle.used = false;            }            if (possible) {                ans = Math.min(ans, ((long) h) * (long) w);            }        }        out.println(ans);     }     static class Rectangle {        public int h, w;        boolean used;         public Rectangle(int h, int w) {            this.h = h;            this.w = w;            this.used = false;        }    }} class InputReader {    public BufferedReader reader;    public StringTokenizer tokenizer;     public InputReader(InputStream stream) {        reader = new BufferedReader(new InputStreamReader(stream), 32768);        tokenizer = null;    }     public String next() {        while (tokenizer == null || !tokenizer.hasMoreTokens()) try {            tokenizer = new StringTokenizer(reader.readLine());        } catch (IOException e) {            throw new RuntimeException(e);        }        return tokenizer.nextToken();    }     public int nextInt() {        return Integer.parseInt(next());    } } 