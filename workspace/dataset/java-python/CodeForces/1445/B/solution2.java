import java.util.*;import java.io.*;import java.lang.*; public class Main {   public static void main(String[] args) {    Scanner sc = new Scanner(System.in);    int t = sc.nextInt();     for(int i=0;i<t;i++) {      int a = sc.nextInt();      int b = sc.nextInt();      int c = sc.nextInt();      int d = sc.nextInt();                  System.out.println(Math.max((a+b), (c+d)));    }  }    // Function that returns true if    // str is a palindrome    static boolean isPalindrome(String str)    {         // Pointers pointing to the beginning        // and the end of the string        int i = 0, j = str.length() - 1;         // While there are characters to compare        while (i < j) {             // If there is a mismatch            if (str.charAt(i) != str.charAt(j))                return false;             // Increment first pointer and            // decrement the other            i++;            j--;        }         // Given string is a palindrome        return true;    }}