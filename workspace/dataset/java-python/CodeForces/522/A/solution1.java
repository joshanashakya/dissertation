import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.HashMap;import java.util.StringTokenizer; public class Main {	static InputReader in;    static PrintWriter out;            public static void main(String[] args) throws IOException{        //InputStream ins = new FileInputStream("E:\\rush.txt");        InputStream ins = System.in;        in = new InputReader(ins);        out = new PrintWriter(System.out);        //code start from here        new Task().solve(in, out);        out.close();    }        static int N = (int)400;    static class Task{        int n,cnt,ans = 0;        ArrayList []g;                void dfs(int x,int dep) {            ans = Math.max(ans,dep);            for (int i = 0;i < (int)g[x].size();i++) {                int y = (int)g[x].get(i);                dfs(y,dep+1);            }        }                public void solve(InputReader in,PrintWriter out) {            g = new ArrayList[N+10];            HashMap<String,Integer> dic = new HashMap<String,Integer>();            for(int i = 1;i <= N;i++)g[i] = new ArrayList();            n = in.nextInt();            for (int i = 0;i < n;i++) {                StringBuilder sb1 = new StringBuilder();                StringBuilder sb2 = new StringBuilder();                String s1,s2;                                s1 = in.next();s2 = in.next();s2 = in.next();                                char key;                for (int j = 0;j < (int)s1.length();j++) {                    if (s1.charAt(j)>='A' && s1.charAt(j)<='Z') {                        key = (char)(s1.charAt(j)-'A'+'a');                        sb1.append(key);                    }else {                        key =(char)s1.charAt(j);                        sb1.append(s1.charAt(j));                    }                }                s1 = sb1.toString();                                 for (int j = 0;j < (int)s2.length();j++) {                    if (s2.charAt(j)>='A' && s2.charAt(j)<='Z') {                        key = (char)(s2.charAt(j)-'A'+'a');                        sb2.append(key);                    }else {                        key =(char)s2.charAt(j);                        sb2.append(key);                    }                }                s2 = sb2.toString();                                if (!dic.containsKey(s1)) {                    dic.put(s1, ++cnt);                }                                if (!dic.containsKey(s2)) {                    dic.put(s2, ++cnt);                }                                int x = dic.get(s1),y = dic.get(s2);                g[y].add(x);            }            dfs(dic.get("polycarp"),1);            out.println(ans);        }    }          static class InputReader{        public BufferedReader br;        public StringTokenizer tokenizer;                public InputReader(InputStream ins) {            br = new BufferedReader(new InputStreamReader(ins));            tokenizer = null;        }                public String next(){            while (tokenizer==null || !tokenizer.hasMoreTokens()) {                try {                tokenizer = new StringTokenizer(br.readLine());                }catch(IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }                public int nextInt() {            return Integer.parseInt(next());        }    }}