 import java.lang.*;import java.util.*;import java.io.*; public class Codeforces {     public void solve()throws IOException{        FastScanner fs = new FastScanner();        StringBuilder ans = new StringBuilder("");        int n = fs.nextInt();        int m = n*(n-1);        m /= 2;        m-=1;        int[]parent = new int[n+1];        ArrayList<Integer>[]winnerGraph = new ArrayList[n+1];        ArrayList<Integer>[]loserGraph = new ArrayList[n+1];        for(int i=1;i<=n;i++){            winnerGraph[i] = new ArrayList<>();            loserGraph[i] = new ArrayList<>();        }        for(int i=0;i<m;i++){            int win = fs.nextInt();            int loss = fs.nextInt();            winnerGraph[win].add(loss);            loserGraph[loss].add(win);        }        int x = -1,y= -1;        for(int i=1;i<=n;i++){            if( winnerGraph[i].size() + loserGraph[i].size() < n-1 ){                if(x == -1)x = i;                else y = i;            }        }        boolean ok = false;         for(int i:winnerGraph[x]){            if(loserGraph[y].contains(i))ok=true;        }        if(ok)            System.out.println(x+" "+y);        else System.out.println(y+" "+x);         System.out.println(ans);    }    public static void main(String[]args)throws IOException{        try {            new Codeforces().solve();        }catch (Exception e){//            return;            e.printStackTrace();        }    }    static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        String next() {            while (!st.hasMoreTokens())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }        String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }         int nextInt() {            return Integer.parseInt(next());        }        int[] readArray(int n) {            int[] a=new int[n];            for (int i=0; i<n; i++) a[i]=nextInt();            return a;        }        long nextLong() {            return Long.parseLong(next());        }    }}
