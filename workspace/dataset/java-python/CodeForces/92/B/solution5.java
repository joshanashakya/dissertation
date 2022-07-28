//package codeforces.div2;

import java.util.Scanner;

public class BinaryNumber {

    static public void print(String s) {

        int rem = 0;
        int count = 0;
        for(int i = s.length() - 1; i>=1; i--) {
            int x = s.charAt(i) - '0';
            int y = x + rem;
            if(y%2 == 0) {
                count = count + 1;
            } else {
                count = count + 2;
            }
            if(y!=0) {
                rem = 1;
            } else {
                rem = 0;
            }
        }

        System.out.print(count + rem);
    }

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        print(s);

    }
}

