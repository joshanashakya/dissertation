import java.util.ArrayList;import java.util.List;import java.util.Scanner; public class Main {     public static void main (String[] args) {              Scanner scanner = new Scanner(System.in);            String s  = scanner.next();            String newstr =s.replaceAll("a","");             int removedcharlength = s.length()-newstr.length();            int midindex = newstr.length()/2;            if(newstr.substring(0,midindex).equals(newstr.substring(midindex))            ){                String strz =s.substring(0,midindex+removedcharlength).replaceAll("a","");                 if(s.substring(midindex+removedcharlength).equals(strz))                System.out.println(s.substring(0,midindex+removedcharlength));                else                System.out.println(":(");            }            else                System.out.println(":(");         } }
