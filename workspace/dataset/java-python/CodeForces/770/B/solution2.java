import java.math.BigInteger;import java.util.*; public class Main {     static Scanner input = new Scanner(System.in);     public static void main(String[] args) {        String s = input.next();        long len = s.length();        long res = Long.parseLong(s);        long sumofDigits= getSum(res);        for (int i = 0; i < len-1; i++) {            if(s.charAt(i)=='0')                continue;            long number = Long.parseLong(s);            number-= Long.parseLong(s.substring(i+1))+1;            if(getSum(number)==sumofDigits&&number>res||(getSum(number))>sumofDigits)            {                res = number;                sumofDigits = getSum(number);            }        }        System.out.println(res);}         private static long getSum(long number) {       long sum=0;       while(number!=0)       {           sum+=number%10;           number/=10;       }       return sum;    }   }