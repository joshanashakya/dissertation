import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int n;
        for(int i =0; i<t ; i++){
            n=s.nextInt();
            if(n <= 30){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                if(n==36 || n==40 || n==44){
                    System.out.println("6 "+"10 "+"15 "+Integer.toString(n-31));
                }
                else{
                    System.out.println("6 "+"10 "+"14 "+Integer.toString(n-30));
                }
            }
        }
    }
}
