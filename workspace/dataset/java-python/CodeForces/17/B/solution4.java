import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer; public class CF0017B_Hierarchy {	static class Scanner {		BufferedReader br;		StringTokenizer st; 		public Scanner() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	static class Employee {		int id;		int qual;		ArrayList<Employee> manager;		ArrayList<Integer> cost; 		public Employee(int id, int qual) {			this.id = id;			this.qual = qual;			manager = new ArrayList<>();			cost = new ArrayList<>();		} //		@Override//		public int compareTo(Employee o) {//			return qual - o.qual;//		} 	} 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner scanner = new Scanner();		int n = scanner.nextInt();		Employee[] emps = new Employee[n];		for (int i = 0; i < n; i++) {			emps[i] = new Employee(i, scanner.nextInt());		}		int q = scanner.nextInt();		for (int i = 0; i < q; i++) {			int a = scanner.nextInt() - 1;			int b = scanner.nextInt() - 1;			int cost = scanner.nextInt();			emps[b].manager.add(emps[a]);			emps[b].cost.add(cost);		}		int cost = 0;		boolean[] visited = new boolean[n];			Employee ae = new Employee(-1, -1);		for (int i = 0; i < n; i++) {			if (!visited[i]) {				if (emps[i].qual > ae.qual)					ae = emps[i];			}		}		visited[ae.id] = true;								for (int f = 1; f < n; f++) {			Employee e = new Employee(-1, -1);			for (int i = 0; i < n; i++) {				if (!visited[i]) {					if (emps[i].qual > e.qual)						e = emps[i];				}			}			visited[e.id] = true;			if (e.manager.size() == 0) {				System.out.println(-1);				return;			}			int localCost = Integer.MAX_VALUE;			for (int i = 0; i < e.cost.size(); i++) {				localCost = Math.min(localCost, e.cost.get(i));			}			cost+=localCost;		}		System.out.println(cost);	} }
