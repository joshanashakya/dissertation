import java.util.*;import java.math.BigInteger; import java.io.*;public class Main{      public static void main(String args[])throws IOException     {       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        String param[]=br.readLine().trim().split("\\s+");         BigInteger m=new BigInteger(param[0]);       BigInteger A=new BigInteger("127");       BigInteger B=new BigInteger("32767");       BigInteger C=new BigInteger("2147483647");       BigInteger D=new BigInteger("9223372036854775807");      if (m.compareTo(A) <= 0)      System.out.println("byte");     else if (m.compareTo(B) <= 0)      System.out.println("short");      else if (m.compareTo(C) <= 0)      System.out.println("int");      else if (m.compareTo(D) <= 0)      System.out.println("long");      else      System.out.println("BigInteger");     }}	  	 	    	 					 		  	     		
