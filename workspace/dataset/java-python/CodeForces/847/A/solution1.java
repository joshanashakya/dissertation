import java.util.*;import java.io.*;public class EdB { 	public static void main(String[] args) throws Exception{		int num = 998244353; 		// TODO Auto-generated method stub 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 		PrintWriter out = new PrintWriter(System.out); 		int n = Integer.parseInt(bf.readLine()); 		int[] left = new int[n+1]; 		int[] right = new int[n+1]; 		for(int j = 0;j<n;j++){ 			StringTokenizer st = new StringTokenizer(bf.readLine()); 			int l = Integer.parseInt(st.nextToken()); 			int r = Integer.parseInt(st.nextToken()); 			left[j+1] = l; 			right[j+1] = r; 		} 		int j =0; 		ArrayList<Integer> lefts = new ArrayList<Integer>(); 		for(j = 1;j<=n;j++){ 			if (left[j] == 0){ 				lefts.add(j); 			} 		} 		lefts.add(0); 		 		int[] newleft = new int[n+1]; 		int[] newright = new int[n+1]; 		int temp = 0; 		for(int k = 0;k<lefts.size()-1;k++){ 			int curr = lefts.get(k); 			while(right[curr] != 0){	 			newleft[curr] = left[curr];	 			newright[curr] = right[curr];	 			curr = right[curr]; 			} 			newleft[lefts.get(k)] = temp; 			newleft[curr] = left[curr]; 			newright[curr] = lefts.get(k+1); 			temp = curr; 		} 		 		for(int k = 1;k<=n;k++){ 			out.println(newleft[k] + " " + newright[k]); 		} 		 		out.println();	 		 		out.close(); 		 		 		 	}} 	 //StringJoiner sj = new StringJoiner(" "); //sj.add(strings)//sj.toString() gives string of those stuff w spaces or whatever that sequence is  		 		 		 			  