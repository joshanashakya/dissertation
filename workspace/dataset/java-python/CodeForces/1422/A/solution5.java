import java.util.Scanner; public class A1422 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int A = in.nextInt();            int B = in.nextInt();            int C = in.nextInt();            int D = Math.max(A, Math.max(B, C));            System.out.println(D);        }    } }
