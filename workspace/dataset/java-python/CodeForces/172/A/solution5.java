import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        int n = scan.nextInt();        String[] array = new String[n];        for (int i = 0; i < n; i++) {            array[i]= scan.next();        }        int count = 0;        for (int i = 0; i < array[0].length(); i++) {            for (int j = 0; j < array.length; j++) {                if (array[0].charAt(i) != array[j].charAt(i)) {                    System.out.println(count);                    return;                }            }            count++;        }    }}
