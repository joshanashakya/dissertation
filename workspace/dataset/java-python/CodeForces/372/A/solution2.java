import java.util.*; public class CF {    private static void sport(int[] a) {        Arrays.sort(a);        int n = a.length;        int ans = n;        int j = n / 2;        for (int i = 0; i < n / 2; i++) {            while (true) {                if (j == n) {                    System.out.println(ans);                    return;                }                if (a[i]*2 <= a[j]) {                    j++;                    ans--;                    break;                } else {                    j++;                }            }        }        System.out.println(ans);    }     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int[] a = new int[n];        for (int i = 0; i < n; i++) {            a[i] = sc.nextInt();        }        sport(a);    }}