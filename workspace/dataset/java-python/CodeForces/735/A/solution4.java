import java.util.Scanner;import java.lang.StringBuilder;public class OstapGrasshopper {   public static void main(String[] args) {      Scanner sc = new Scanner(System.in);      int cells = sc.nextInt();      int jumps = sc.nextInt();      sc.nextLine();      String path = sc.nextLine();       int g = path.indexOf("G");      int t = path.indexOf("T");      if (t < g) {         StringBuilder sb = new StringBuilder(path);         sb.reverse();         path = sb.toString();         g = path.indexOf("G");         t = path.indexOf("T");      }       int pos = g + jumps;      boolean found = false;      while (pos < cells && !found && pos <= t) {         if (path.charAt(pos) == '#') {            System.out.println("NO");            found = true;         }         else if (path.charAt(pos) == 'T') {            System.out.println("YES");            found = true;         }         pos += jumps;      }      if (!found) {         System.out.println("NO");      }   }}