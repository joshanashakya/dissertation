import java.util.Scanner; public class B900 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int A = in.nextInt();        int B = in.nextInt();        A %= B;        int C = in.nextInt();        int answer = -1;        for (int i=1; i<=B+1; i++) {            A *= 10;            int d = A/B;            A %= B;            if (d == C) {                answer = i;                break;            }        }        System.out.println(answer);    } }
