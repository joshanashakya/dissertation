// 219A - k-String// https://codeforces.com/problemset/problem/219/A import java.util.Arrays;import java.util.Scanner; public class CF219A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int k = sc.nextInt();        String str = sc.next();        int l = str.length();        char[] s = str.toCharArray();        Arrays.sort(s);        char ch = 0;        int count = 0;        for (int i = 0; i < s.length; i++) {            if (i % k == 0) {                ch = s[i];            }            if (s[i] == ch) {                count++;            }        }        if (l == count && count % k == 0) {            for (int i = 0; i < k; i++) {                for (int c = 0; c < s.length; c += k) {                    System.out.print(s[c]);                }            }        } else {            System.out.print(-1);        }        sc.close();    }}