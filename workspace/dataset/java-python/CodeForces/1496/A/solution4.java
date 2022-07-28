import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            scanner.nextLine();
            String s=scanner.nextLine();
            boolean b=n>2*k;
            for (int j = 0; j < k; j++) b=b && (s.charAt(j)==s.charAt(s.length()-1-j));
            if (b)System.out.println("YES");else System.out.println("NO");
        }
    }
}

