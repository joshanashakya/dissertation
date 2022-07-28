import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int t = userInput.nextInt();
		for (int i = 0; i < t; i++) {
			int n = userInput.nextInt();
			long k = userInput.nextLong();
			int[] list = new int[n];
			for (int j = 0; j < n; j++) {
				list[j] = userInput.nextInt();
			}
			list = transform(list);
			if (k%2==0)
				list = transform(list);
			for (int j : list) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	
	static int[] transform(int[] list) {
		int d = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i] > d)
				d = list[i];
		}
		for (int i = 0; i < list.length; i++) {
			list[i] = d - list[i];
		}
		return list;
	}

}

