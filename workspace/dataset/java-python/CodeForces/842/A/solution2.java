import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Scanner;import java.util.TreeMap;import java.util.TreeSet;  public class Main {         public static void main(String[] args) {       Scanner input = new Scanner(System.in);       long l=input.nextInt(),r=input.nextInt(),x=input.nextInt(),y=input.nextInt(),k=input.nextInt();	              for (long i = x; i <=y; i++) {            if(i*k>=l &&i*k<=r)            {                System.out.println("YES");                return;            }        }        System.out.println("NO");    }    }