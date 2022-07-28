import java.util.Arrays;
import java.util.Scanner; public


class A1470 {     public static void main(String[] args) {Scanner in = new Scanner(System.in );        int T = in.nextInt(); for (int t=0; t < T; t++) {int N = in.nextInt();            int M = in.nextInt();            Integer[] K = new Integer[N]; for (int n=0; n < N; n++) {K[n] = in.nextInt();}            int[] C = new int[M]; for (int m=0; m < M; m++) {C[m] = in.nextInt();}            Arrays.sort(K);            long[] money = new long[N+1]; for (int n=0; n < N; n++) {money[n+1] = money[n] + C[K[n]-1];}            long[] giftCost = new long[M+1]; for (int m=0; m < M; m++) {giftCost[m+1] = giftCost[m] + C[m];}            long minCost = Long.MAX_VALUE; for (int gifts=0; gifts <= Math.min(N, M); gifts++) {long cost = giftCost[gifts] + money[N-gifts];                minCost = Math.min(minCost, cost);}            System.out.println(minCost);}} }
