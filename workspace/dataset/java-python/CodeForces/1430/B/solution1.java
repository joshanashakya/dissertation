import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.Collections; public class barrels {	public static void main (String[] args) throws IOException	{		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		int t = Integer.parseInt(br.readLine());		for(int i=0;i<t;i++) {			int[] rong0 = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();			int[] rong = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();			int n=rong0[0],k=rong0[1];						Integer[] newArray = new Integer[rong.length];			int x = 0;			for (int value : rong) {			    newArray[x++] = Integer.valueOf(value);			}			Arrays.sort(newArray, Collections.reverseOrder());			long sum=0;			for(int d=0;d<=k;d++) {				sum+=newArray[d];			}			System.out.println(sum);					}	} }
