import java.util.*; public class M_Round_5 { 	public static void main(String[] args) {			Scanner sc = new Scanner(System.in);		//D. Poster		int n = sc.nextInt();		int k = sc.nextInt();		String s=sc.next();				if(k==1) {			for(int i=0; i<n; i++) {				System.out.println("PRINT "+ s.charAt(i));				if(i!=n-1) System.out.println("RIGHT");			}		}		else if(k==n) {			for(int i=n-1; i>=0; i--) {				System.out.println("PRINT "+ s.charAt(i));				if(i!=0) System.out.println("LEFT");			}		}		else {			if(k>n/2) {				for(int i=k; i<n; i++ ) 					System.out.println("RIGHT");								for(int i=n-1; i>=0; i--) {					System.out.println("PRINT " + s.charAt(i));					if( i!=0 ) System.out.println("LEFT");				}			}			else {				for(int i=1; i<k; i++ ) 					System.out.println("LEFT");								for(int i=0; i<n; i++) {					System.out.println("PRINT " + s.charAt(i));					if( i!=n-1 ) System.out.println("RIGHT");				}			}		} 			}}
