import java.io.*; import java.util.*;public class CF1344B {    //Monopole Magnets    static  boolean[][] a;    static int[][] color;    static int N,M;    public static void main(String[] args) throws IOException {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer(br.readLine());        N=Integer.parseInt(st.nextToken());        M=Integer.parseInt(st.nextToken());       a=new boolean[N][M];                boolean[] doner=new boolean[N];        boolean[] startr=new boolean[N];        boolean[] donec=new boolean[M];        boolean[] startc=new boolean[M];        //Every row/ column's blacks must be continuous        for (int i = 0; i < N; i++) {            String str=br.readLine();            for (int j = 0; j < M; j++) {                if(str.charAt(j)=='#'){                    a[i][j]=true;                    if(!startr[i]){                        startr[i]=true;                    }else if(doner[i]){                        System.out.println("-1"); return;                    }                    if(!startc[j]){                        startc[j]=true;                    }else if(donec[j]){                        System.out.println("-1"); return;                    }                }else{                    if(startr[i]){                        doner[i]=true;                    }                    if(startc[j]){                        donec[j]=true;                    }                }            }        }        //All white row        boolean awr=false;        boolean awc=false;        for (int i = 0; i <N; i++) {            if(!startr[i]){                awr=true; break;            }        }        for (int i = 0; i <M; i++) {            if(!startc[i]){                awc=true; break;            }        }        if(awr!=awc){            System.out.println("-1");return;        }        //Flood fill        color=new int[N][M];        int cnt=1;        for (int i = 0; i < N; i++) {            for (int j = 0; j < M; j++) {                if(a[i][j] && color[i][j]==0){                    fill(i,j, cnt); cnt++;                }            }        }        System.out.println(cnt-1);    }    public static void fill(int i, int j, int c){        color[i][j]=c;        if(i>0 && a[i-1][j] && color[i-1][j]==0){            fill(i-1,j,c);        }        if(i<N-1 && a[i+1][j] && color[i+1][j]==0){            fill(i+1,j,c);        }        if(j>0 && a[i][j-1] && color[i][j-1]==0){            fill(i,j-1,c);        }        if(j<M-1 && a[i][j+1] && color[i][j+1]==0){            fill(i,j+1,c);        }    }}
