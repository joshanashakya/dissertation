import java.util.Scanner; public class Main { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		if(n==1) {			System.out.println(1);			return;		}		long[][] arr = new long[n][n];		int x = 0, y = 0;		long sum = 0, min = Long.MAX_VALUE, max = Long.MIN_VALUE;		for (int i = 0; i < n; i++) {			sum = 0;			for (int j = 0; j < n; j++) {				arr[i][j] = sc.nextLong();				sum += arr[i][j];				if (arr[i][j] == 0) {					x = i;					y = j;				}			}			max = sum > max ? sum : max;			min = sum < min ? sum : min;		}		long ans = max - min;		if (ans <= 0) {			System.out.println(-1);			return;		}		arr[x][y] = ans;		if(validateMagicSq(arr))			System.out.println(ans);		else			System.out.println(-1);	} 	static boolean validateMagicSq(long arr[][]) {		long sum = 0;		int n = arr.length;		for (int i = 0; i < n; i++)			sum += arr[i][i];		long sum2 = 0;		for (int i = 0; i < n; i++)			sum2 = sum2 + arr[i][n - 1 - i];		if (sum != sum2)			return false;		for (int i = 0; i < n; i++) {			long rowSum = 0;			for (int j = 0; j < arr[i].length; j++)				rowSum += arr[i][j];			if (sum != rowSum)				return false;		}		for (int i = 0; i < n; i++) {			long colSum = 0;			for (int j = 0; j < arr[i].length; j++)				colSum += arr[j][i];			if (sum != colSum)				return false;		} 		return true;	}}