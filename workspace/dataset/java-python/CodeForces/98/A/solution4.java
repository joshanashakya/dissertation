import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A {
	static String RAINBOW = "ROYGBV";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int[] options = new int[s.length()];
		int[] freqs = new int[6];
		for (int i = 0; i < s.length(); i++)
			freqs[RAINBOW.indexOf(s.charAt(i))]++;
		ans = new ArrayList<>();
		build(0, freqs, new int[6]);
		//check(new int[] {1,2,3,4,5,6}, new int[6]);

		System.out.println(ans.size());
	}

	public static void build(int idx, int[] freqs, int[] arr) {
		if (idx == 6) {
			int[] cl = arr.clone();
			for (int[] a : ans) {
				if (check(a, cl))
					return;
			}
			ans.add(cl);
			return;
		}
		for (int i = 0; i < 6; i++) {
			if (freqs[i] > 0) {
				freqs[i]--;
				arr[idx] = i;
				build(idx + 1, freqs, arr);
				freqs[i]++;
			}
		}
	}

	static ArrayList<int[]> ans;

	// top front left back right bot
	public static int[] turn(int[] arr) {
		return new int[] { arr[0], arr[4], arr[1], arr[2], arr[3], arr[5] };
	}

	public static int[] spinUp(int[] arr) {
		return new int[] { arr[1], arr[5], arr[2], arr[0], arr[4], arr[3] };
	}

	public static boolean check(int[] arr1, int[] arr2) {
		int[] original = arr1;
		for (int i = 0; i < 4; i++) {

			for (int k = 0; k < 4; k++) {
				if (equal(arr1, arr2))
					return true;
				//System.out.println(Arrays.toString(arr1));
				arr1 = turn(arr1);
			}
			arr1 = spinUp(original);
			
			for (int k = 0; k < 4; k++) {
				if (equal(arr1, arr2))
					return true;
				//System.out.println(Arrays.toString(arr1));
				arr1 = turn(arr1);
			}
			original = turn(original);
		}
		arr1 = spinUp(spinUp(original));
		for (int k = 0; k < 4; k++) {
			arr1 = turn(arr1);
			//System.out.println(Arrays.toString(arr1));
			if (equal(arr1, arr2))
				return true;
		}
		return false;
	}

	static boolean equal(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;
		return true;
	}
}

