import java.io.*;import java.util.*;import java.lang.*;import java.util.Random;public class Main {    public static void main (String[] args) throws java.lang.Exception {        Scanner scan = new Scanner (System.in);        int repeat = scan.nextInt();        int val = 0;        while (repeat-->0) {            String test = scan.next().trim();            if (test.equals("++X") || test.equals("X++"))                val++;            else if (test.equals("--X") || test.equals("X--"))                val--;        }        System.out.println(val);    }}
