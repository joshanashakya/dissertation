import java.util.*;public class _1401B {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while (t-- > 0) {             int x1 = sc.nextInt();            int y1 = sc.nextInt();            int z1 = sc.nextInt();             int x2 = sc.nextInt();            int y2 = sc.nextInt();            int z2 = sc.nextInt();             int res = 0, score = 0;             score = Math.min(z1, y2); //2 and 1            res += 2 * score;             score = Math.min(y1, x2); //1 and 0            y1 -= score;                        score = Math.min(x1, z2); // 0 and 2            z2 -= score;             score = Math.min(y1, z2);            res -= 2 * score;            System.out.println(res);        }    }}