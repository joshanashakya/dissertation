import java.util.Scanner;

public class DMCA {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        while (n / 10 > 0) {
            while (n > 0) {
                int dig = n % 10;
                sum += dig;
                n /= 10;                
            }
            n = sum;
            sum = 0;
        }
        System.out.println(n);
        
    }
    
}

