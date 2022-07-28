import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class RougeClock {		public static void main(String[] args) throws IOException{		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		String[] buf = br.readLine().split(" ");				long n = Long.parseLong(buf[0]);		long m = Long.parseLong(buf[1]);				int size_h = 1;		int size_m = 1;		for (int degree = 7; degree<n; degree*=7)			size_h++;		for (int degree = 7; degree<m; degree*=7)			size_m++;				int ans = 0;		if(size_h+size_m<=7){			for(int i =0;i<n;i++){				for(int j =0;j<m;j++){					int[] used = new int[7];					for(int a=i, k = 0; k<size_h; a/=7, ++k)						used[a%7]+=1;					for(int a=j, k = 0; k<size_m; a/=7, ++k)						used[a%7]+=1;					if (max(used)<=1)						ans++;				}			}		}else{			if(size_h<=6){				for(int i =0;i<n;i++){					int[] used = new int[6];					for(int a=i, k = 0; k<=size_h; a/=7, k++){						if(a%7==0) 							used[0]=2;						else{							used[a%7-1]+=1;						}					}					if (max(used)<=1)						ans++;				}			}			if(size_m<=6){				for(int i =0;i<m;i++){					int[] used = new int[6];					for(int a=i, k = 0; k<=size_h; a/=7, k++){						if(a%7==0) 							used[0]=2;						else							used[a%7-1]+=1;					}					if (max(used)<=1)						ans++;				}			}		}				System.out.println(ans);	} 	private static int max(int[] used) {		int max =0;		for(int i =0; i<used.length;i++){			if(used[i]>max){				max = used[i];			}		}		return max;	}}