import java.util.Arrays;import java.util.Scanner; public class A1445 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int N = in.nextInt();            int X = in.nextInt();            int[] A = new int[N];            for (int n=0; n<N; n++) {                A[n] = in.nextInt();            }            int[] B = new int[N];            for (int n=0; n<N; n++) {                B[n] = in.nextInt();            }            Arrays.sort(A);            Arrays.sort(B);            boolean ok = true;            for (int n=0; n<N; n++) {                if (A[n] + B[N-1-n] > X) {                    ok = false;                    break;                }            }            System.out.println(ok ? "Yes" : "No");        }    } }