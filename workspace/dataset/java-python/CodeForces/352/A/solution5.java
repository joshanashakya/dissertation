import java.util.Scanner; public class A352 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        int five = 0;        int zero = 0;        for (int i = 0; i < n; i++) {            int x = scanner.nextInt();            if (x == 5){                five++;            }else {                zero++;            }        }        if (five < 9 && zero >= 1) {            System.out.println("0");        } else if (five == n) {            System.out.println("-1");        } else {            int temp = five % 9;            five -= temp;            for (int i = 0; i < five; i++){                System.out.print("5");            }            for (int i = 0; i < zero; i++){                System.out.print("0");            }        }    }} 