//package codeforces.div2; import java.util.Scanner; public class PerfectPair {     static public void print(long x, long y, long m) {         long count = 0;        if(x > y) {            long p = y;            y = x;            x = p;        }        if(x>=m || y>=m) {            System.out.println(0);        } else {            boolean flsg = false;            if (x<0 && y>0){                count+=Math.abs(x/y);                x=x%y;            }else if (x>0 && y<0){                count+=Math.abs(y/x);                y=y%x;            }            while (y < m) {                long diff = x + y;                if (x <= 0 && y <= 0) {                    flsg = true;                    break;                } else {                    if(x <= 0 && y <= 0) {                        flsg = true;                        break;                    } else {                        count++;                        long p = Math.min(y, diff);                        y = Math.max(y, diff);                        x = p;                    }                }            }            if (flsg == false) {                System.out.println(count);            } else {                System.out.println(-1);            }        }    }     public static void main(String []args) {         Scanner sc = new Scanner(System.in);        long x = sc.nextLong();        long y = sc.nextLong();        long z = sc.nextLong();        print(x, y, z);    }}