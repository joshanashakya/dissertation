import java.util.HashSet;import java.util.Scanner;import java.util.Set; public class A1466 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int N = in.nextInt();            int[] X = new int[N];            for (int n=0; n<N; n++) {                X[n] = in.nextInt();            }            Set<Integer> set = new HashSet<>();            for (int from=0; from<N; from++) {                for (int to=from+1; to<N; to++) {                    int area = X[to]-X[from]; // divided by 2                    set.add(area);                }            }            System.out.println(set.size());        }    } }
