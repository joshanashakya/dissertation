import java.util.Arrays;import java.util.Scanner; public class B901 {		static int[] sum(int[] a, int[] b){		int n = a.length;		int[] c = new int[n];		for(int i = 0; i < n; i++) c[i] = a[i]+b[i];		return c;	}		static int[] timesX(int sgn, int[] a){		int n = a.length;		int[] c = new int[n];		for(int i = 1; i < n; i++) c[i] = sgn*a[i-1];		return c;	}			public static void main(String[] args){		Scanner in = new Scanner(System.in);				int n = in.nextInt();		in.close();				int[] A = new int[n+1];		int[] B = new int[n+1];		A[0] = 1;		int[] C = new int[n+1];		int[] D = new int[n+1];		C[0] = -1;				for(int i = 0; i < n; i++){			int[] temp1 = Arrays.copyOf(A, n+1);			int[] temp2 = Arrays.copyOf(C, n+1);			int sgn1 = 1;			int sgn2 = -1;			for(int j = n; j > 0; j--){				if(A[j-1] != 0 && B[j] != 0){					sgn1 = -A[j-1]*B[j];					break;				}			}			for(int j = n; j > 0; j--){				if(C[j-1] != 0 && D[j] != 0){					sgn2 = -C[j-1]*D[j];					break;				}			}						temp1 = timesX(sgn1, temp1);			temp1 = sum(temp1,B);			temp2 = timesX(sgn2, temp2);			temp2 = sum(temp2,D);						B = A;			A = temp1;						D = C;			C = temp2;		}		if(A[n]*B[n-1] > 0){			System.out.println(n);						for(int i = 0; i <= n; i++){				System.out.print(A[n]*A[i] + " ");			}			System.out.println();			System.out.println(n-1);			for(int i = 0; i < n; i++){				System.out.print(A[n]*B[i] + " ");			}		}else{			System.out.println(n);				for(int i = 0; i <= n; i++){				System.out.print(C[n]*C[i] + " ");			}			System.out.println();			System.out.println(n-1);			for(int i = 0; i < n; i++){				System.out.print(C[n]*D[i] + " ");			}		}				System.out.println();	}}
