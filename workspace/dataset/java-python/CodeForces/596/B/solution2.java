import java.io.PrintWriter;import java.util.Scanner; public class Main { 	public static void main(String[] args) {		        Scanner in = new Scanner(System.in);		PrintWriter pw = new PrintWriter(System.out);		int n = in.nextInt();				int pre = 0;		long sum = 0;				for (int i = 0; i < n; i++) {			int input = in.nextInt();						sum += Math.abs(input - pre);			pre = input;		}				pw.println(sum); 		pw.close();	} }   			 		 	  		  	     	 		   		