import java.util.Arrays;import java.util.Scanner;import java.lang.String;import java.util.Random; public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        for (int i = 0; i < t; i++) {            int n = sc.nextInt();            for (int j = 0; j < n; j+=2) {                int a = sc.nextInt();                int b = sc.nextInt();                System.out.print(-b + " " + a  + " ");            }            System.out.println(  );        }    }}
