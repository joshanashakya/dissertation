import java.io.*;import java.util.*; public class MikeandShortcuts { 	public static void main(String args[]) throws Exception {		Scanner cin = new Scanner(System.in);		int N = cin.nextInt();		int a[] = new int[N];		for (int i = 0; i < N; i++) {			a[i] = cin.nextInt();		}		Queue<Integer> queue = new LinkedList<Integer>();		int[] dis = new int[N];		boolean[] visited = new boolean[N]; 		for (int i = 0; i < N; i++) {			dis[i] = -1;			visited[0] = false;		}		visited[0] = true;		dis[0] = 0;		queue.add(0); 		while (!queue.isEmpty()) {			int e = queue.poll();			int ahead = e + 1, back = e - 1;			if (ahead >= 0 && ahead < N && !visited[ahead]) {				queue.add(ahead);				visited[ahead] = true;				dis[ahead] = dis[e] + 1;			}						if (back >= 0 && back < N && !visited[back]) {				if (back >= 0 && back < N && !visited[back]) {					queue.add(back);					visited[back] = true;					dis[back] = dis[e] + 1;				}			}						int target = a[e]-1;			if (!visited[target]) {				if (!visited[target]) {					queue.add(target);					visited[target] = true;					dis[target] = dis[e] + 1;				}			}					} 		for (int i = 0; i < N; i++) {			if (i == N)				System.out.println(dis[i]);			System.out.print(dis[i] + " ");		} 	} }  	 	 	 	 	  	      	 		 	  	