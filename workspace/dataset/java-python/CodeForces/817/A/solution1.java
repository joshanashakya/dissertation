import java.util.*; public class CodeForces817A{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int x1 = input.nextInt();		int y1 = input.nextInt();		int x2 = input.nextInt();		int y2 = input.nextInt();		int x = input.nextInt();		int y = input.nextInt();		if((x2-x1)%x == 0 && (y2-y1)%y == 0 &&( ((x2-x1)/x)%2==((y2-y1)/y)%2 || ((x2-x1)/x)%2==-((y2-y1)/y)%2 )){           System.out.println("YES"); 		}		else{			System.out.println("NO");		}	}}
