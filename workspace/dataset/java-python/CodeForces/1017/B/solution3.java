import java.util.*; public class CodeForces1017B{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int n = input.nextInt();		String a = input.next();		String b = input.next();		int[] sum = new int[2];		for(int i = 0;i<n;i++){				sum[a.charAt(i) - '0']++;		} 		long count = 0;		long one = 0;		long zero = 0;		for(int i = 0;i<n;i++){			if(b.charAt(i) == '0'){				if(a.charAt(i) == '0'){					count+= sum[1]-one;					zero++;				}				else{					count+= sum[0]-zero;					one++;				}			}		}		System.out.println(count); 	}}
