import java.util.*;import java.io.*;public class EdD { 	public static void main(String[] args) throws Exception{		int num = 998244353; 		// TODO Auto-generated method stub 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 		PrintWriter out = new PrintWriter(System.out);//	 		String input1 = bf.readLine().trim();//	 		String input2 = bf.readLine().trim(); 			 		String a = bf.readLine();	 		int[][] array = new int[26][a.length()+1];	 		for(int i = 0;i<26;i++){	 			array[i][0] = 0;	 		}	 		for(char c = 'a';c<='z';c++){	 			for(int j = 1;j<=a.length();j++){	 				if (a.charAt(j-1) == c){	 					array[(int)(c)-97][j] = array[(int)(c)-97][j-1]+1;	 				}	 				else{	 					array[(int)(c)-97][j]= array[(int)(c)-97][j-1];	 				}	 			}	 		}	 		 			 		int q = Integer.parseInt(bf.readLine());	 		for(int i = 0;i<q;i++){	 			StringTokenizer st = new StringTokenizer(bf.readLine());	 			int l = Integer.parseInt(st.nextToken());	 			int r = Integer.parseInt(st.nextToken());	 			int count1 = 0;	 			for(char c = 'a';c<='z';c++){	 				if (array[(int)(c)-97][r] - array[(int)(c)-97][l-1] > 0)	 					count1++;	 			}	 			if (r == l || a.charAt(r-1) != a.charAt(l-1) || count1>=3){	 				out.println("Yes");	 			}	 			else	 				out.println("No");	 		} 		 			 		 		out.close(); 		 		 		 	}} 	 //StringJoiner sj = new StringJoiner(" "); //sj.add(strings)//sj.toString() gives string of those stuff w spaces or whatever that sequence is  		 		 		 			  
