//I AM THE CREED/* //I AM THE CREED/* package codechef; // don't place package name! */import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer; import java.util.*;import java.awt.Point;public class Main{    public static void main(String[] args) throws IOException     {         Scanner input=new Scanner(System.in);        while(input.hasNext()){            int n=input.nextInt();            int m=input.nextInt();            ArrayList<ArrayList<Integer>> railway=new ArrayList<>();            for(int i=0;i<=n;i++){                railway.add(new ArrayList<>());            }            for(int i=0;i<m;i++){                int u=input.nextInt();                int v=input.nextInt();                railway.get(u).add(v);                railway.get(v).add(u);            }            ArrayList<ArrayList<Integer>> road=new ArrayList<>();            for(int i=0;i<=n;i++){                road.add(new ArrayList<>());            }            for(int i=1;i<=n;i++){                for(int j=i;j<=n;j++){                    if(railway.get(i).contains(j)==false){                        road.get(i).add(j);                        road.get(j).add(i);                    }                }            }            if(road.get(1).contains(n)){                int cost=bfs(railway);                System.out.println(cost);            }            else{                int cost=bfs(road);                System.out.println(cost);            }        }    }    //very stupid mistake, did a dfs for the shortest path    static int bfs(ArrayList<ArrayList<Integer>> g){        Queue<Integer> q=new LinkedList<>();        q.add(1);        HashSet<Integer> visited=new HashSet<>();        int steps=0;        visited.add(1);        while(!q.isEmpty()){            int size=q.size();            while(size!=0){                int curr=q.poll();                if(curr==g.size()-1){                    return steps;                }                for(int children:g.get(curr)){                    if(visited.contains(children)){                        continue;                    }                    q.add(children);                    visited.add(children);                }                size--;            }            steps++;        }        return -1;    }            //Credits to SecondThread(https://codeforces.com/profile/SecondThread) for this tempelate    static void ruffle_sort(int[] a) {		// shandom_ruffle		Random r=new Random();		int n=a.length;		for (int i=0; i<n; i++) {			int oi=r.nextInt(i);			int temp=a[i];			a[i]=a[oi];			a[oi]=temp;		} 		// sort		Arrays.sort(a);	}    //Credits to SecondThread(https://codeforces.com/profile/SecondThread) for this tempelate.    static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}				int nextInt() {			return Integer.parseInt(next());		}		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}		long nextLong() {			return Long.parseLong(next());		}	}        }