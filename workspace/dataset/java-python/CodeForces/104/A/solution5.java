import java.util.*;import java.util.Scanner;public class Blackjack{  public static void main(String[] args){    Scanner sc = new Scanner(System.in);    int n = sc.nextInt()-10;    if(n<1||n>11)      System.out.print(0);    else if(n==10)      System.out.print(15);    else       System.out.print(4);  }}
