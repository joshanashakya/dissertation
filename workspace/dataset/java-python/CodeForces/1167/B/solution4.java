//package datatypes; import java.io.*;import java.util.*; public class Practice{ public static void main(String[] args) {     FastReader fs=new FastReader();     PrintWriter out=new PrintWriter(System.out);     int t=1;     //t=fs.nextInt();     for(int i=1;i<=t;i++) {     	Practice m=new Practice();         m.solve(i,out,fs);     }     out.close(); }   public void solve(int test,PrintWriter out,FastReader fs){	int nums[]=new int[] {4,8,15,16,23,42};	 int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;	 	 //123	 	 out.println("? 1 2");	 out.flush();	 int a12=fs.nextInt();	 HashSet<Integer> st=new HashSet<Integer>();	 for(int i=0;i<6;i++) {		 for(int j=i+1;j<6;j++) {			 if(nums[i]*nums[j]==a12) {				 st.add(nums[i]);				 st.add(nums[j]);				 break;			 }		 }	 }	 out.println("? 2 3");	 out.flush();	 int a23=fs.nextInt();	 for(int i=0;i<6;i++) {		 for(int j=i+1;j<6;j++) {			 if(nums[i]*nums[j]==a23) {				 				 if(st.contains(nums[i])){					 n2=nums[i];				 }else {					 n2=nums[j];				 }				 break;			 }		 }	 }	 n1=a12/n2;	 n3=a23/n2;	 	//System.out.print(n1+" "+n2+" "+n3+" "+a12+" "+a23);	 	//456	 	 out.println("? 4 5");	 out.flush();	 int a45=fs.nextInt();	 st=new HashSet<Integer>();	 for(int i=0;i<6;i++) {		 for(int j=i+1;j<6;j++) {			 if(nums[i]*nums[j]==a45) {				 st.add(nums[i]);				 st.add(nums[j]);				 break;			 }		 }	 }	 out.println("? 5 6");	 out.flush();	 int a56=fs.nextInt();	 for(int i=0;i<6;i++) {		 for(int j=i+1;j<6;j++) {			 if(nums[i]*nums[j]==a56) {				 if(st.contains(nums[i])){					 n5=nums[i];				 }else {					 n5=nums[j];				 }				 break;			 }		 }	 }	 n4=a45/n5;	 n6=a56/n5;	 	 out.println("! "+n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);	 out.flush(); }}class FastReader{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); StringTokenizer st=new StringTokenizer("");   String next(){     while(!st.hasMoreTokens()){         try {             st=new StringTokenizer(br.readLine());          } catch (IOException e) {				e.printStackTrace();			}     }     return st.nextToken(); } int nextInt(){     return Integer.parseInt(next()); } long nextLong(){     return Long.parseLong(next()); } int[] nextIntArray(int n){      int a[]=new int[n];     for(int i=0;i<n;i++)a[i]=nextInt();     return a; }  long[] nextLongArray(int n){     long a[]=new long[n];     for(int i=0;i<n;i++)a[i]=nextInt();     return a; } char[] nextCharArray(){     char a[]=next().toCharArray();     return a; }}