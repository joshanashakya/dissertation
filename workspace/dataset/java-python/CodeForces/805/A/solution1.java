import java.util.*; public class Solve {     static Scanner scan = new Scanner(System.in);     public static long solve(long l,long r){        if(l == r){            return l;        }        return 2;    }      public static void main(String[] args) {         long l = scan.nextLong();        long r = scan.nextLong();        System.out.println(solve(l,r));    }}