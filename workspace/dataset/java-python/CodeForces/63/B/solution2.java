import java.util.*;import java.lang.*;import java.io.*; 	public class FastIO{					BufferedReader br;		StringTokenizer st;				public FastIO(){ // constructor						br = new BufferedReader(new InputStreamReader(System.in));		}				String next(){						while (st == null || !st.hasMoreElements()){				try{					st = new StringTokenizer(br.readLine());				}								catch (IOException e){					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt(){						return Integer.parseInt(next());		}				long nextLong(){						return Long.parseLong(next());		}				double nextDouble(){			return Double.parseDouble(next());		} 		String nextLine(){						String str = "";			try{								str = br.readLine();			}			catch (IOException e){								e.printStackTrace();			}			return str;		}				static int gcd(int a, int b) {						if(b == 0) {				return a;			}						return gcd(b, a % b);		}			public static void main(String[] args) throws IOException {				FastIO io = new FastIO();				// int n = io.nextInt(); -> for int		// double d = io.nextDouble(); -> for double		// String ch = io.next(); -> for one word		// String str = io.nextLine(); -> for the entire line				int n = io.nextInt();		int k = io.nextInt();				int count_person[] = new int[k + 1];				for(int i = 0; i < n; i++) {			int rank = io.nextInt();			count_person[rank]++;		}				int count = 0;		while(count_person[k] != n) {						for(int i = k - 1; i >= 0; i--) {								if(count_person[i] > 0) {										count_person[i]--;					count_person[i + 1]++;				}			}			count++;		}				System.out.println(count); 	}}