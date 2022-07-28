import java.util.Scanner;

public class B1392 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        StringBuilder output = new StringBuilder();
        for (int t=0; t<T; t++) {
            int N = in.nextInt();
            long K = in.nextLong();
            int[] A = new int[N];
            for (int n=0; n<N; n++) {
                A[n] = in.nextInt();
            }
            op(A);
            if (K%2 == 0) {
                op(A);
            }
            for (int a : A) {
                output.append(a).append(' ');
            }
            output.append('\n');
        }
        System.out.print(output);
    }

    private static void op(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int a : A) {
            max = Math.max(max, a);
        }
        for (int n=0; n<A.length; n++) {
            A[n] = max - A[n];
        }
    }

}

