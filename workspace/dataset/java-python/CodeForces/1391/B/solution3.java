import java.util.Scanner;

public class B1391 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            int R = in.nextInt();
            int C = in.nextInt();
            char[][] A = new char[R][];
            for (int r=0; r<R; r++) {
                A[r] = in.next().toCharArray();
            }
            int answer = 0;
            for (int r=0; r<R; r++) {
                if (A[r][C-1] == 'R') {
                    answer++;
                }
            }
            for (int c=0; c<C; c++) {
                if (A[R-1][c] == 'D') {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

}

