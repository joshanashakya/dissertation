import java.util.*; public class Practise {     static int[][] dp;      public static void main(String[] args) {        Scanner sc = new Scanner(System.in);     String s= sc.next();     String s1=sc.next();     int a =Integer.parseInt(s.substring(0,2));     int b= Integer.parseInt(s.substring(3));        int aa =Integer.parseInt(s1.substring(0,2));        int bb= Integer.parseInt(s1.substring(3));        int  mm=0;        int hh=0;        //System.out.println(a+" "+b);       mm=(b-bb);       if(mm<0)       {           mm+=60;           hh=-1;       }       hh=hh+(a-aa);       if(hh<0)           hh+=24;        System.out.println(String.format("%02d:%02d",hh,mm));       }} 		  		 			   			      				  	
