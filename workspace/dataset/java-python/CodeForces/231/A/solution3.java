import java.util.Scanner; public class Teams { 	public static void main(String[] args) {		int count = 0;		Scanner sc = new Scanner(System.in);		int num = sc.nextInt();				for (int i = 0; i < num; i++) {			int[] knownSolutions = new int[3];			knownSolutions[0] = sc.nextInt();			knownSolutions[1] = sc.nextInt();			knownSolutions[2] = sc.nextInt();						count += solvedProblem(knownSolutions);		}				System.out.println(count);		sc.close();	}		public static int solvedProblem(int[] solution) {		int count = 0;		for (int i = 0; i < solution.length; i++) {			if (solution[i] == 1) {				count++;			}		}				return count >= 2 ? 1 : 0;	}}