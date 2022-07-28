import java.util.Scanner;import java.util.Queue;import java.util.LinkedList; public class Review6new { 	public static void main(String[] args) {		Scanner UserInput = new Scanner(System.in);		int num = UserInput.nextInt();		int size = UserInput.nextInt();		int[] moments = new int[num];		int[] times = new int[num];		for (int i = 0; i < num; i++) {			moments[i] = UserInput.nextInt();			times[i] = UserInput.nextInt();		}		Queue<Long> queries = new LinkedList<>();		long next = 0;		for (int i = 0; i < num; i++) {			while (!queries.isEmpty() && queries.peek() <= moments[i]) {				queries.remove();			}			if (queries.size() <= size) {				next = Math.max(next, (long)moments[i]) + (long)times[i];				System.out.print(next + " ");				queries.add(next);			} else {				System.out.print(-1 + " ");			}		}		UserInput.close();	} }