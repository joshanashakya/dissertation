import java.util.Scanner; /** * * @author Fabian */public class Main {     /**     * @param args the command line arguments     */    public static void main(String[] args) {     Scanner sc=new Scanner(System.in);     int n=sc.nextInt(),k=sc.nextInt();     String a=sc.next();             if (k>n/2) {            while(k<n){                System.out.println("RIGHT");                k++;            }        }else{            while(k>1){                System.out.println("LEFT");                k--;            }        }        if (k==1) {                       for (int i = 0; i <a.length(); i++) {                System.out.println("PRINT "+a.charAt(i));                if ((i+1)<a.length()) {                    System.out.println("RIGHT");                }            }                                            }else{             for (int i = a.length()-1; i>=0; i--) {                System.out.println("PRINT "+a.charAt(i));                if ((i-1)>=0) {                    System.out.println("LEFT");                }            }        }                                 }    }  				 	    	  		 	      				 	
