import java.util.Scanner;public class Codeforces112B {    public static void main(String[] args){        Scanner sc = new Scanner(System.in);        int n , x , y ;        n = sc.nextInt();        x = sc.nextInt();        y = sc.nextInt();        boolean ok = true;        int row = n / 2 ;        int col = n / 2;        if((row == x && col == y) || (row + 1 == x && col == y) || (row == x && col + 1 == y) || (row + 1 == x && col + 1 == y)) ok = false;        if(ok) System.out.println("YES");        else System.out.println("NO");    }}
