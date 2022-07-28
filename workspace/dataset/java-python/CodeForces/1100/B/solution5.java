import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Map;import java.util.Scanner;import java.util.HashMap; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BBuildAContest solver = new BBuildAContest();        solver.solve(1, in, out);        out.close();    }     static class BBuildAContest {        public void solve(int testNumber, Scanner in, PrintWriter out) {            int n = in.nextInt();            int m = in.nextInt();            int[] problemCounter = new int[n];            Map<Integer, Integer> quantityCount = new HashMap<>();            int contests = 0;            for (int i = 0; i < m; i++) {                int p = in.nextInt() - 1;                problemCounter[p]++;                int curCount = problemCounter[p];                quantityCount.put(curCount, quantityCount.getOrDefault(curCount, 0) + 1);                if (quantityCount.get(contests + 1) == n) {                    contests++;                    out.print(1);                } else {                    out.print(0);                }            }            out.println();        }     }} 