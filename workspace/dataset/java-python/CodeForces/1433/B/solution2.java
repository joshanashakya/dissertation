import java.util.Arrays;import java.util.Scanner; public class Bookshelf {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int testcases = sc.nextInt();		sc.nextLine(); 		for (int i = 0; i < testcases; i++) {			int n = sc.nextInt();			sc.nextLine();			String array = sc.nextLine();			int[] stream = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();			output(n, stream);		}	} 	private static void output(int n, int[] stream) {				int first = -1;				for (int i = 0; i < n; i++) {			if (stream[i] == 1) {				first = i;				i = n;			}		}				int last = -1;				for (int i = n-1; i >= 0; i--) {			if (stream[i] == 1) {				last = i;				i = 0;			}		}				int count = 0;				if (first == last) {			count = 0;		}		else {			for (int i = first; i < last; i++)				if (stream[i] == 0)					count++;		}				System.out.println(count);			}}
