//package test; import java.util.Scanner; public class starter {				public static void main ( String args[] )			throws Exception 		{			Scanner conio = new Scanner ( System.in ) ;						String line = conio.nextLine() ;			String test = "CODEFORCES" ;						boolean found = false; 						int index = 0 ;			int i = 0 ;						for ( i = 0 ; i < line.length() && index < test.length() ; ++i )			{				if ( test.charAt(index) == line.charAt(i) )					++index ;				else if ( index > 0 )				{					String second = test.substring(index) ;					if ( line.lastIndexOf(second) > i  &&line.lastIndexOf(second) == (line.length() - second.length()) )					{						found = true ;						break ; 					}					else						break ;  				}			}						// search for second part							if ( index == test.length() && (line.indexOf(test) == 0 || line.indexOf(test) ==  ( line.length() - test.length()) ))					found = true ; 							System.out.println( found ? "YES" : "NO" ) ; 														conio.close(); 		}}
