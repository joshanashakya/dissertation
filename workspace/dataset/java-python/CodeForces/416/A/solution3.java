import java.util.*; public class Main{     public static void main(String[] args)    {        Scanner input = new Scanner(System.in);        int tc = input.nextInt();        long lowerlimit = -2000000000, UpperLimit = 2000000000;        for (int i = 0; i < tc; i++) {            String s = input.next();            long x = input.nextLong();            char ch = input.next().charAt(0);            if (ch == 'Y') {                long newUpperLimit = 0, newLowerLimit = 0;                if (s.length() == 2 && s.charAt(0) == '>') {                                        lowerlimit = Math.max(lowerlimit, x);                 } else if (s.length() == 2 && s.charAt(0) == '<') {                    newUpperLimit = x;                    UpperLimit = Math.min(UpperLimit, newUpperLimit);                 } else if (s.charAt(0) == '>') {                    newLowerLimit = x + 1;                    lowerlimit = Math.max(lowerlimit, newLowerLimit);                } else if (s.charAt(0) == '<') {                    newUpperLimit = x - 1;                    UpperLimit = Math.min(UpperLimit, newUpperLimit);                 }                 if (lowerlimit > UpperLimit) {                    System.out.println("Impossible");                    return;                }             } else {                long newUpperLimit = 0, newLowerLimit = 0;                if (s.length() == 1 && s.charAt(0) == '<') {                    newLowerLimit = x;                    lowerlimit = Math.max(lowerlimit, newLowerLimit);                } else if (s.length() == 1 && s.charAt(0) == '>') {                    newUpperLimit = x;                    UpperLimit = Math.min(UpperLimit, newUpperLimit);                } else if (s.length() == 2 && s.charAt(0) == '>') {                    newUpperLimit = x - 1;                    UpperLimit = Math.min(UpperLimit, newUpperLimit);                } else if (s.length() == 2 && s.charAt(0) == '<') {                    newLowerLimit = x + 1;                    lowerlimit = Math.max(lowerlimit, newLowerLimit);                }                if (lowerlimit > UpperLimit) {                    System.out.println("Impossible");                    return;                }                                            }                 }        System.out.println(lowerlimit);    } }
