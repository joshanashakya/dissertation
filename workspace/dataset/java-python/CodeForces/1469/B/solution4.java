import java.util.Scanner; public class B1469 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int N = in.nextInt();            int maxR = 0;            int sum = 0;            for (int n=0; n<N; n++) {                int r = in.nextInt();                sum += r;                maxR = Math.max(maxR, sum);            }            int maxB = 0;            sum = 0;            int M = in.nextInt();            for (int m=0; m<M; m++) {                int b = in.nextInt();                sum += b;                maxB = Math.max(maxB, sum);            }            int answer = maxR + maxB;            System.out.println(answer);        }    } }
