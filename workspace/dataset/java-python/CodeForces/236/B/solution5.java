import java.util.Scanner; public class Task236B_ {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int sum = 0;        int[] a = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};         int max = a[0] * a[1] * a[2];        int[] arr = new int[max + 1];        fillDivisors(max, arr);        for (int i = 1; i <= a[0]; i++) {            for (int j = 1; j <= a[1]; j++) {                for (int k = 1; k <= a[2]; k++) {                    sum += arr[i * j * k];                }            }        }        System.out.println(sum % 1073741824);    }     private static int[] fillDivisors(int max, int[] arr) {        for (int i = 1; i <= max; i++) {            for (int j = i; j <= max; j += i) {                arr[j]++;            }        }        return arr;    }}