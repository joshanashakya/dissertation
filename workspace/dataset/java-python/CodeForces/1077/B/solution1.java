import java.util.*;import java.io.*;/** * main */public class main {public static void main(String[] args) {FastScanner scan=new main().new FastScanner(); int t=scan.nextInt();int a[]=new int[t];for(int i=0;i<t;++i){a[i]=scan.nextInt();} int count=0;for(int i=1;i<t-1;++i){    if(a[i-1]==1&&a[i]==0&&a[i+1]==1){        ++count;        a[i+1]=0;    } }  System.out.println(count);}    class FastScanner{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));StringTokenizer st=new StringTokenizer("");String next() {while(!st.hasMoreTokens()) {try {st=new StringTokenizer(br.readLine());}catch(IOException e) {e.printStackTrace();}}return st.nextToken();}int nextInt() {return Integer.parseInt(next());}long nextLong() {return Long.parseLong(next());}String nextLine() {String str = "";try {str = br.readLine();} catch (IOException e) {e.printStackTrace();}return str;}}    }
