import java.util.*;public class Main{ 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);int i=0;int j=0;		int t = sc.nextInt();		for(int f= 0; f< t; f++) { 		int n = sc.nextInt();		int m = sc.nextInt();		int count = 0;		int [] row = new int [n];		int [] column = new int [m];		for(  i = 0; i<n; i++) {			for( j = 0; j<m; j++) {				int current = sc.nextInt();				if(current == 1) {					row[i] = 1;					column[j] = 1;				}			}		}		for( i= 0; i<n; i++) {			for(j= 0; j<m; j++) {				if(row[i] ==0 && column[j] ==0) {					count++;					row[i] = 1;					column[j]= 1;				}			}		}		if(count%2==0) {			System.out.println("Vivek");		}		else {			System.out.println("Ashish");		} 		count= 0;		} sc.close();	} }
