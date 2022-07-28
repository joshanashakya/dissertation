import java.util.Scanner; public class A1494 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        char[][] variants = new char[][]{            {')', ')', ')'},            {')', ')', '('},            {')', '(', ')'},            {')', '(', '('},            {'(', ')', ')'},            {'(', ')', '('},            {'(', '(', ')'},            {'(', '(', '('},        };        int T = in.nextInt();        for (int t = 0; t < T; t++) {            char[] S = in.next().toCharArray();            boolean ok = false;            for (char[] variant : variants) {                ok |= isValid(S, variant);            }            System.out.println(ok ? "YES" : "NO");        }    }     static boolean isValid(char[] S, char[] variant) {        int count = 0;        for (char c : S) {            char bracket = variant[c-'A'];            if (bracket == ')') {                count--;            } else {                count++;            }            if (count < 0) {                return false;            }        }        return (count == 0);    } }