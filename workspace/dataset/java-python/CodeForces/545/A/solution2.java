import java.util.*;import java.util.regex.*; public class Solution {	    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);		int n = scan.nextInt();		int[][] a = new int[n][n];		int res = 0;		StringBuilder nums = new StringBuilder();		for(int i = 0; i < n; i++) {			boolean good = true;			for(int j = 0;j < n; j++) {				a[i][j] = scan.nextInt();				if(a[i][j] == 1 || a[i][j] == 3) {					good = false;				}			}			if(good) {				nums.append((i+1) + " ");				res++;			}		}		System.out.println(res);		System.out.println(nums);    }		}