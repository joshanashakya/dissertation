import java.util.*;public class Joysticks {    public static void main(String[] args){        Scanner in = new Scanner(System.in);        int a1 = in.nextInt(), a2 = in.nextInt();        System.out.println(a1 + a2 - ((Math.abs(a1 - a2) % 3 == 0 && a1 * a2 != 1) ? 3 : 2));            }}
