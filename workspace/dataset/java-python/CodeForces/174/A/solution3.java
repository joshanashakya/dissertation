import java.util.Locale;import java.util.Scanner; public class A174 {     public static void main(String[] args) {        Locale.setDefault(Locale.US);        Scanner in = new Scanner(System.in);        int N = in.nextInt();        int B = in.nextInt();        int[] A = new int[N];        int max = 0;        int sum = 0;        for (int n=0; n<N; n++) {            int a = in.nextInt();            sum += a;            max = Math.max(a, max);            A[n] = a;        }        int minNeeded = N*max-sum;        if (minNeeded > B) {            System.out.println("-1");        } else {            double target = (sum + B)/(double)N;            for (int a : A) {                System.out.println(target - a);            }        }    } }