import java.util.*; public class P3 {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);	int t =sc.nextInt();if(t==0)System.out.println("O-|-OOOO");	while(t>0) {		int n=t%10;				if(n==1) {			System.out.println("O-|O-OOO");		}else if(n==2) {			System.out.println("O-|OO-OO");		}else if(n==3){			System.out.println("O-|OOO-O");		}else if(n==4) {			System.out.println("O-|OOOO-");		}else if(n==5){			System.out.println("-O|-OOOO");		}else if(n==6) {			System.out.println("-O|O-OOO");		}else if(n==7){			System.out.println("-O|OO-OO");        }else if(n==8) {        	System.out.println("-O|OOO-O");		}else if(n==9){			System.out.println("-O|OOOO-");		}else if(n==0) {			System.out.println("O-|-OOOO");		}		t/=10;	}	}}
