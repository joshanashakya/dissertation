import java.util.Scanner; public class StickAnimal {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int[] sticks = new int[9];        boolean flag = false;         for (int i = 0; i < 6; i++) {            if (sticks[scanner.nextInt() - 1]++ == 3) flag = true;        }         if(flag){            for (int i = 0; i < 9; i++) {                if(sticks[i] == 1){                    System.out.println("Bear");                    return;                }            }            System.out.println("Elephant");        }else System.out.println("Alien");    }}
