import java.io.BufferedInputStream;import java.io.IOException;import java.util.*; public class Main{    static int f[][] = new int[201][201] ;            //Files    static int c[][] = new int[201][2];       //Clusters    static int f_size[] = new int[201];     static void putData(int f_id, int s_id, int c_id){        f[f_id][s_id] = c_id;        c[c_id] =new int[] {f_id, s_id};    }     public static void main(String[] args) throws IOException {        Scanner in = new Scanner(new BufferedInputStream(System.in));        int n = in.nextInt();        int m = in.nextInt();         for(int f_id = 1; f_id<= m; f_id++){            f_size[f_id] = in.nextInt();            for(int s_id = 1; s_id <=f_size[f_id]; s_id++){                int c_id = in.nextInt();                putData(f_id, s_id, c_id);            }        }         //e_id = find(c+1, c+n+1, make_pair(0,0)) - c;        int e_id = 0;        for (int i = 1; i<=n; i++){            if(test(i,0,0)) {                e_id = i;                break;            }        }         int next_id = 1;         ArrayList<int[]> op = new ArrayList<>();        for(int f_id = 1; f_id<= m; f_id++){            for(int s_id = 1; s_id <=f_size[f_id]; s_id++, next_id++){                if(test(next_id, f_id, s_id))                    continue;                if(!test(next_id, 0,0)){    //then is not empty                    op.add(new int[]{next_id, e_id});         //not push_back() because we are pushing a pair into the vector                    putData(c[next_id][0], c[next_id][1], e_id);                }                e_id = f[f_id][s_id];                c[e_id] = new int[]{0,0};                op.add(new int[]{e_id, next_id});                putData(f_id, s_id, next_id);            }        }         System.out.printf("%d\n", op.size());        for(int [] p: op){            System.out.printf("%d %d\n", p[0], p[1]);        }    }     private static boolean test(int i, int a, int b) {        return c[i][0]==a && c[i][1]==b;    }}