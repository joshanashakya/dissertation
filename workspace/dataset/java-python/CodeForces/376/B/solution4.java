import java.util.Arrays;import java.util.Scanner; public class practice {	public static void main(String[] args) {				Scanner input = new Scanner(System.in);		int n = input.nextInt();		int m = input.nextInt();		int []arr = new int[n];				for (int i = 0; i < m; i++)		{			int from = input.nextInt() - 1;			int to = input.nextInt() - 1;			int value = input.nextInt();						arr[from] += value;			arr[to] -= value;		}				Arrays.sort(arr);		int total = 0;				for (int i = 0; i < n; i++)		{			if (arr[i] > 0)				break;			total += arr[i];		}		System.out.println(Math.abs(total));	} }
