import java.util.*;import java.math.*; public class Solution {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        long A = s.nextLong(), B = s.nextLong(), C = s.nextLong();         if (A == 0 && B == 0) {            System.out.println(C == 0 ? -1 : 0);        }        else if (A == 0) {            System.out.println(1);            System.out.println(1.0 * -C / B);        }        else {            long discriminant = B * B - 4 * A * C;                        if (discriminant < 0)                System.out.println(0);            else if (discriminant == 0) {                System.out.println(1);                System.out.println(1.0 * -B / (2.0 * A));            }            else {                System.out.println(2);                double num1 = (-B - Math.sqrt(discriminant)) / (2.0 * A);                double num2 = (-B + Math.sqrt(discriminant)) / (2.0 * A);                 if (num1 < num2) {                    System.out.println(num1);                    System.out.println(num2);                }                else {                    System.out.println(num2);                    System.out.println(num1);                }            }        }         s.close();    }}