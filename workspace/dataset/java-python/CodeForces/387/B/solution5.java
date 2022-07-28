import java.util.*;import java.lang.*;import java.io.*; 	public class FastIO{					BufferedReader br;		StringTokenizer st;				public FastIO(){ // constructor						br = new BufferedReader(new InputStreamReader(System.in));		}				String next(){						while (st == null || !st.hasMoreElements()){				try{					st = new StringTokenizer(br.readLine());				}								catch (IOException e){					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt(){						return Integer.parseInt(next());		}				long nextLong(){						return Long.parseLong(next());		}				double nextDouble(){			return Double.parseDouble(next());		} 		String nextLine(){						String str = "";			try{								str = br.readLine();			}			catch (IOException e){								e.printStackTrace();			}			return str;		}		public static void main(String[] args){				FastIO io = new FastIO();				// int n = io.nextInt(); -> for int		// double d = io.nextDouble(); -> for double		// String ch = io.next(); -> for one word		// String str = io.nextLine(); -> for the entire line				int n = io.nextInt(); // min problems for a good round		int m = io.nextInt(); // prob prepared				int reqc[] = new int[n];				for(int i = 0; i < n; i++) {			reqc[i] = io.nextInt();		}				int currc[] = new int[m];				for(int i = 0; i < m; i++) {			currc[i] = io.nextInt();		}				Arrays.sort(reqc);		Arrays.sort(currc);				int count = n;		int idx = 0;				for(int i = 0; i < m; i++) {						for(int j = idx; j < n; j++) {								if(currc[i] >= reqc[j]) {					count--;					idx++;					break;				}			}		}		System.out.println(count);	}}
