import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = "";
            for (int j = 0; j < n; j++) {
                s += sc.next();
            }
            boolean isTrue = true;
            while (s.length() > 0) {
                String s1 = s.substring(0, 1);
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s1.equals(s.substring(j, j + 1))) count++;
                }
                s = s.replace(s1, "");
                if (count >= n) {
                    if (n % 2 == 0) {
                        if (count % 2 != 0) isTrue = false;
                    }else {
                        if (count%n!=0) isTrue=false;
                    }
                } else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

