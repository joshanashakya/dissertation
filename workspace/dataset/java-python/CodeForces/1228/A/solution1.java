import java.util.HashSet;import java.util.Scanner; public class A1228 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int l = scanner.nextInt(), r = scanner.nextInt();        boolean flag = false;        for (int i = l; i <= r; i++) {            int a = i, t = 0;            HashSet<Integer> set = new HashSet<>();            while (a > 0) {                set.add(a % 10);                a /= 10;                t++;            }            if (set.size() == t) {                System.out.println(i);                flag = false;                break;            } else {                flag = true;            }        }        if (flag) System.out.println(-1);    }}