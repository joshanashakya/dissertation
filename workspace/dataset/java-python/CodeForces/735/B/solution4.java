import java.util.Arrays;import java.util.Scanner; public class B735 {	public static void main(String[] args) {		Scanner scanner = new Scanner(System.in);		int length = scanner.nextInt();		int city1 = scanner.nextInt();		int city2 = scanner.nextInt();		int[] people = new int[length];		for(int i = 0; i < length; i++)			people[i] = scanner.nextInt();		Arrays.sort(people);		long sum1 = 0;		long sum2 = 0;		for(int i = length - 1; i >= length - Math.min(city1, city2); i--) 			sum1 += people[i];		for(int i = length - Math.min(city1, city2) - 1; i >= length - city1 - city2; i--) 			sum2 += people[i];		double answer = 1d * sum2 / Math.max(city1, city2) + 1d * sum1 / Math.min(city1, city2);		System.out.print(answer);	}}