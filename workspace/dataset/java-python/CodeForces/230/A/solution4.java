import java.util.*;import java.lang.*;import java.io.*; 	public class FastIO{					BufferedReader br;		StringTokenizer st;				public FastIO(){ // constructor						br = new BufferedReader(new InputStreamReader(System.in));		}				String next(){						while (st == null || !st.hasMoreElements()){				try{					st = new StringTokenizer(br.readLine());				}								catch (IOException e){					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt(){						return Integer.parseInt(next());		}				long nextLong(){						return Long.parseLong(next());		}				double nextDouble(){			return Double.parseDouble(next());		} 		String nextLine(){						String str = "";			try{								str = br.readLine();			}			catch (IOException e){								e.printStackTrace();			}			return str;		}				static int gcd(int a, int b) {						if(b == 0) {				return a;			}						return gcd(b, a % b);		}			public static void main(String[] args) throws IOException {				FastIO io = new FastIO();				// int n = io.nextInt(); -> for int		// double d = io.nextDouble(); -> for double		// String ch = io.next(); -> for one word		// String str = io.nextLine(); -> for the entire line				int s = io.nextInt();		int n = io.nextInt();				int ds_bonus[][] = new int[n][2];		for(int i = 0; i < n; i++) {			ds_bonus[i][0] = io.nextInt();			ds_bonus[i][1] = io.nextInt();		}				Arrays.sort(ds_bonus, (a, b) ->{			return a[0] - b[0];		});				for(int i = 0; i < n; i++) {			if(ds_bonus[i][0] >= s) {				System.out.println("NO");				return;			}			else {				s += ds_bonus[i][1];			}		}		System.out.println("YES");	}}
