import java.util.Scanner; public class A255 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt(), ch = 0, bic = 0, back = 0;        int a[] = new int[n];        for (int i = 0; i < n; i++) {            a[i] = scanner.nextInt();        }        for (int i = 0; i < n; i += 3) {            ch += a[i];        }        for (int i = 1; i < n; i += 3) {            bic += a[i];        }        for (int i = 2; i < n; i += 3) {            back += a[i];        }        int max = Math.max(Math.max(ch, bic), back);        if (max == ch) {            System.out.println("chest");        } else if (max == bic) {            System.out.println("biceps");        } else {            System.out.println("back");        }    }}
