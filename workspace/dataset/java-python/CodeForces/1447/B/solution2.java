import java.util.Scanner; public class B1447 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int R = in.nextInt();            int C = in.nextInt();            int sum = 0;            int min = Integer.MAX_VALUE;            int negative = 0;            for (int r=0; r<R; r++) {                for (int c=0; c<C; c++) {                    int a = in.nextInt();                    if (a < 0) {                        negative++;                    }                    a = Math.abs(a);                    sum += a;                    min = Math.min(min, a);                }            }            int answer = (negative%2 == 0) ? sum : (sum - 2*min);            System.out.println(answer);        }    } }