 import java.util.Scanner; public class Main {    static int m;    static int n;    static int sx[]= {1,-1,0,0,-1,-1,1,1};    static int sy[]= {0,0,1,-1,-1,1,1,-1};    static char map[][];    static char now[][];	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=new Scanner (System.in);		m=sc.nextInt();		n=sc.nextInt();		map=new char[m][n];		now=new char[m][n];		sc.nextLine();		for (int i = 0; i < m; i++) {			map[i]=sc.nextLine().toCharArray();		}		for (int i = 0; i < m; i++) {			for (int j = 0; j < n; j++) {				now[i][j]='.';			}		}		for (int i = 0; i < m; i++) {			for (int j = 0; j < n; j++) {				if(check(i,j)) {					for (int j2 = 0; j2 < 8; j2++) {						now[sx[j2]+i][sy[j2]+j]='#';					}				}			}		}		for (int i = 0; i < m; i++) {			for (int j = 0; j < n; j++) {				if(map[i][j]!=now[i][j]) {					System.out.println("NO");					return;				}			}		}		System.out.println("YES");		 	}	static boolean check(int x,int y) {		if(x<1||y<1||x>m-2||y>n-2) {			return false;		}		for (int i = 0; i < 8; i++) {			if(map[x+sx[i]][y+sy[i]]=='.') {				return false;			}		}		return true;	} }
