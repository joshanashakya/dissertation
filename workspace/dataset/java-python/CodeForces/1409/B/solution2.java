import java.util.Scanner; public class B1409 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int A = in.nextInt();            int B = in.nextInt();            int X = in.nextInt();            int Y = in.nextInt();            int N = in.nextInt();            long answer = Math.min(solve(A,B,X,Y,N), solve(B,A,Y,X,N));            System.out.println(answer);        }    }     static long solve(int A, int B, int X, int Y, int N) {        int delta = Math.min(A-X, N);        A -= delta;        N -= delta;        delta = Math.min(B-Y, N);        B -= delta;        return A*(long) B;    } }
