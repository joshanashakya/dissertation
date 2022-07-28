
import java.util.Scanner;

public class DigestThread{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
          int num1 ,num2;
          num1 = sc.nextInt();
          num2 = sc.nextInt();
          
          if(num1*2 > num2)
              System.out.println("-1 -1");
          else 
              System.out.println(num1 + " " + num1*2);
          
          
      }
  }
}
