import java.util.*;import java.io.*; public class one { 	public static void main(String[] args) throws IOException, FileNotFoundException {		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		//BufferedReader in = new BufferedReader(new FileReader("one")); 		char[] arr = in.readLine().toCharArray();				int[][] g = new int[1000][1000];		int n = arr.length;		int m = g.length;		for (int i=0; i<m; i++) {			Arrays.fill(g[i], -1);		}		g[500][500] = 0;		int x=500;		int y = 500;		int t=1;		for (int i=0; i<n; i++) {			if (arr[i] == 'L') x--;			else if (arr[i] == 'R') x++;			else if (arr[i] == 'U') y++;			else y--;						if (g[x][y] != -1) {				System.out.println("BUG");				return;			}			g[x][y] = t;			t++;					}				for (int i=0; i<m; i++) {			for (int j=0; j<m; j++) {				if (g[i][j] == -1) continue;				if (i - 1 >= 0 && g[i-1][j] != -1 && Math.abs(g[i-1][j] - g[i][j]) != 1) {					System.out.println("BUG");					return;				}				if (i + 1 <m && g[i+1][j] != -1 && Math.abs(g[i+1][j] - g[i][j]) != 1) {					System.out.println("BUG");					return;				}				if (j - 1 >= 0 && g[i][j-1] != -1 && Math.abs(g[i][j-1] - g[i][j]) != 1) {					System.out.println("BUG");					return;				}				if (j + 1 <m && g[i][j+1] != -1 && Math.abs(g[i][j+1] - g[i][j]) != 1) {					System.out.println("BUG");					return;				}			}		}				System.out.println("OK");			} }  /*	HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();int n = arr.length;int x=0;int y=0;g.put(0, new ArrayList<>());g.get(0).add(0);for (int i=0; i<n; i++) {	if (arr[i] == 'L') x--;	else if (arr[i] == 'R') x++;	else if (arr[i] == 'U') y++;	else y--;	if (!g.containsKey(x)) g.put(x, new ArrayList<>());		// check	for (int j=0; j<g.get(x).size(); j++) {		if (g.get(x).get(j) == y) {			System.out.println("BUG");			return;		}	}		g.get(x).add(y);	} System.out.println("OK");*/