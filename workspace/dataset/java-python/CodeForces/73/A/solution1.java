import java.util.*;import java.io.*;  public class Task {     static BufferedReader s1;static BufferedWriter out;static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}static int int_v (String s1){return Integer.parseInt(s1);}static long long_v(String s1){return Long.parseLong(s1);}static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}    public static void main(String args[]) throws  IOException {        assign();        int[] n=int_arr();        Arrays.sort(n,0,3);        int x=n[0],y=n[1],z=n[2],k=n[3];        long res=1;        for(int i=0;i<z;i++){            int r=k-i;            int x1=Math.min(x-1,r/2),y1=Math.min(y-1,(r-x1));            if((x1+y1+i)>k||x1<0||y1<0){continue;}            res=Math.max(res,(long)(i+1)*(x1+1)*(y1+1));        }        out.write(res+"\n");                     out.flush();    }           }
