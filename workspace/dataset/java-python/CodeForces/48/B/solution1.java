 import java.lang.*;import java.util.*;import java.io.*; public class Codeforces {     public void solve()throws IOException{        FastScanner fs = new FastScanner();        StringBuilder print = new StringBuilder();        int n = fs.nextInt(),m=fs.nextInt();        int[][]mat = new int[n][m];        for(int i=0;i<n;i++)            for(int j=0;j<m;j++)                mat[i][j] = fs.nextInt();         int a = fs.nextInt(),b = fs.nextInt();        int cnt = a*b;        for(int i=0;i<n;i++){            for(int j=0;j<m;j++){                int tmp = 0,area=0;                for(int k =i;k<Math.min(i+a,n);k++){                    for(int l =j;l<Math.min(j+b,m);l++){                        area++;                        if(mat[k][l] == 1)tmp++;                    }                }                if(area == a*b ){                    cnt = Math.min(tmp,cnt);                }                area = 0;                tmp = 0;                for(int k=i;k<Math.min(i+b,n);k++){                    for(int l=j;l<Math.min(j+a,m);l++){                        area++;                        if(mat[k][l] == 1)tmp++;                    }                }                if(area == a*b ){                    cnt = Math.min(tmp,cnt);                }            }        }        System.out.println(cnt);    }     public static void main(String[]args)throws IOException{        try {            new Codeforces().solve();        }catch (Exception e){//            return;            e.printStackTrace();        }    }    static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }        String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }         int nextInt() {            return Integer.parseInt(next());        }        int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long nextLong() {            return Long.parseLong(next());        }    }}