import java.math.BigInteger;import java.text.DecimalFormat;import java.util.ArrayList;import java.util.Arrays;import java.util.HashSet;import java.util.Scanner;  @SuppressWarnings("unused")public class B {		public  static  Scanner scan = new Scanner(System.in);		public static void solve () {		int n=scan.nextInt();		int[][] a= new int[1005][1005];		int cnt=0;		for(int i=0;i<1000;i++) {			for(int j=0;j<1000;j++){				a[i][j]=0;			}		}		for(int k=0;k<n;k++) {			int x1=scan.nextInt();			int y1=scan.nextInt();			int x2=scan.nextInt();			int y2=scan.nextInt();			for(int i=x1;i<=x2;i++) {				for(int j=y1;j<=y2;j++){					a[i][j]++;				}			}		}		for(int i=0;i<=100;i++) {			for(int j=0;j<=100;j++) {				cnt+=a[i][j];			}		}		System.out.println(cnt);	}	public static void main(String[] args) {					solve();		scan.close(); 	}  }