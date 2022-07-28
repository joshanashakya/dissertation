import java.util.ArrayList;import java.util.List;import java.util.Scanner; public class B1407 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t=0; t<T; t++) {            int N = in.nextInt();            List<Integer> rest = new ArrayList<>();            for (int n=0; n<N; n++) {                rest.add(in.nextInt());            }            StringBuilder output = new StringBuilder();            int gcd = 0;            int nextGCD;            int nextNumber = 0;            while (!rest.isEmpty()) {                nextGCD = 0;                for (int a : rest) {                    int candGCD = gcd(a, gcd);                    if (candGCD > nextGCD) {                        nextGCD = candGCD;                        nextNumber = a;                    }                }                gcd = nextGCD;                output.append(nextNumber).append(' ');                rest.remove((Integer) nextNumber);            }            System.out.println(output);        }    }     static int gcd(int a, int b) {        return (b == 0) ? a : gcd(b, a%b);    } }