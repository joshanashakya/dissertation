import java.util.Arrays;import java.util.Scanner; public class n492B {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        long l = scanner.nextLong();        long[] lattern = new long[n];        for (int i = 0; i < n; i++) {            lattern[i] = scanner.nextLong();        }        Arrays.sort(lattern);        long max;        if (lattern[0] != 0)            max = lattern[0] * 2;        else            max = lattern[0];        for (int i = 1; i < n - 1; i++) {            max = Math.max(lattern[i] - lattern[i - 1], max);        }        if (lattern[n - 1] != l) {            max = Math.max((l - lattern[n - 1]) * 2, max);        } else {            if (n == 1)                max = Math.max(l * 2, max);            else                max = Math.max(l - lattern[n - 2], max);        }        System.out.println((double)max / 2);    }}
