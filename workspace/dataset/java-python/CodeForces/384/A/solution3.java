import java.util.*;    public class Main {	        public static void main(String[] args) {    	  Scanner in = new Scanner(System.in);    	  int n = in.nextInt();    	  System.out.println(( n * n + 1 )/2);    	    for(int i = 0; i < n; i++){    	    	StringBuilder sb = new StringBuilder();    	        for(int j = 0; j < n; j++){    	            if(( i + j ) % 2  == 0)    	            	sb.append("C");    	            else    	            	sb.append(".");    	        }    	        System.out.println(sb);    	    }    	  in.close();      } } 	 				     		   	 	 		   		