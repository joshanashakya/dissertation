import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        while(sc.hasNextInt()){                                int t=sc.nextInt();                while(t-->0)                {                     int a=sc.nextInt();                     int b=sc.nextInt();                     int c=sc.nextInt();                     System.out.println(Math.max(0,Math.abs(a-b)+Math.abs(a-c)+Math.abs(b-c)-4));                }        }    }}  		   	  		 		 			  		 	  	 		
