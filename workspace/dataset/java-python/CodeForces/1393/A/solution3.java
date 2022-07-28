import java.util.Scanner;

public class A1393 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            int N = in.nextInt();
            int answer = N/2 + 1;
            System.out.println(answer);
        }
    }

}

