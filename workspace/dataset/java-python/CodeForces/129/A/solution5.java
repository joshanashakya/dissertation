import java.util.*;import java.util.Scanner;public class Main{  public static void main(String[] args){    Scanner sc = new Scanner(System.in);    int bags = sc.nextInt();    int odds  = 0;    int evens = 0;      for(int i = 0; i<bags; i++){        int cookies= sc.nextInt();         if(cookies%2==0){          evens++;        }        else           odds++;      }       if(odds%2==1){        System.out.print(odds);      }      else         System.out.print(evens);  }}