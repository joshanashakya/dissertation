import java.util.*; public class CodeForces982A{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int n = input.nextInt();		String s = input.next();		int d = -1;		for(int i = 0;i<n;i++){			if(s.charAt(i) == '1'){				if(d == -1){					if(i >= 2){						System.out.println("NO");						return;					}				}				else if(i-d == 1 || i-d > 3){					System.out.println("NO");					return;				}				d = i;			}  		} 		if(n-d > 2 || d == -1){			System.out.println("NO");		}		else{			System.out.println("YES");		}			}}
