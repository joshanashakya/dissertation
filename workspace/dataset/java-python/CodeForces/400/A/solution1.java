//amir;import java.util.*;	import java.io.*; public class ex8 {	public static void main (String []args) throws IOException 	{		Scanner sc = new Scanner (System.in);		int n = sc.nextInt();		sc.nextLine();		int count = 0;		int flag = 0;				String s [] = new String [n];		for (int i = 0; i < n; i++) {			s[i] = " "+ sc.nextLine();		}		for (int i = 0; i < n; i++) {			String res = "";			count = 0;			for (int q = 1; q <= 12; q++){				if (s[i].charAt(q) == 'X'){					res = " 1x12";					count ++;					break;				}			}			for (int j = 2; j <= 6; j++) {				flag = 0;				if( 12 % j == 0) {					for (int k = 1; k <= 12/j ; k++) {						flag = 0;						for (int p = k; p <= 12; p += 12/j){							if (s[i].charAt(p) == 'O') {								flag = 1; break;							}							} 						if (flag == 0) {							count ++;							res += " "+j+"x"+12/j;							break;						}					}				}			}			flag = 0;			for (int l = 1; l <= 12; l++){				if (s[i].charAt(l) == 'O'){					flag = 1; break;				}			}			if (flag == 0) {				res += " 12x1";				count ++;			}			System.out.printf("%d%s", count, res);			System.out.println();					}		 			}}