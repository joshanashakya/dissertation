import java.util.Scanner;
public class p1496A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    l:  for(int t=sc.nextInt();t-->0;) {
            int n=sc.nextInt(),k=sc.nextInt();
            String s=sc.next();
            if(s.substring(0,k).equals(reverse(s.substring(n-k,n))) && k*2<n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
