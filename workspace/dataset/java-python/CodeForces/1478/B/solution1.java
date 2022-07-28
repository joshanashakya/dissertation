import java.util.Scanner; public class B1478 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        StringBuilder output = new StringBuilder();        for (int t=0; t<T; t++) {            int Q = in.nextInt();            int D = in.nextInt();            boolean[] possible = new boolean[100];            possible[0] = true;            for (int n=1; n<100; n++) {                if (isLucky(n, D)) {                    for (int i=0; i<100-n; i++) {                        if (possible[i]) {                            possible[i+n] = true;                        }                    }                }            }            for (int q=0; q<Q; q++) {                int a = in.nextInt();                if (a >= 100) {                    output.append("YES");                } else {                    output.append(possible[a] ? "YES" : "NO");                }                output.append('\n');            }        }        System.out.print(output);    }     static boolean isLucky(int N, int D) {        while (N > 0) {            if (N%10 == D) {                return true;            }            N /= 10;        }        return false;    } }