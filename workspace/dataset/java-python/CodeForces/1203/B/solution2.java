import java.util.Arrays;import java.util.Scanner;import java.util.stream.IntStream; public class EqualRectangles {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String testCase = scanner.nextLine();        int t = Integer.parseInt(testCase);        String[] n = new String[t];        String[] sticks = new String[t];          for (int i = 0; i < t; i++) {            n[i] = scanner.nextLine();            sticks[i] = scanner.nextLine();        }        for (int i = 0; i < t; i++) {            solve(n[i], sticks[i]);        }    }      public static void solve(String n, String sticks) {        int r = Integer.parseInt(n);        int[] s = Arrays.stream(sticks.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();        boolean helper = false;        boolean helper1 = false;         int area = s[0] * s[4 * r - 1];          for (int i = 0; i < 4 * r - 1; i = i + 2) {            if (s[i] == s[i + 1])                helper = true;            else {                helper = false;                break;            }        }         if (!helper)            System.out.println("NO");        else {            for (int i = 1; i < 2 * r; i = i + 2) {                if (s[i] * s[4 * r - i] == area)                    helper1 = true;                else {                    helper1 = false;                    break;                }            }             if (helper1)                System.out.println("YES");            else                System.out.println("NO");         }    }}