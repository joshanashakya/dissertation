import java.util.Scanner; /** * F */public class Main {     public static Scanner sc = new Scanner(System.in);     public static void main(String[] args) {        int cases = sc.nextInt();        for (int i = cases; i != 0; i--) {            long n = 0, res = 0;            long a = sc.nextLong(), b = sc.nextLong(), k = sc.nextLong();            if (k % 2 == 1) {                n = k / 2 + 1;                res += n * a - (n - 1) * b;            } else {                n = k / 2;                res += n * a - n * b;            }            System.out.println(res);        }    }} 	  		 	   	    	 				   			 		