import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }     public static void main(String[] args) throws IOException    {        Scanner input = new Scanner(System.in);      String s = input.next();         if(s.startsWith("CODEFORCES"))         {             System.out.println("YES");         }         else if(s.startsWith("CODEFORCE")&&s.endsWith("S"))         {             System.out.println("YES");         }         else if(s.startsWith("CODEFORC")&&s.endsWith("ES"))         {             System.out.println("YES");         }         else if(s.startsWith("CODEFOR")&&s.endsWith("CES"))         {             System.out.println("YES");                      }         else if(s.startsWith("CODEFO")&&s.endsWith("RCES"))         {             System.out.println("YES");                      }         else if(s.startsWith("CODEF")&&s.endsWith("ORCES"))         {             System.out.println("YES");         }         else if(s.startsWith("CODE")&&s.endsWith("FORCES"))         {             System.out.println("YES");                      }         else if(s.startsWith("COD")&&s.endsWith("EFORCES"))         {             System.out.println("YES");                      }         else if(s.startsWith("CO")&&s.endsWith("DEFORCES"))         {             System.out.println("YES");         }         else if(s.startsWith("C")&&s.endsWith("ODEFORCES"))         {             System.out.println("YES");         }         else if(s.endsWith("CODEFORCES"))         {             System.out.println("YES");         }         else             System.out.println("NO");                               } }