import java.util.Scanner; public class _0675ApplemanandEasyTask { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n=sc.nextInt();		sc.nextLine();		char[][] arr = new char[n][n];		for(int i=0;i<n;i++) {			String temp=sc.nextLine();			for(int j=0;j<n;j++) {				arr[i][j]=temp.charAt(j);			}		}		boolean flag=true;		for(int i=0;i<n;i++) {			int count=0;			for(int j=0;j<n;j++) {				count=0;			if( i-1>=0 && arr[(i-1)][j]=='o') {				count++;			}			if(i+1<n && arr[i+1][j]=='o') {				count++;			}			if(j+1<n && arr[i][j+1]=='o') {				count++;			}			if(j-1>=0 && arr[i][j-1]=='o') {				count++;			}			if(count%2!=0) {				flag=false;				break;			}			}					}		if(flag) {			System.out.println("YES");		}		else {			System.out.println("NO"); 		}	} }