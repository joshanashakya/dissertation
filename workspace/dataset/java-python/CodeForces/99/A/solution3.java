import java.util.*;
public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		boolean  bad=false;
		int k =0;
		int p=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') {
				
				if(s.charAt(i-1)=='9') {
					System.out.println("GOTO Vasilisa.");
					
				}else if(s.charAt(i+1)>='5') {
					bad= true;
				p=Character.getNumericValue((s.charAt(i-1)));
                     p++;
				
					System.out.print(s.substring(0,i-1));
					System.out.print(p);
				}else  {
					k=i;
					System.out.println(s.substring(0,k));
					
				}
			}
		}
		
		}
	
}

