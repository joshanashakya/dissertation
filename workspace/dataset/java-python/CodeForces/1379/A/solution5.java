//package com.codeforces.Round657; import java.util.Arrays;import java.util.Scanner; public class Div2A {     private static final String TERM = "abacaba";     private static int countTerm(char[] chars) {         int count = 0; boolean flag;         for (int i = 0; i + 6 < chars.length; i++) {             flag = true;             for (int j = 0; j <= 6; j++) {                if (chars[i + j] != TERM.charAt(j)) {                    flag = false; break;                }            }             if (flag) count++;        }         return count;    }     private static void replaceQ(char[] chars) {        for (int i = 0; i < chars.length; i++) {            if (chars[i] == '?')                chars[i] = 'z';        }    }     public static void main(String[] args) {         Scanner scanner = new Scanner(System.in);         int t = Integer.parseInt(scanner.nextLine());         int n;        char[] tmp;        char[] chars;        boolean flag;         boolean found;         for (int i = 0; i < t; i++) {             n = Integer.parseInt(scanner.nextLine());             chars = scanner.nextLine().toCharArray();             found = false;             for (int j = 0; j + 6 < n; j++) {                 tmp = Arrays.copyOf(chars, chars.length);                 flag = true;                 for (int k = 0; k <= 6; k++) {                    if (tmp[j + k] != '?' && tmp[j + k] != TERM.charAt(k)) {                        flag = false; break;                    }                    tmp[j + k] = TERM.charAt(k);                }                 if (flag && countTerm(tmp) == 1) {                    replaceQ(tmp);                    System.out.println("YES");                    System.out.println(                        String.valueOf(tmp)                    );                    found = true; break;                }            }             if (!found) System.out.println("NO");        }         scanner.close();    }}
