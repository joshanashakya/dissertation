import java.util.Scanner; public class Main {       public static void main(String[] args) {          Scanner in = new Scanner(System.in);          int n = in.nextInt();          int m = in.nextInt();          for(int i = 1 ;i<=2*n ;i++)         {             int a = 2 * n+i;              if(a<=m ) System.out.println(a);             if(i<=m) System.out.println(i);         }    }}
