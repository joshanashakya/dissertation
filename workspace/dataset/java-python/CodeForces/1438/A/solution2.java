import java.util.Scanner; public class A1438 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        StringBuilder output = new StringBuilder();        for (int t=0; t<T; t++) {            int N = in.nextInt();            for (int n=0; n<N; n++) {                output.append("1 ");            }            output.append('\n');        }        System.out.print(output);    } }