import java.util.Scanner; public class B1428 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int N = in.nextInt();            String S = in.next();            boolean cycle = (S.indexOf('>') == -1) || (S.indexOf('<') == -1);            int answer;            if (cycle) {                answer = N;            } else {                answer = 0;                for (int n=0; n<N; n++) {                    int next = (n+1)%N;                    if (S.charAt(n) == '-' || S.charAt(next) == '-') {                        answer++;                    }                }            }            System.out.println(answer);        }    } }