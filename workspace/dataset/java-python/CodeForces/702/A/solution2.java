import java.util.Scanner; public class A702 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        int a[] = new int[n], t = 1, max = 1;        for (int i = 0; i < n; i++) {            a[i] = scanner.nextInt();        }        for (int i = 0; i < n - 1; i++) {            if (a[i] < a[i + 1]) {                t++;            } else {                if (max < t) {                    max = t;                }                t = 1;            }        }         if (max < t) {            max = t;        }        System.out.println(max);    }}