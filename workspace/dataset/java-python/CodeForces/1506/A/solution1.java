import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t > 0) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long x = scan.nextLong();

            long row = (x - 1) % n + 1;
            long col = (x - 1) / n + 1;

            System.out.println((row - 1) * m + col);

            t --;
        }

    }


}


















