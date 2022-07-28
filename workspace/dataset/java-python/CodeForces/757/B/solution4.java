import java.util.*;import java.io.*;public class  Main {    static int N = (int) 1e5+10;    static  List<Integer> prime ;    static boolean []IsPrime;     public static void Sieve() {        prime = new ArrayList<>();        IsPrime = new boolean[N+1];        Arrays.fill(IsPrime,true);        IsPrime[0]=IsPrime[1]=false;         for(int i=2;i*i <= N;i++){            if(IsPrime[i]){                for(int j=i*i;j<=N;j+=i){                    IsPrime[j]=false;                }            }        }        for(int i=2;i<=N;i++)            if(IsPrime[i]) prime.add(i);    }     public static void main(String[] args) {        IOSCANNER input = new IOSCANNER();        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));        Sieve();        int[] arr =new int[N];        int n = input.nextInt();        for(int i=0;i<n;i++)            arr[input.nextInt()]++;        out.println(Solve(arr));         out.close();    }     private static int Solve(int[] arr) {        int max=1,count =0;        for(int i =0;i<IsPrime.length;i++){            if(IsPrime[i]){                for(int j= i ;j<N;j+=i){                    count=count+arr[j];                }            }            if(max < count) max =count;            count=0;        }        return max;    }  }class IOSCANNER {    BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));    StringTokenizer st = new StringTokenizer("");     public String next() {        while (!st.hasMoreTokens()) {            try {                st = new StringTokenizer(Br.readLine());            } catch (IOException ex) {                ex.printStackTrace();            }        }        return st.nextToken();    }     public int nextInt() {return Integer.parseInt(next());}    //public long nextLong(){return  Long.parseLong(next());}    public boolean hasNext(){        try {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(Br.readLine());        }        catch (Exception e) {            return false;        }        return true;     } }   		 					 			 		 					  	 		
