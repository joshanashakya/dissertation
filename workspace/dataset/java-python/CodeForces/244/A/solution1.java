/** * Main */import java.util.*;import java.io.*;public class Main {   public static void main(String[] args) {    FastScanner scan=new Main().new FastScanner();;    int t=scan.nextInt();    int k=scan.nextInt();    boolean bl[]=new boolean[t*k+1];    ArrayList<Integer>T=new ArrayList<Integer>();    for(int i=0;i<k;++i){      T.add(scan.nextInt());      bl[T.get(i)]=true;     }        for(int i=0;i<k;++i){    System.out.print(T.get(i)+" ");      int count=0;      for(int j=1;j<=t*k+1;++j){        if(count==t-1){                   break;        }        if(bl[j]==false){          ++count;          System.out.print(j+" ");          bl[j]=true;        }       }      System.out.println();    }       }  class FastScanner{  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  StringTokenizer st=new StringTokenizer("");  String next() {  while(!st.hasMoreTokens()) {  try {  st=new StringTokenizer(br.readLine());  }  catch(IOException e) {  e.printStackTrace();  }  }  return st.nextToken();  }  int nextInt() {  return Integer.parseInt(next());  }  long nextLong() {  return Long.parseLong(next());  }  String nextLine() {  String str = "";  try {  str = br.readLine();  } catch (IOException e) {  e.printStackTrace();  }  return str;  }}}