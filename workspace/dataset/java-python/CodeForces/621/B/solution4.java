 import java.util.*;  public class Main {  static  Scanner input = new Scanner(System.in);    public static void main(String[] args) {              long left[] = new long[100000];      long right[] = new long[100000];        long sum=0;        int n = input.nextInt();         for (int i = 0; i < n; i++) {            int x = input.nextInt();            int y = input.nextInt();            sum+=(left[x+y]++) +(right[y-x+10000]++);                    }         System.out.println(sum);             }         }
