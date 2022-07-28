import java.awt.Point;import java.io.File;import java.io.IOException;import java.io.PrintWriter;import java.util.Arrays;import java.util.Comparator;import java.util.Scanner; public class B234 {     public static void main(String[] args) throws IOException {        Scanner in = new Scanner(new File("input.txt"));        int N = in.nextInt();        int K = in.nextInt();        Point[] P = new Point[N];        for (int n=1; n<=N; n++) {            int light = in.nextInt();            P[n-1] = new Point(light, n);        }        Arrays.sort(P, new Comparator<Point>() {            @Override            public int compare(Point o1, Point o2) {                return o2.x - o1.x;            }        });        PrintWriter out = new PrintWriter(new File("output.txt"));        out.println(P[K-1].x);        StringBuilder output = new StringBuilder();        for (int k=0; k<K; k++) {            output.append(P[k].y).append(' ');        }        out.println(output);        out.close();    }}
