import java.util.Scanner; public class Main {     public static void main(String[] args) {	// write your code here        int n, s;        int mug;        int sum =0, max = 0;        Scanner sc = new Scanner(System.in);        n = sc.nextInt();        s = sc.nextInt();         for(int i=0;i<n;i++){            sc.reset();            mug = sc.nextInt();             if(mug > max)                max = mug;             sum+= mug;         }         if((sum - max) <= s)            System.out.println("YES");        else            System.out.println("NO");    }}
