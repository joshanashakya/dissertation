import java.io.*; import java.util.*;public class CF1098B{  static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }               }     public static class Pair implements Comparable<Pair>{        int vtx; int val;        public Pair(int a, int b){            this.vtx=a; this.val=b;        }        public int compareTo(Pair other){            if(this.val<other.val)return -1;            if(this.val>other.val)return 1;            if(this.vtx<other.vtx)return -1;            return 1;        }    }    static int MOD=998244353;    static int[] rk, p,siz;    public static void main(String[] args){        FastReader br=new FastReader();        int N=br.nextInt(); int M=br.nextInt();        char[][] a=new char[N][M]; String s;        int[][][] row=new int[N][4][2]; int[][][] col=new int[M][4][2];        char[] map={'A','C','G','T'};        for (int i = 0; i < N; i++) {            s=br.next();            for (int j = 0; j < M; j++) {                a[i][j]=s.charAt(j);                if(a[i][j]=='A'){                    row[i][0][j%2]++; col[j][0][i%2]++;                }else if(a[i][j]=='C'){                    row[i][1][j%2]++; col[j][1][i%2]++;                }else if(a[i][j]=='G'){                    row[i][2][j%2]++; col[j][2][i%2]++;                }else{                    row[i][3][j%2]++; col[j][3][i%2]++;                }            }        }        int ans=MOD; int cur=0; int cur2=0; int k=0; int l=0;        int oi=-1; int oj=-1; boolean r=false;         boolean[][][] opt=new boolean[4][4][M];//Cols        boolean[][][] optr=new boolean[4][4][N];//Rows        for (int i = 0; i < 4; i++) {            for (int j = i+1; j < 4; j++) {                                                cur=N*M; k=0; l=0;                               while(k==i || k==j){k++;}                l=k+1; while(l==i || l==j) {l++;}                for (int m = 0; m < M; m+=2) {                    if(col[m][i][0]+col[m][j][1] < col[m][i][1]+col[m][j][0]){                        opt[i][j][m]=true;                        cur-=(col[m][i][1]+col[m][j][0]);                    }else{                        cur-=(col[m][i][0]+col[m][j][1]);                    }                                    }                for (int m = 1; m < M; m+=2) {                    if(col[m][k][0]+col[m][l][1] < col[m][k][1]+col[m][l][0]){                        opt[i][j][m]=true;                        cur-=(col[m][k][1]+col[m][l][0]);                    }else{                        cur-=(col[m][k][0]+col[m][l][1]);                    }                                    }                cur2=N*M;                for (int m = 0; m < N; m+=2) {                    if(row[m][i][0]+row[m][j][1] < row[m][i][1]+row[m][j][0]){                        optr[i][j][m]=true;                        cur2-=(row[m][i][1]+row[m][j][0]);                    }else{                        cur2-=(row[m][i][0]+row[m][j][1]);                    }                }                for (int m = 1; m < N; m+=2) {                    if(row[m][k][0]+row[m][l][1] < row[m][k][1]+row[m][l][0]){                        optr[i][j][m]=true;                        cur2-=(row[m][k][1]+row[m][l][0]);                    }else{                        cur2-=(row[m][k][0]+row[m][l][1]);                    }                }                //System.out.println(i+" "+j+" "+cur+" "+cur2);                if(cur2<=cur && cur2<ans){                    ans=cur2;                    r=true; oi=i; oj=j;                 }else if(cur<cur2 && cur<ans){                    r=false; ans=cur; oi=i; oj=j;                }                            }        }                k=0; l=0;        while(k==oi || k==oj){k++;}         l=k+1; while(l==oi || l==oj) {l++;}         //System.out.println(ans);         //System.out.println(oi+" "+oj+" "+k+" "+l+" "+r);         StringBuilder sb=new StringBuilder();        if(r){                        for (int n = 0; n< N; n++) {                if(n%2==0){                    for (int m = 0; m < M; m++) {                        if(optr[oi][oj][n] ^ (m%2==0)){                            sb.append(map[oi]);                        }else{                            sb.append(map[oj]);                        }                    }                }else{                    for (int m = 0; m < M; m++) {                        if(optr[oi][oj][n] ^ (m%2==0)){                            sb.append(map[k]);                        }else{                            sb.append(map[l]);                        }                    }                }                sb.append("\n");            }        }else{            for (int n = 0; n< N; n++) {                for (int m = 0; m < M; m++) {                    if(m%2==0){                                            if(opt[oi][oj][m] ^ (n%2==0)){                            sb.append(map[oi]);                        }else{                            sb.append(map[oj]);                        }                    }else{                                            if(opt[oi][oj][m] ^ (n%2==0)){                            sb.append(map[k]);                        }else{                            sb.append(map[l]);                        }                                        }                }                                sb.append("\n");            }        }        System.out.println(sb.toString());            }        public static int find(int x, int[] p){        if(p[x]==x)return x;        int ans=find(p[x],p); p[x]=ans; return ans;    }        public static void merge(int a, int b) {        if(rk[a]<rk[b]) {            p[a]=b; siz[b]+=siz[a];        }else if(rk[a]==rk[b]) {            p[a]=b; rk[b]++;siz[b]+=siz[a];        }else {            p[b]=a; siz[a]+=siz[b];        }    }    }//Debugging://Are you sure your algorithm is correct?//Bounds: long//Special cases: n=0,1?//Make sure you remove your debugging code before you submit!