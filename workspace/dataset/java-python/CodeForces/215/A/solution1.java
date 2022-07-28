// 215A - Bicycle Chain// https://codeforces.com/problemset/problem/215/A import java.util.Scanner; public class CF215A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int gearsFront = sc.nextInt();        int[] frontGears = new int[gearsFront];        for (int i = 0; i < gearsFront; i++) {            frontGears[i] = sc.nextInt();        }        int gearsBack = sc.nextInt();        int[] backGears = new int[gearsBack];        for (int i = 0; i < gearsBack; i++) {            backGears[i] = sc.nextInt();        }        double maxRatio = 0;        int count = 0;        for (int i = 0; i < gearsBack; i++) {            for (int j = 0; j < gearsFront; j++) {                if (backGears[i] % frontGears[j] == 0) {                    int x = backGears[i] / frontGears[j];                    if (x > maxRatio) {                        maxRatio = x;                        count = 1;                    } else if (x == maxRatio) {                        count += 1;                    }                    break;                }             }        }        System.out.println(count);        sc.close();    }}
