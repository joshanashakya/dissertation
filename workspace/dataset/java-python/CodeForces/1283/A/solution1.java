import java.util.Arrays;import java.util.Scanner; public class DigestThread{   public static void main(String[] args) {      Scanner in = new Scanner(System.in);      int t = in.nextInt();      for (int i = 0; i < t; i++) {          final int new_year = 1440;          int h ,m;          h = in.nextInt();          m = in.nextInt();                    System.out.println(new_year - ((h*60) + m));      }  }}
