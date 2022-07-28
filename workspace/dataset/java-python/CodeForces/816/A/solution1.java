import java.util.*;import java.io.*;import java.time.Year;/** * main */public class Main {static PrintWriter out=new PrintWriter(System.out); static FastScanner scan=new Main(). new FastScanner();  static void clearScreen(){    out.flush();}static boolean pallindrom(String m){StringBuffer s=new StringBuffer(m);String a=m;s.reverse();String b=s.toString();if(a.equals(b)){    return true;}    else{    return false;} }static int longestSubstring(String a,String b){    int dp[][]=new int[a.length()+1][b.length()+1];    int max1=0;    for(int i=0;i<=a.length();++i){         for(int j=0;j<=b.length();++j){             if(i==0||j==0){                 dp[i][j]=0;             }             else              if(a.charAt(i-1)==b.charAt(j-1)){                 dp[i][j]=1+dp[i-1][j-1];                 max1=Math.max(dp[i][j],max1);             }             else{                 dp[i][j]=0;             }         }    }    return max1;  } public static void main(String[] args) {String m=scan.next(); if(pallindrom(m)==true){	System.out.println(0); }else 	if(m.equals("23:59")) {		System.out.println(1);	} else{    int hour=Integer.parseInt(m.substring(0,2));    int min=Integer.parseInt(m.substring(3));    int count=0;    while(!m.equals("23:59")&&!pallindrom(m)){    	hour=Integer.parseInt(m.substring(0,2));         min=Integer.parseInt(m.substring(3));                      if(min==59){               ++hour;               min=0;           }           else{               ++min;           }                  if(hour<10) {        	 m="0"+hour;         }         else {        	 m=""+hour;         }        	                   if(min<10) {        	 m+=":0"+min;         }         else {        	 m+=":"+min;         }        	                 ++count;    }    if(m.equals("23:59"))++count;    System.out.println(count);}clearScreen();   }class FastScanner{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));StringTokenizer st=new StringTokenizer("");String next() {while(!st.hasMoreTokens()) {try {st=new StringTokenizer(br.readLine());}catch(IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt() {return Integer.parseInt(next());}long nextLong() {return Long.parseLong(next());}String nextLine() {String str = "";try {str = br.readLine();} catch (IOException e) {e.printStackTrace();}return str;}}    }