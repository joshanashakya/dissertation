// package datatypes;  import java.io.*;import java.util.*; public class Main{ public static void main(String[] args) {     FastReader fs=new FastReader();     PrintWriter out=new PrintWriter(System.out);     int t=1;     //t=fs.nextInt();     for(int i=1;i<=t;i++) {     	Main m=new Main();         m.solve(i,out,fs);     }     out.close(); }   public void solve(int test,PrintWriter out,FastReader fs){	  int a=fs.nextInt(),b=fs.nextInt();	  Stack<Integer> st = new Stack<Integer>();	  while(b>=a) {		  st.add(b);		  if(b%2==0)   b/=2;		  else if(b%10==1) b=(b-1)/10;		  else break;	  }	  if(st.peek()==a) {		  System.out.println("YES");		  System.out.println(st.size());		  while(st.size()>0) {			  int i = st.pop();			  System.out.print(i+" ");		  }//		  for(int i:st) {//			  //		  }	  }else {		  System.out.println("NO");//		  System.out.println(st.size());//		  for(int i:st) {//			  System.out.print(i+" ");//		  }	  } }}class FastReader{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); StringTokenizer st=new StringTokenizer("");   String next(){     while(!st.hasMoreTokens()){         try {             st=new StringTokenizer(br.readLine());          } catch (IOException e) {				e.printStackTrace();			}     }     return st.nextToken(); } int nextInt(){     return Integer.parseInt(next()); } long nextLong(){     return Long.parseLong(next()); } int[] nextIntArray(int n){      int a[]=new int[n];     for(int i=0;i<n;i++)a[i]=nextInt();     return a; }  long[] nextLongArray(int n){     long a[]=new long[n];     for(int i=0;i<n;i++)a[i]=nextInt();     return a; } char[] nextCharArray(){     char a[]=next().toCharArray();     return a; }}
