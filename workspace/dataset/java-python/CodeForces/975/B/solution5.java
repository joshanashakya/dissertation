import java.util.Scanner; public class B975 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int[] A = new int[14];        for (int i=0; i<14; i++) {            A[i] = in.nextInt();        }        long max = 0;        for (int from=0; from<14; from++) {            int a = A[from];            int remains = a/14;             long score = (remains%2 == 0) ? remains : 0;            for (int i=1; i<14; i++) {                int count = A[(from+i)%14] + (a+14-i)/14;                if (count%2 == 0) {                    score += count;                }            }            max = Math.max(max, score);        }        System.out.println(max);    } }
