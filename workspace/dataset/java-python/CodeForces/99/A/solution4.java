import java.util.*;

public class question {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String s = sc.next();
		
		int j=0;
		while( s.charAt(j)!='.' ) {
			  j++;
		}
		
		if( s.charAt(j-1)=='9' )
			System.out.println("GOTO Vasilisa.");
		else if( s.charAt(j+1) < '5' ) {
			System.out.println( s.substring(0, j) );
		}
		else if( s.charAt(j+1) >= '5' && s.charAt(j-1)=='9') {
			
			System.out.println( "GOTO Vasilisa." );
		}
		else if( s.charAt(j+1) >= '5' )	{
			System.out.print( s.substring(0, j-1) );
			int val = Character.getNumericValue( s.charAt(j-1) ) ;
			System.out.print(val + 1);
		}
		
		
	}
}		
	
