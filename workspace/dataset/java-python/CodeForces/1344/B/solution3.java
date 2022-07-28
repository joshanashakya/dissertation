// package Quarantine;  import javafx.util.Pair; import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.LinkedList;import java.util.Queue;import java.util.StringTokenizer; public class MonopoleMagnets {    static boolean visited[][];    static char a[][];    static int m,n;    public static void main(String[] args)throws IOException {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer(br.readLine());        m=Integer.parseInt(st.nextToken());        n=Integer.parseInt(st.nextToken());        a=new char[m][n];        for(int i=0;i<m;i++){            a[i]=br.readLine().toCharArray();        }        int col=getAllWhiteCol();        int row=getAllWhiteRow();//        System.out.println(row+" "+col);        if((row<0&&col>=0)||(row>=0&&col<0)){            System.out.println(-1);            return;        }//        System.out.println(checkColums());        if(!(checkColums()&&checkRows())){            System.out.println(-1);            return;        }        int count=0;        visited=new boolean[m][n];        for(int i=0;i<m;i++){            for(int j=0;j<n;j++){                if(a[i][j]=='#'&&!visited[i][j]){//                    System.out.println(i+" "+j);                    count++;                    bfs(i,j);                }            }        }        System.out.println(count);    }    public static void bfs(int x,int y){        visited[x][y]=true;        int dx[]={-1,1,0,0};        int dy[]={0,0,1,-1};        Queue<Pair<Integer,Integer>> queue=new LinkedList<>();        queue.add(new Pair<>(x,y));        while(!queue.isEmpty()){            Pair<Integer,Integer> curr=queue.remove();            x=curr.getKey();            y=curr.getValue();            for(int i=0;i<4;i++){                int p=x+dx[i];                int q=y+dy[i];                if(isValid(p,q)&&a[p][q]=='#'&&!visited[p][q]){                    visited[p][q]=true;                    queue.add(new Pair<>(p,q));                }            }        }        return;    }    public static int getAllWhiteCol(){        for(int j=0;j<n;j++){            boolean f=true;            for(int i=0;i<m;i++){                if(a[i][j]!='.'){                    f=false;                    break;                }            }            if(f){                return j;            }        }        return -1;    }    public static int getAllWhiteRow(){        for(int i=0;i<m;i++){            boolean f=true;            for(int j=0;j<n;j++){                if(a[i][j]!='.'){                    f=false;                    break;                }            }            if(f){                return i;            }        }        return -1;    }    public static boolean checkColums(){        for(int j=0;j<n;j++){            int c=0;            for(int i=0;i<m;){                if(a[i][j]=='#'){                    c++;                    while(i<m&&a[i][j]=='#'){                        i++;                    }                }                i++;            }            if(c>1){                return false;            }        }        return true;    }    public static boolean checkRows(){        for(int i=0;i<m;i++){            int c=0;            for(int j=0;j<n;){                if(a[i][j]=='#'){                    c++;                    while(j<n&&a[i][j]=='#'){                        j++;                    }                }                j++;            }            if(c>1){                return false;            }        }        return true;    }    public static boolean isValid(int x,int y){        return x>=0&&x<m&&y>=0&&y<n;    }}
