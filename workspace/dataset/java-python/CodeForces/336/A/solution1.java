import java.util.*;import java.util.Scanner;public class Main{  public static void main(String[] args){    Scanner sc = new Scanner(System.in);    int x = sc.nextInt();    int y = sc.nextInt();    int x1 = 0;    int y1 = 0;    int x2 = 0;    int y2 = 0;    if(x<0)    x1 = (int) (-1*Math.abs(x)+-1*Math.abs(y));    else     x1 = (int) (Math.abs(x)+Math.abs(y));    y1 = 0;    if(y<0)    y2 = (int) (-1*Math.abs(x)+-1*Math.abs(y));    else     y2 = (int) (Math.abs(x)+Math.abs(y));    x2 = 0;     if(x1<x2)    System.out.print(x1 + " " + y1 + " " + x2 + " " + y2);    else     System.out.print(x2 + " " + y2 + " " + x1 + " " + y1);  }}
