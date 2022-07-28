import java.util.*;
public class MyClass {
     public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int s= 0;
        
        while (n / 10 > 0) {
            while (n > 0) {
                s=s+n%10;
                n=n/ 10;                
            }
            n = s;
            s = 0;
        }
        System.out.println(n);
    }
}
