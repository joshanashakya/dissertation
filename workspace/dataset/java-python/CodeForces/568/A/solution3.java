import java.util.*;import java.io.*;public class Task {static boolean ok(int x){    String s=Integer.toString(x);    int i=0,j=s.length()-1;    while(i<j){        if(s.charAt(i)!=s.charAt(j)){            return false;        }        i++;j--;    }    return true;}public static void main(String args[]) throws  IOException {         assign();              int t=1,cn=1;              while(t--!=0){                int[] x=int_arr();                int p=x[0],q=x[1];                boolean[] b=new boolean[2000000];                int[] dp=new int[2000000];                int[] pl=new int[2000000];                Arrays.fill(b,true);                int res=-1;                for(int i=2;i<=(int)Math.sqrt(2000000);i++){                    if(!b[i]) continue;                    for(int j=i*i;j<2000000;j+=i){                        b[j]=false;                    }                }                for(int i=2;i<2000000;i++){                    dp[i]=dp[i-1];                    dp[i]+=b[i]?1:0;                }                for(int i=1;i<2000000;i++){                    pl[i]=pl[i-1];                    pl[i]+=ok(i)?1:0;                    if(q*dp[i]<=p*pl[i]){res=i;}                    //else{break;}                }                if(res==-1){out.write("Palindromic tree is better than splay tree");}                else{out.write(res+"");}            }            out.flush();                           } static BufferedReader s1;static BufferedWriter out;static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}static int int_v (String s1){return Integer.parseInt(s1);}static long long_v(String s1){return Long.parseLong(s1);}static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}static int gcd(int a,int b){if(b==0){return a;}return gcd(b,a%b);}            }