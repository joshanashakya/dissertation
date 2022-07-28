import java.util.Scanner;

public class javaProject{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int test = input.nextInt();
    while(test-- > 0){
      int n = input.nextInt(), k = input.nextInt();
      String s = input.next();
      // 0 1 2 3 4 5
      int count = 0;
      for(int i = 0; i < (n%2 == 1 ? n/2 : n/2-1); i++){
        if(s.charAt(i) == s.charAt(n-1-i)){
          count++;
        }else{
          break;
        }
      }
      if(count >= k)System.out.println("YES");
      else System.out.println("NO");
    }
  }
}
