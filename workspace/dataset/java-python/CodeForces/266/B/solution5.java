import java.util.Scanner; public class Main {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);         int n = in.nextInt();        int t = in.nextInt();        in.nextLine();        String s = in.nextLine();         char[] a = s.toCharArray();         for (int step = 0; step < t; step++) {            for (int i = 0; i < a.length - 1; i++) {                if (a[i] == 'B' && a[i + 1] == 'G') {                    a[i] = 'G';                    a[i + 1] = 'B';                    i++;                }            }        }         System.out.println(new String(a));    }}