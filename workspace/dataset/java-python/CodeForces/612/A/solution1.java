import java.util.*; public class Main{     static int countp = 0;    static int countq = 0;     public static void main(String[] args)    {        Scanner input = new Scanner(System.in);        int n = input.nextInt();        int a[] = new int[2];        a[0] = input.nextInt();        a[1] = input.nextInt();        String s = input.next();        if (s.length() % a[0] == 0) {            countp = s.length() / a[0];        } else if (s.length() % a[1] == 0) {            countq = s.length() / a[1];         } else {            for (int i = 0; i <= 100; i++) {                if ( (s.length() - (a[0] * i)) % a[1] == 0&&((s.length() - (a[0] * i)) / a[1])>=0) {                    countp = i;                    countq = (s.length() - (a[0] * i)) / a[1];                    break;                }            }        }        int start = 0;        if (countp == 0 && countq == 0) {            System.out.println("-1");        } else {            System.out.println(countp + countq);            while (countp-- > 0) {                System.out.println(s.substring(start, start + a[0]));                start = start + a[0];            }            while (countq-- > 0) {                System.out.println(s.substring(start, start + a[1]));                start += a[1];            }        }    } }