import java.util.*; public class LittlePigsAndWolves_B { 	public static boolean isValid(int n, int m, int x, int y) {		if(x>=0 && x<=n-1 && y>=0 && y<=m-1) {			return true;		}		return false;			}		public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int m = sc.nextInt();	    char a[][] = new char[n][m];		for(int i = 0; i<n; i++) {			String s = sc.next();			for(int j = 0; j<m; j++) {				a[i][j] = s.charAt(j);			}		}//		for(int i = 0; i<n; i++) {//			for(int j = 0; j<m; j++) {//				System.out.print(a[i][j]+" ");//			}//			System.out.println();//		}		int ans = 0;		for(int i = 0; i<n; i++) {			for(int j = 0; j<m; j++) {				if(a[i][j]!='W') {//					System.out.println(i+" "+j);					continue;				}				if(isValid(n,m,i,j-1)) {//					System.out.println("pic");					if(a[i][j-1]=='P') {						ans++;						a[i][j-1] = 'p';						continue;					}				}				if(isValid(n,m,i-1,j)) {					if(a[i-1][j]=='P') {						ans++;						a[i-1][j] = 'p';						continue;					}				}				if(isValid(n,m,i,j+1)) {//					System.out.println("jkjbk");					if(a[i][j+1]=='P') {						ans++;						a[i][j+1] = 'p';						continue;					}				}				if(isValid(n,m,i+1,j)) {					if(a[i+1][j]=='P') {						ans++;						a[i+1][j] = 'p';						continue;					}				}											}		}				System.out.println(ans);		 	} }