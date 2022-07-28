import java.io.*;import java.util.*;import java.text.*;import java.math.*; public class MyClass {    public static void main(String args[]) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringBuilder sb = new StringBuilder();        StringTokenizer st = new StringTokenizer(br.readLine());        int m = Integer.parseInt(st.nextToken());        int n = Integer.parseInt(st.nextToken());        int [][]ar = new int[m][n];        for(int i = 0; i < m; i++){            st = new StringTokenizer(br.readLine());            for(int j = 0; j < n; j++){                ar[i][j] = Integer.parseInt(st.nextToken());            }        }        // 0 1 0   0 0 0        // 1 1 1   0 0 0        int A[][] = new int[m][n];        boolean flag = true;        for(int i = 0; i < m; i++){            for(int j = 0; j < n; j++){                if(ar[i][j] == 1 && check(ar, i, j, 1))                    A[i][j] = 1;                else if(ar[i][j] == 0 && !check(A, i, j, 0)){                    flag = false;                    break;                }            }        }        int temp[][] = new int[m][n];        for(int i = 0; i < m; i++){            for(int j = 0; j < n; j++){                if(A[i][j] == 1){                    fill(temp, i, j, 1);                }            }        }        // print(temp, m, n);        // print(ar, m, n);        // System.out.println(Arrays.deepEquals(temp, ar));        if(!Arrays.deepEquals(temp, ar))            flag = false;        // print(A, m, n);        if(!flag)            System.out.println("NO");        else{            System.out.println("YES");            print(A, m, n);        }    }    public static void fill(int ar[][], int row, int col, int k){        for(int i = 0; i < ar[0].length; i++){            ar[row][i] = k;        }        for(int i = 0; i < ar.length; i++){            ar[i][col] = k;        }            }    public static void print(int A[][], int m, int n){        for(int i = 0; i < m; i++){            for(int j = 0; j < n; j++){                System.out.print(A[i][j] + " ");            }            System.out.println();        }    }    public static boolean check(int ar[][], int row, int col, int k){        for(int i = 0; i < ar[0].length; i++){            if(ar[row][i] != k)                return false;        }        for(int i = 0; i < ar.length; i++){            if(ar[i][col] != k)                return false;        }        return true;    }}