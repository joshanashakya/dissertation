import java.util.Scanner; public class A {	public static void main(String[] args) {		try (Scanner scan = new Scanner(System.in)) {			int n = scan.nextInt();			int m = scan.nextInt();			scan.nextLine();			boolean[][] grid = new boolean[n][m];			int minJ = m, maxJ = -1, minI = n, maxI = -1;			for (int i = 0; i < n; i++) {				String line = scan.nextLine();				for (int j = 0; j < m; j++) {					grid[i][j] = line.charAt(j) == '*';					if (grid[i][j]) {						minJ = Math.min(j, minJ);						maxJ = Math.max(j, maxJ);						minI = Math.min(i, minI);						maxI = Math.max(i, maxI);					}				}			}			for (int i = minI; i <= maxI; i++) {				for (int j = minJ; j <= maxJ; j++)					System.out.print(grid[i][j] ? '*' : '.');				System.out.println();			}		}	}} 