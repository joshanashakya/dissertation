import java.util.Scanner; public class Main{	static int i;	static int j;	static int happy = 0;	static int[][] c = new int[105][105] ;	static char[][] a = new char[105][105];	static String b[] = new String[105];	static boolean cheak(int x,int y,int n) {		if(x==i&&y<n) {			return true;		}		else if(y==j&&x<n) {			return true;		}		return false;	}	static void dfs(int x,int y,int n) {		if(cheak(x,y,n)) {			if(a[x][y]=='C'&&c[x][y]==0) {				happy++;			}			dfs(x+1,y,n);			dfs(x,y+1,n);		}	}	public static void main(String[] args) {		Scanner in=new Scanner(System.in);		int count = in.nextInt();		for(i=0;i<count;i++) {			b[i] = in.next();		}		for(i=0;i<count;i++) {			for(j=0;j<count;j++) {				a[i][j] = b[i].charAt(j);			}		}		for(i=0;i<count;i++) {			for(j=0;j<count;j++) {				if(a[i][j]=='C') {					c[i][j]=1;					dfs(i,j,count);					c[i][j]=0;				}			}		}		System.out.println(happy);		in.close();}}
