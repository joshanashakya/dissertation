import java.util.Scanner; public class Hate_A {     public static void main(String[] args) {         Scanner in = new Scanner(System.in);         int x = in.nextInt();in.nextLine() ;         String s = in.nextLine();         char ch[] = s.toCharArray();        int countS = 0;        int countF = 0;        for (int i = 1; i < x; i++) {            if (ch[i - 1] != ch[i]) {                if (ch[i] == 'F') {                    countF++;                } else {                    countS++;                }            }        }        System.out.println((countF > countS && countF != 0) ? "YES" : "NO");     }}