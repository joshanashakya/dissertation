import java.util.*;public class Main {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);						int t = sc.nextInt();						 int d=0;		int r,c;				while (d<t){						int n = sc.nextInt();			int m = sc.nextInt();			 r =0 ; c = 0;			 int x [][]=new int [n][m];					for (int i = 0 ; i <n;i++){			for (int j = 0 ; j < m ; j++){		        x[i][j] = sc.nextInt();}}										for (int i = 0 ; i <n;i++){			for (int j = 0 ; j < m ; j++){				if (x[i][j] == 1){ r++;break;}}}									for (int j = 0 ; j <m;j++){			for (int i = 0 ; i <n ; i++){				if (x[i][j] == 1){ c++; break;}}}																	if ((n-r)<(m-c))                         if ((n-r)%2==0)                        	 System.out.println("Vivek");                         else                        	 System.out.println("Ashish");						else						if ((m-c)%2==0)							System.out.println("Vivek");						else				 			System.out.println("Ashish");					                                         d++; }}}