import java.util.Scanner; public class TukkaMar {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         String[] option = new String[4];        int[] length = new int[4];         for (int i = 0; i < 4; i++){            option[i] = scanner.nextLine();            length[i] = option[i].length() - 2;        }         int great = 0, ans = 0;        for (int i = 0; i < 4; i++) {            int small = 0, big = 0;            for (int j = 0; j < 4; j++) {                if(i != j){                    if(length[i] >= 2*length[j]) big++;                    else if(2*length[i] <= length[j]) small++;                }            }             if(small == 3 || big == 3){                great++;                ans = i;            }        }         if(great == 1) System.out.println((char) ('A' + ans));        else System.out.println("C");    }}