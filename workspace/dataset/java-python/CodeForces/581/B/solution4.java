import java.util.Scanner; public class Codeforces581BLuxeryHouse { 	public static void main(String[] args) {		int a, b, sum = 0;		Scanner scanner = new Scanner(System.in);		a = scanner.nextInt();		int[] arr = new int[a];		for (int i = 0; i < a; i++) {			arr[i] = scanner.nextInt();		}		int[] answer = new int[a];		answer[a - 1] = 0;		for (int i = a - 2; i >= 0; i--) {			if (arr[i + 1] >= arr[i]) {				answer[i] = arr[i + 1] - arr[i] + 1;				arr[i] = arr[i] + arr[i + 1] - arr[i];			} 			else				answer[i] = 0; 		}		for (int j : answer) {				System.out.print(j + " ");		}	} }
