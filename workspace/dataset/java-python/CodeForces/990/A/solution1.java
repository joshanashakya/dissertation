import java.util.Scanner; public class com_boxers {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        long n = sc.nextLong();        long m = sc.nextLong();        int a = sc.nextInt();        int b = sc.nextInt();         if(n % m == 0){            System.out.println("0");        }        else {            if(n > m){                long div = n/m;                long temp = n-m*div;                long cost1 = temp*b;                div++;                long temp1 = m*div-n;                long cost2 = temp1*a;                if(cost1 > cost2){                    System.out.println(cost2);                }                else {                    System.out.println(cost1);                }            }            else {                long cost1 = n*b;                long cost2 = (m-n)*a;                if(cost1 > cost2){                    System.out.println(cost2);                }                else {                    System.out.println(cost1);                }            }        }    }}  			  		 	    		 		 	 	 	 	  	