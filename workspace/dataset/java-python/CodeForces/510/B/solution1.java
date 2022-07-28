import java.util.Scanner; public class Loop {     static int N;//行    static int M;//列    static char[][] str;    static int[][] flag;    static int[] dx = {1,-1,0,0};//左右方向    static int[] dy = {0,0,1,-1};//上下方向    static boolean result = false;      public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n  = sc.nextInt();        N = n;        int m  = sc.nextInt();        M = m;        sc.nextLine();        str = new char[n][m];        flag = new int[n][m];        for(int i =0 ; i< n; i++){            char[] chars = sc.nextLine().toCharArray();            for(int j =0; j< m; j++){                str[i][j] = chars[j];            }        }         for(int i =0 ; i< n; i++){            for(int j =0; j< m; j++){                if(flag[i][j] == 0){                    dfs(i,j,i,j);                }                if(result){                    break;                }            }        }        if(result){            System.out.println("Yes");        }else {            System.out.println("No");        }      }       static public void dfs(int sx, int sy, int fx, int fy){        if(flag[sx][sy] == 1){            result = true;            return;        }        flag[sx][sy] = 1;        int nx = 0;        int ny = 0;        for(int i =0; i< 4; i++){//遍历上下左右四个方向            nx = sx + dx[i];            ny = sy + dy[i];            if(nx == fx && ny == fy){//与终点重合则继续                continue;            }            if(nx < N && ny < M && nx >= 0 && ny >= 0 && str[nx][ny] == str[sx][sy]){//在框框范围内，且不与终点重合;字母一样                dfs(nx,ny,sx,sy);            }//            flag[sx][sy] = 0;//            fx = nx;//            fy = ny;        }    }} 	 	 	 	 			 	 	    				    			
