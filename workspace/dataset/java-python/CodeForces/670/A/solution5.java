import java.util.Scanner; public class Main {    static Scanner scanner = new Scanner(System.in);     public static void main(String[] args) {        Holidays();    }     public static void Holidays() {        int n = scanner.nextInt();        int counterMin = 0;        int counterMax = 0;         counterMax = n / 7 * 2;        counterMin = n / 7 * 2;        if (n % 7 == 6) counterMin++;        if (n % 7 >= 2) {            counterMax += 2;        } else if (n % 7 == 1) {            counterMax++;        }         System.out.println(counterMin);        System.out.println(counterMax);    } }
