import java.util.*; public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while (t-- > 0) {            int n = sc.nextInt();            if(n == 1) System.out.println(9);            else if(n == 2) System.out.println(98);            else if(n == 3) System.out.println(989);            else {                System.out.print(989);                int x = 0;                while (n-- > 3) {                    System.out.print(x);                    if(x == 9) x=0;                    else x++;                }                System.out.println();            }        }    }}
