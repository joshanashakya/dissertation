import java.util.*; public class CodeForces710A{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		String s = input.next();		int x = s.charAt(0)-'a';		int y = Integer.parseInt(s.charAt(1)+"");		boolean bool = false;		boolean bool2 = false; 		if(x == 0 || x == 7){			bool = true;		}		if(y == 1 || y == 8){			bool2 = true;		} 		if(bool && bool2){			System.out.println(3);		}		else if(bool || bool2){			System.out.println(5);		}		else{			System.out.println(8);		}	}}