import java.io.File;import java.util.Arrays;import java.util.HashSet;import java.util.Scanner;import java.util.StringTokenizer; public class p015 {	public static void main(String args[]) throws Exception {		StringTokenizer stok = new StringTokenizer(new Scanner(System.in).useDelimiter("\\A").next());		StringBuilder sb = new StringBuilder();		int n = Integer.parseInt(stok.nextToken());		int I = (Integer.parseInt(stok.nextToken())*8)/n;		Integer[] a = new Integer[n];		for (int i = 0; i < n; i++) {			a[i] = Integer.parseInt(stok.nextToken());		}		Arrays.sort(a);		int[] b = new int[n];		int cnt=0;		int i=0;		while(i<n) {			b[i]=cnt;			while(++i<n&&a[i].intValue()==a[i-1].intValue())b[i]=cnt;			cnt++;		}		cnt=0;int v = b[n-1];		for(;v>0;cnt++,v>>=1);		if(cnt<=I) System.out.println("0");		else {			i=0;			int min = Integer.MAX_VALUE;			while(i<n) {				int lo=i,hi=n;				while(lo!=hi) {					int md = (lo+hi)/2;					if(b[md]<b[i]+(1<<I)) lo=md+1;else hi=md;				}				min = Math.min(min, i+n-lo);				while(++i<n&&a[i]==a[i-1]);			}			System.out.println(min);		}	}	}
