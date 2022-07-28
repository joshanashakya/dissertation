import java.util.Arrays;import java.util.Comparator;import java.util.Scanner; public class B195 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int N = in.nextInt();        int M = in.nextInt();        Integer[] A = new Integer[M];        for (int m=0; m<M; m++) {            A[m] = m+1;        }        Arrays.sort(A, new Comparator<Integer>() {            @Override            public int compare(Integer o1, Integer o2) {                double d1 = Math.abs((M+1)/2.0 - o1);                double d2 = Math.abs((M+1)/2.0 - o2);                if (d1 == d2) {                    return o1 - o2;                } else {                    return (int) Math.signum(d1-d2);                }            }        });        StringBuilder output = new StringBuilder();        for (int n=0; n<N; n++) {            output.append(A[n%M]).append('\n');        }        System.out.print(output);    } }
