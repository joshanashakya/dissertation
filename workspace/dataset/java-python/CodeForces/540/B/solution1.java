import java.util.*; public class CodeForces540B{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int n = input.nextInt(), k = input.nextInt(), p = input.nextInt(),		 x = input.nextInt(), y = input.nextInt(), count_max = 0, sum = 0, median_Ind = (n+1)/2;		int[] a = new int[n];		for(int i = 0;i<k;i++){			a[i] = input.nextInt();			if(a[i] >= y){				count_max++;			}		}		if(median_Ind-count_max > n-k){			System.out.println(-1);			return;		} 		for(int i = k;i<k+median_Ind-count_max;i++){			a[i] = y;		}		for(int i = 0;i<n;i++){			if(a[i] == 0){				a[i] = 1;			}			sum+= a[i];		} 		if(sum > x){			System.out.println(-1);		}		else{			for(int i = k;i<n;i++){				System.out.print(a[i] + " ");			}			System.out.println();		}	}}
