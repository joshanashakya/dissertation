import java.util.Scanner;import java.util.StringTokenizer; public class BuyAShovel {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String line = scanner.nextLine();         StringTokenizer stringTokenizer = new StringTokenizer(line);         int k = Integer.parseInt(stringTokenizer.nextToken());        int r = Integer.parseInt(stringTokenizer.nextToken());         for (int i = 1; i < 100000; i++) {            int result = (k * i) % 10;             if (result == 0 || result == r) {                System.out.println(i);                return;            }         }     }}