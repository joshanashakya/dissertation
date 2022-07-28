import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            while(n-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(2*l<=r) {
                    System.out.printf("%d %d\n", l, 2 * l);
                }
                else{
                        System.out.print("-1 -1\n");
                    }
            }
        }
    }
}
   	  	 				 		     	    	    	
