import java.util.Scanner;public class Works {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int a = in.nextInt();        int b = in.nextInt();        int w = in.nextInt();        int x = in.nextInt();        long c = in.nextInt();        if (b >= 0 && b < w && x > 0 && x < w)            if (c <= a) System.out.println(0);            else  {                long sec = (long)Math.ceil(1.0*((c - a) * x - b) / (w - x));                System.out.println(sec + c - a);            }     }}