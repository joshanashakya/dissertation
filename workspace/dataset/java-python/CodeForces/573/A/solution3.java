import java.util.Scanner; public class BearAndPoker {  public static void main(String[] args) {    Scanner xScanner = new Scanner(System.in);    int n = xScanner.nextInt();    int[] bids = new int[n];    for (int i = 0; i < n; i++) {      bids[i] = xScanner.nextInt();      bids[i] = removePrimeFactors2And3(bids[i]);      if(i > 0 && bids[i] != bids[i-1]) {        System.out.println("NO");        return;      }    }    System.out.println("YES");  }   private static int removePrimeFactors2And3(int num) {    //-- Entferne die Faktoren 2 and 3    while (true) {      if(num % 2 == 0) {        num /= 2;        continue;      }      else if(num % 3 == 0) {        num /= 3;        continue;      }      else        break;    }    return num;  }}