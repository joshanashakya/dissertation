import java.io.*;import java.util.*;import java.math.*; public class Main{	public static void main(String args[]) throws Exception {		FastScanner fs=new FastScanner();		// int t = fs.nextInt();				// while(t-- > 0){			int r = fs.nextInt();			int c = fs.nextInt();			int count = 0, w=0; 			char pattern[][] = new char[r][c];			for(int i=0;i<r;i++){				pattern[i] = fs.next().toCharArray();			}			boolean valid = true;			for(int i=0;i<r;i++){				for(int j=0;j<c;j++){					if(pattern[i][j] == 'W'){						if(i>0 && pattern[i-1][j] == 'S'){							valid = false;							break;						}						if(i<r-1 && pattern[i+1][j] == 'S'){							valid = false;							break;						}						if(j>0 && pattern[i][j-1] == 'S'){							valid = false;							break;						}						if(j<c-1 && pattern[i][j+1] == 'S'){							valid = false;							break;						}						if(i>0 && pattern[i-1][j] == '.'){							pattern[i-1][j] = 'D';							//count++;						}						if(i<r-1 && pattern[i+1][j] == '.'){							pattern[i+1][j] = 'D';							//count++;						}						if(j>0 && pattern[i][j-1] == '.'){							pattern[i][j-1] = 'D';							//count++;						}						if(j<c-1 && pattern[i][j+1] == '.'){							pattern[i][j+1] = 'D';							//count++;						}					}				}			}			/*if(count != 0 &&*/if(valid){			System.out.println("Yes");			for(int i=0;i<r;i++){				for(int j=0;j<c;j++){					System.out.print(pattern[i][j]);				}				System.out.println();			}}			else System.out.println("No");					// }		fs.close();	}		 	static class FastScanner {		InputStreamReader is;		BufferedReader br;		StringTokenizer st; 		public FastScanner() {			is = new InputStreamReader(System.in);			br = new BufferedReader(is);		} 		String next() throws Exception {			while (st == null || !st.hasMoreElements())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		int nextInt() throws Exception {			return Integer.parseInt(next());		} 		long nextLong() throws Exception {			return Long.parseLong(next());		} 		int[] readArray(int num) throws Exception {			int arr[]=new int[num];			for(int i=0;i<num;i++)				arr[i]=nextInt();			return arr;		} 		String nextLine() throws Exception {			return br.readLine();		} 		void close() throws Exception {			is.close();			br.close();		}	}}