  import java.io.*;   import java.util.*;     public class Training {       public static void main(String[] args) throws IOException {        Scanner input = new Scanner(System.in);        long n = input.nextLong(),k= input.nextLong();                 long a  = n/2/(k+1);         long b = a *k  ;          System.out.println(a +" "+b+" "+(n-a-b));                        }  // end main      }
