import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int t =s.nextInt();        while(t-- != 0){            long a = s.nextLong();            long b = s.nextLong();            long c = s.nextLong();            if(c > a){                System.out.print(1 + " ");            }            else{                System.out.print(-1 + " ");             }            if(a * b > c){                System.out.println(b + " ");            }            else{                System.out.println(-1 + " ");            }        }    }}