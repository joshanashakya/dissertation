import java.util.*; public class PetyaAndStaircases_B { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc =  new Scanner(System.in);		int n = sc.nextInt();		int m = sc.nextInt();		int arr[] = new int[m];		for(int i = 0; i<m; i++) {			arr[i] = sc.nextInt();		}		Arrays.sort(arr);		boolean check = true;				if(m==0) {			check = true;		}		else if(arr[0]==1 || arr[m-1]==n) {			check = false;		}		else {			for(int i = 2; i<m; i++) {				if(arr[i]-arr[i-2]==2) {					check = false;					break;				}			}			}		if(check) {			System.out.println("YES");		}		else {			System.out.println("NO");		}		 	} }
