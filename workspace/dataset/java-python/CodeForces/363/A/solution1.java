import java.util.*;public class Soroban { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc= new Scanner(System.in);		int n=sc.nextInt(); 	 if(n==0)			System.out.println("O-|-OOOO");		else		while(n!=0)		{			if(n%10==0)				System.out.println("O-|-OOOO");			else if(n%10==1)				System.out.println("O-|O-OOO");			else if(n%10==2)				System.out.println("O-|OO-OO");			else if(n%10==3)				System.out.println("O-|OOO-O");			else if(n%10==4)				System.out.println("O-|OOOO-");			else if(n%10==5)				System.out.println("-O|-OOOO");			else if(n%10==6)				System.out.println("-O|O-OOO");			else if(n%10==7)				System.out.println("-O|OO-OO");			else if(n%10==8)				System.out.println("-O|OOO-O");			else 				System.out.println("-O|OOOO-");			n=n/10;		}	} }