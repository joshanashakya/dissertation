import java.util.Scanner; public class A1428 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int X1 = in.nextInt();            int Y1 = in.nextInt();            int X2 = in.nextInt();            int Y2 = in.nextInt();            int dx = Math.abs(X2-X1);            int dy = Math.abs(Y2-Y1);            int answer = dx + dy;            if (dx != 0 && dy != 0) {                answer += 2;            }            System.out.println(answer);        }    } }