import java.util.*;import static java.lang.Math.max;import static java.lang.Math.min; public class Test {    public static void main(String[] args) {         Scanner input = new Scanner(System.in);        int n = input.nextInt();        int[] a = new int[n];        int[] b = new int[n];         for (int i = 0; i < n; i++)            a[i] = input.nextInt();         for (int i = 0; i < n; i++)            b[i] = input.nextInt();         long sum = 0;        for (int i = 0; i < n; i++) {            sum += a[i];        }          int first = max(b[0], b[1]), second = min(b[0], b[1]);        for (int i = 2; i < n; i++) {                           if (b[i] > first) {                second = first;                first = b[i];            } else if (b[i] > second) {                second = b[i];            }        }        System.out.println(first + second >= sum ? "YES" : "NO");    }       }   