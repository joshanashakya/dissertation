import java.util.ArrayList;import java.util.List;import java.util.Locale;import java.util.Scanner;  // 696B -public class Puzzles {     static int N;    static List<Integer>[] ADJ; // i == city    static int[] SIZE; // i == city    static int[] SUM_SIZE; // i == parent    static double[] E; // i == city      public static void main(String[] args) {        Locale.setDefault(Locale.US);        final Scanner scanner = new Scanner(System.in);        N = scanner.nextInt();        ADJ = new ArrayList[N + 1];        SIZE = new int[N + 1];        SUM_SIZE = new int[N + 1];        E = new double[N + 1];        for (int t = 0; t < N - 1; t++) {            int parent = scanner.nextInt();            if (ADJ[parent] == null) ADJ[parent] = new ArrayList<>();            ADJ[parent].add(t + 2);        }        calculateSize(1);        calculateExpectation(1, -1);        for (int i = 1; i < E.length; i++) {            if (i > 1) System.out.print(" ");            System.out.print(E[i]);        }        System.out.println();    }     static void calculateExpectation(int city, int parent) {        final double avgDelta = parent >= 1 ? 1.0 * (SUM_SIZE[parent] - SIZE[city]) / 2 : 0;        E[city] = parent >= 1 ? (E[parent] + avgDelta + 1) : 1;        List<Integer> children = ADJ[city];        if (children != null) {            for (int child : children) calculateExpectation(child, city);        }    }     static int calculateSize(int city) {        int res = 1;        SUM_SIZE[city] = 0;        List<Integer> children = ADJ[city];        if (children != null) {            for (int child : children) {                int s = calculateSize(child);                SUM_SIZE[city] += s;                res += s;            }        }        SIZE[city] = res;        return res;    }}