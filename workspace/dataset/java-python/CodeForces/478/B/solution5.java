import java.util.*;import java.lang.*;import java.io.*; 	public class FastIO{					BufferedReader br;		StringTokenizer st;				public FastIO(){ // constructor						br = new BufferedReader(new InputStreamReader(System.in));		}				String next(){						while (st == null || !st.hasMoreElements()){				try{					st = new StringTokenizer(br.readLine());				}								catch (IOException e){					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt(){						return Integer.parseInt(next());		}				long nextLong(){						return Long.parseLong(next());		}				double nextDouble(){			return Double.parseDouble(next());		} 		String nextLine(){						String str = "";			try{								str = br.readLine();			}			catch (IOException e){								e.printStackTrace();			}			return str;		}		public static void main(String[] args){				FastIO io = new FastIO();				// int n = io.nextInt(); -> for int		// double d = io.nextDouble(); -> for double		// String ch = io.next(); -> for one word		// String str = io.nextLine(); -> for the entire line				long n = io.nextInt();		long m = io.nextInt();				long kmax = totalPairs(n - (m - 1));				long kmin = 0;		long num = 1;		long left_player = n - m;				long full_iter = left_player / m;				kmin = m * ((full_iter * (full_iter + 1)) / 2);				kmin += ((left_player % m) * ((left_player / m) + 1));				System.out.println(kmin + " " + kmax);	}		static long totalPairs(long n) {		return ((n - 1) * n) / 2; 	}	}