 import java.util.*; public class Main {    public static int solve(String str) {        int ans, i, j;        i = 0;        j = str.length() -1;        while (true) {            ans = 1;            if (str.charAt(i) != str.charAt(j) || i == j) return -1;            while (i < str.length() - 1) {                if (str.charAt(i++) != str.charAt(i)) break;                ans++;            }            if (i >= j) return ans;            while (j >= 1) {                if (str.charAt(j--) != str.charAt(j)) break;                ans++;            }            if (ans < 2) return -1;        }    }    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        String str = input.next();        System.out.println(solve(str) < 2 ? 0 : solve(str) + 1);    }}
