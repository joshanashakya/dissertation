import java.util.*;import static java.lang.Math.pow; public class Test {    public static void main(String[] args) {         Scanner input = new Scanner(System.in);        int n = input.nextInt();            System.out.println(((n & 1) == 0) ? (int)pow(2, n / 2) : 0);    }}