//package albert.codeforces.sagheerthehausmeister; import java.util.Scanner; public class Solution {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        int n = scan.nextInt();        int m = scan.nextInt();        String[] floors = new String[n];        int lights = 0;        int[] lightz = new int[n];        int last = 0;        for (int i = 0; i < n; i++) {            String f = scan.next();            floors[n - 1 - i] = f;            int lightsHere = count(f);            if (lightsHere > 0) {                last = Math.max(last, n - 1 - i);            }            lights += lightsHere;            lightz[n - 1 - i] = lightsHere;        }        int l = 0;        int r = (int) 1e9;        for (int i = 0; i < last && lights > 0; i++) {            int ll = Math.min(l + rightMost(floors[i]) * 2, r + m + 1) + 1;            int rr = Math.min(l + m + 1, leftMost(floors[i]) * 2 + r) + 1;            lights -= lightz[i];            l = ll;            r = rr;        }        System.out.println(Math.min(l + rightMost(floors[last]), r + leftMost(floors[last])));    }     private static int count(String f) {        int n = f.length();        int total = 0;        for (int i = 0; i < n; i++) {            total += (f.charAt(i) - '0');        }        return total;    }     private static int leftMost(String floor) {        int l = 0;        int n = floor.length();        for (int i = 1; i < n; i++) {            if (floor.charAt(n - 1 - i) == '1') {                l = i;            }        }        return l;    }     private static int rightMost(String floor) {        int r = 0;        int n = floor.length();        for (int i = 1; i < n; i++) {            if (floor.charAt(i) == '1') {                r = i;            }        }        return r;    }}