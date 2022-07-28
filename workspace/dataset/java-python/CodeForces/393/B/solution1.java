import java.util.*;import java.lang.*;import java.io.*; 	public class FastIO{					BufferedReader br;		StringTokenizer st;				public FastIO(){ // constructor						br = new BufferedReader(new InputStreamReader(System.in));		}				String next(){						while (st == null || !st.hasMoreElements()){				try{					st = new StringTokenizer(br.readLine());				}								catch (IOException e){					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt(){						return Integer.parseInt(next());		}				long nextLong(){						return Long.parseLong(next());		}				double nextDouble(){			return Double.parseDouble(next());		} 		String nextLine(){						String str = "";			try{								str = br.readLine();			}			catch (IOException e){								e.printStackTrace();			}			return str;		}				static int gcd(int a, int b) {						if(b == 0) {				return a;			}						return gcd(b, a % b);		}			public static void main(String[] args) throws IOException {				FastIO io = new FastIO();				// int n = io.nextInt(); -> for int		// double d = io.nextDouble(); -> for double		// String ch = io.next(); -> for one word		// String str = io.nextLine(); -> for the entire line				int n = io.nextInt();				double matrix[][] = new double[n][n];				for(int i = 0; i < n; i++) {			for(int j = 0; j < n; j++) {				matrix[i][j] = io.nextDouble();			}		}				double A[][] = new double[n][n];		double B[][] = new double[n][n];				for(int i = 0; i < n; i++) {			A[i][i] = matrix[i][i];		}				for(int i = 0; i < n; i++) {			for(int j = i + 1; j < n; j++) {				A[i][j] = (double)(matrix[i][j] + matrix[j][i]) / 2.0;				A[j][i] = A[i][j];				B[i][j] = (double)matrix[i][j] - A[i][j];				B[j][i] = -B[i][j];			}		}				for(double arr[] : A) {			print1D(arr);		}				for(double arr[] : B) {			print1D(arr);		}		 	}		static void print1D(double arr[] ){				for(int i = 0; i < arr.length; i++) {			System.out.print(arr[i] + " ");		}		System.out.println();	}}
