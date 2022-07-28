import java.io.*; import java.util.*;
public class CF1394B {
    static int K;
    public static int b;
    public static int MOD=1000000007;
    public static int MOD2=998244353;
    static long key, key2;
    static long[] pwr;static long[] pwr2;
    static long[][] prec; 
    static long[][] prec2;
    static ArrayList<Pair> arl[]; static ArrayList<Integer> outset[];
    public static class Pair implements Comparable<Pair>{
        int dest; int val;
        public Pair(int a, int b){
            this.dest=a; this.val=b;
        }
        public int compareTo(Pair other){
            if(this.val>other.val)return 1;
            return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        outset=new ArrayList[K+1];
        arl=new ArrayList[N];
        b= (N+1)+(int)(Math.random()*(MOD-N-1));
        pwr=new long[N]; pwr[0]=1;
        pwr2=new long[N]; pwr2[0]=1;
        key=1; key2=1;
        for (int i = 1; i < N; i++) {
            pwr[i]=(pwr[i-1]*b)%MOD;
            key+=pwr[i]; key%=MOD;
            pwr2[i]=(pwr2[i-1]*b)%MOD2;
            key2+=pwr2[i]; key2%=MOD2;
        }
        for (int i = 1; i <= K; i++) {
            outset[i]=new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            arl[i]=new ArrayList<>();
        }
        int a,c,v;
        for (int i = 0; i < M; i++) {
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken())-1;
            c=Integer.parseInt(st.nextToken())-1;
            v=Integer.parseInt(st.nextToken());
            arl[a].add(new Pair(c,v));
        }
        
        long hash=0;// hash=(cnt0)*1+(cnt1)*b+...
        //Where (cnti) is the number of edges coming into i
        long hash2=0;
        prec=new long[K+1][K];
        prec2=new long[K+1][K];
        for (int i = 0; i < N; i++) {
            Collections.sort(arl[i]);
            
            outset[arl[i].size()].add(i);
            if(arl[i].size()==1){
                hash+=pwr[arl[i].get(0).dest];
                hash2+=pwr2[arl[i].get(0).dest];
            }
        }
        for (int i = 2; i <=K; i++) {
            for (int j = 0; j < i; j++) {
                for (int k : outset[i]) {
                    prec[i][j]+=pwr[arl[k].get(j).dest]; 
                    prec2[i][j]+=pwr2[arl[k].get(j).dest];
                }
                
                prec[i][j]%=MOD; prec2[i][j]%=MOD2;
            }
        }                                   
        System.out.println(dfs(2,hash, hash2));
    }
    public static int dfs(int cur, long hash, long hash2){
        
        int ans=0;
        if(cur==K+1){
            if(hash%MOD==key%MOD && hash2%MOD2==key2%MOD2){
                return 1;
            }
            return 0;
        }
        
        for (int i = 0; i < cur; i++) {
            
            ans+=dfs(cur+1,(hash+prec[cur][i])%MOD, (hash2+prec2[cur][i])%MOD2);
        }
        return ans;
    }
}

