import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int t = s.nextInt();        while(t-- != 0){            int n = s.nextInt();            int x = s.nextInt();            int a = s.nextInt();            int b = s.nextInt();            int min = Math.min(a,b);            int max = Math.max(a,b);            int new_max = Math.min(max + x,n);            x = x - new_max + max;            int new_min = Math.max(min - x,1);            System.out.println(new_max - new_min);        }    }}
