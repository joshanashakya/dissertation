import java.io.BufferedInputStream;import java.util.*; import static java.lang.Math.*; public class Main {  public static void main(String[] args) {    Scanner in = new Scanner(new BufferedInputStream(System.in));    int n = in.nextInt();    String str = in.next();    int sum = 0;    for (int i = 0; i < n; ++i) {      if (str.charAt(i) % 2 == 0) {        sum += i +1;      }    }    System.out.println(sum);  }}