import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while((n--)!=0) {
			long p,a,b,c;
			p=input.nextLong();
			a=input.nextLong();
			b=input.nextLong();
			c=input.nextLong();
			System.out.println(Math.min(Math.min((a-p%a)%a, (b-p%b)%b),(c-p%c)%c));
		}
	}	
}

     	   	 		   			 									 	
