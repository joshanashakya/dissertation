
import java.util.Scanner;

public class A1389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int l = scanner.nextInt(), r = scanner.nextInt();
            if (r == 2 && l == 1) {
                System.out.println(l + " " + r);
                continue;
            }
            if ((r - l) == 1 || l > r / 2) {
                System.out.println(-1 + " " + (-1));
            } else {
                if (r % 2 == 0) {
                    System.out.println(r / 2 + " " + r);
                } else {
                    System.out.println((r - 1) / 2 + " " + (r - 1));
                }
            }
        }
    }
}

