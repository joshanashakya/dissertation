//package Coding; import java.io.*;import java.util.*; public class CodeForces {    public static void main(String[] args) throws IOException {        Scanner in = new Scanner(System.in);        String line = in.nextLine();        StringBuilder left = new StringBuilder(line.substring(0, line.indexOf('|')));        StringBuilder right = new StringBuilder(line.substring(line.indexOf('|')));        right.deleteCharAt(0);        StringBuilder extra = new StringBuilder(in.nextLine());        while (extra.length() > 0) {            if (left.length() < right.length()) {                left.append(extra.charAt(0));             } else {                right.append(extra.charAt(0));            }            extra.deleteCharAt(0);        }         if (left.length() == right.length()) {            System.out.println(left + "|" + right);        } else {            System.out.println("Impossible");        }      }  }          