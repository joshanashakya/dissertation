import java.util.*; public class CodeForces992B{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int l = input.nextInt();		int r = input.nextInt();		int x = input.nextInt();		int y = input.nextInt();		/*if(y/x < l || y/x > r){			System.out.println(0);		}		else{			int count = 0;			int k = (int)Math.sqrt(y/x);			int n = y/x;			int m = y/x;			for(int i = 1;i<=k;i++){				if(n%i == 0){					while(n%i == 0 && i != 1){						n/= i;						//System.out.println(n);					}					int a = x*m/n;					int b = x*n;					if(a >= l && a <= r && b >= l && b <= r){						count+= 2;					}				}			}			//System.out.println(m);			System.out.println(count);		}*/  		if(y%x != 0){			System.out.println(0);		}		else{			int ans = 0;			int n = y/x;			for(int d = 1;d*d<= n;d++){				if(n%d == 0){					int c = n/d;					if(l <= c*x && c*x <= r && l <= d*x && d*x <= r && gcd(c,d) == 1){						if(d*d == n){							ans++;						}						else{							ans+= 2;						}					}				}			} 			System.out.println(ans);		}	} 	public static int gcd(int a, int b){		while(b > 0){			int t = a%b;			a = b;			b = t;		}		return a;	}}
