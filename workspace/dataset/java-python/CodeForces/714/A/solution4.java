//package codeforces.div2; import java.util.Scanner; public class MeetingofOldFriends {    static public void print(long a, long b, long x, long y, long k) {         long max = Math.max(a, x);        long min = Math.min(b, y);         if((k>=max && min>=k)) {            long diff =  min - max;            if(diff < 0) {                System.out.println(0);            } else {                System.out.println(min - max);            }        } else {            long diff =  min - max + 1;            if(diff < 0) {                System.out.println(0);            } else {                System.out.println(min - max + 1);            }        }    }     public static void main(String []args) {        Scanner sc = new Scanner(System.in);        long a = sc.nextLong();        long b = sc.nextLong();        long c = sc.nextLong();        long d = sc.nextLong();        long k = sc.nextLong();        print(a, b, c, d, k);    }}
