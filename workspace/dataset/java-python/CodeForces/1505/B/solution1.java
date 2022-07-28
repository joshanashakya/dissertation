import java.util.*;

public class HelloWorld{

     public static void main(String []args){
       Scanner sc = new Scanner(System.in);
      
           int n = sc.nextInt();
           while(n>=10){
               n = sum(n);
           }
           System.out.println(n);
       
     }
    static int sum(int n){
    int sum=0;
    while(n>0){
        sum+=n%10;
        n=n/10;
    }
    return sum;
}
}
