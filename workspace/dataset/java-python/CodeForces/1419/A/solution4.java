import java.util.Scanner; public class DigitGAme {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String testcase = scanner.nextLine();        int t = Integer.parseInt(testcase);        String[] ns = new String[t];        String[] digits = new String[t];          for (int i = 0; i < t; i++) {            ns[i] = scanner.nextLine();            digits[i] = scanner.nextLine();         }         for (int i = 0; i < t; i++)            solve(ns[i], digits[i]);      }     public static void solve(String n, String d) {        boolean oddExists = false;        boolean evenExists = false;         int num = Integer.parseInt(n);        if (num == 1 && Integer.parseInt(d) % 2 != 0)            System.out.println(1);        else {             for (int i = 0, j = 1; i < num && j < num && !(oddExists && evenExists); i = i + 2, j = j + 2) {                 if (Character.getNumericValue(d.charAt(i)) % 2 != 0)                    oddExists = true;                 if (Character.getNumericValue(d.charAt(j)) % 2 == 0)                    evenExists = true;            }             if (num % 2 != 0 && oddExists)                System.out.println(1);            else if (num % 2 != 0 && !oddExists)                System.out.println(2);            else if (evenExists)                System.out.println(2);            else                System.out.println(1);         }      }}