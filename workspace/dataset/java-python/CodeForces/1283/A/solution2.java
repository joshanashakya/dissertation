import java.util.Arrays;import java.util.Scanner; public class NewYear {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int testcases = sc.nextInt();		sc.nextLine(); 		for (int i = 0; i < testcases; i++) {			String array = sc.nextLine();			int[] stream = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();			System.out.println(output(stream));		}	} 	private static int output(int[] stream) {				int out = 0;				int hours = 23 - stream[0];		int minutes = 60 - stream[1];				out += minutes;		out += 60*hours;				return out;		// TODO Auto-generated method stub			} }