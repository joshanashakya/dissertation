import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);//        int testCases = sc.nextInt();//        while (testCases-- >= 1) {        int n = sc.nextInt();        int d = sc.nextInt();        int l = sc.nextInt();        int a[] = new int[n];        for (int i = 0; i < n; i++) {            if ((i & 1) == 1) {                a[i] = 1;            } else {                a[i] = l;            }        }        int max = 0;        for (int i = n - 1; i >= 0; i--) {            max = a[i] - max;        }        if (d > max) {            System.out.println(-1);            return;        } else {            for (int i = 0; i < n; i++) {                if (max > d) {                    if ((i & 1) == 1) {                        a[i] += Math.min(l - 1, max - d);                        max -= (a[i] - 1);                    } else {                        a[i] -= Math.min(l - 1, max - d);                        max -= (l - a[i]);                    }                }            }        }        if (max != d) {            System.out.println(-1);            return;        } else {            for (int i = 0; i < n; i++) {                System.out.print(a[i] + " ");            }        }     }}
