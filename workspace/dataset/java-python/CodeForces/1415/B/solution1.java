import java.util.Scanner; public class B1415 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int N = in.nextInt();            int K = in.nextInt();            int[] C = new int[N];            for (int n=0; n<N; n++) {                C[n] = in.nextInt();            }            int min = Integer.MAX_VALUE;            for (int c=1; c<=100; c++) {                int days = 0;                int pos = 0;                while (pos < N) {                    if (C[pos] == c) {                        pos++;                    } else {                        pos += K;                        days++;                    }                }                min = Math.min(days, min);            }            System.out.println(min);        }    } }
