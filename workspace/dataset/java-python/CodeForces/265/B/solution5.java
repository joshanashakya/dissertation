import java.util.*;import java.lang.*;import java.io.*; 	public class FastIO{					BufferedReader br;		StringTokenizer st;				public FastIO(){ // constructor						br = new BufferedReader(new InputStreamReader(System.in));		}				String next(){						while (st == null || !st.hasMoreElements()){				try{					st = new StringTokenizer(br.readLine());				}								catch (IOException e){					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt(){						return Integer.parseInt(next());		}				long nextLong(){						return Long.parseLong(next());		}				double nextDouble(){			return Double.parseDouble(next());		} 		String nextLine(){						String str = "";			try{								str = br.readLine();			}			catch (IOException e){								e.printStackTrace();			}			return str;		}		public static void main(String[] args){				FastIO io = new FastIO();				// int n = io.nextInt(); -> for int		// double d = io.nextDouble(); -> for double		// String ch = io.next(); -> for one word		// String str = io.nextLine(); -> for the entire line				int n = io.nextInt();				int h[] = new int[n];		for(int i = 0; i < n; i++) {			h[i] = io.nextInt();		}				int min_oper = h[0] + 1;				for(int i = 1; i < n; i++) {						if(h[i - 1] > h[i]) {				min_oper += h[i - 1] - h[i] + 1 + 1;			}			else {				min_oper += 1 + h[i] - h[i - 1] + 1;			}		}		System.out.println(min_oper);	}}