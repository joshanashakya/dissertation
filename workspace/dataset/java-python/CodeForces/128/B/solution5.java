import static java.lang.Math.* ;import static java.util.Arrays.* ; import java.util.*;import java.io.*; public class Main{    TreeMap<Character , Integer> [] next ;    int [] link , len , cnt ;    int idx  , last ;    long [] total ;     long dp(int state)    {        if(total[state] != -1)            return total[state] ;        long ans = cnt[state] ;        for(int nxt : next[state].values())            ans += dp(nxt);         return total[state] = ans ;    }    void addLetter(char c)    {        int curr = ++idx , p = last ;        len[curr] = len[last] + 1 ;        while(!next[p].containsKey(c))        {            next[p].put(c , curr) ;            p = link[p] ;        }        int q = next[p].get(c) ;        if(q != curr)        {            if(len[q] == len[p] + 1)                link[curr] = q ;            else            {                int clone = ++idx ;                len[clone] = len[p] + 1 ;                cnt[clone] = 0 ;                next[clone] = (TreeMap<Character, Integer>) next[q].clone();                link[clone] = link[q] ;                link[q] = link[curr] = clone ;                while (next[p].get(c) == q)                {                    next[p].put(c , clone) ;                    p = link[p] ;                }            }        }        next[last = curr] = new TreeMap<>() ;    }    long path = 0 ;    String getKthSubstring(int k)    {        getKthSubstring(0 , k) ;        return sb.reverse().toString() ;    }    StringBuilder sb = new StringBuilder() ;     void getKthSubstring(int state , int k)    {        long temp = 0 ;        for(Character c : next[state].keySet())        {            int nxt = next[state].get(c) ;            if (temp >= k - path - total[nxt])            {                path += cnt[nxt] + temp;                if (path >= k) {                    sb.append(c);                    return;                }                getKthSubstring(nxt, k);                if (path >= k) {                    sb.append(c);                    return;                }                return;            }            else temp += total[nxt];         }    }    void main() throws Exception    {        Scanner sc = new Scanner(System.in) ;        PrintWriter out = new PrintWriter(System.out) ;        char [] s = sc.next().toCharArray() ;        int n = s.length ;        int k = sc.nextInt() ;        next = new TreeMap[n << 1] ;        next[0] = new TreeMap<>() ;        link = new int [n << 1] ;        cnt = new int [n << 1] ;        len = new int [n << 1] ;        total = new long [n << 1] ;        fill(total , -1);        fill(cnt , 1);        for(char c : s)            addLetter(c);        Integer [] id = new Integer [idx + 1] ;        for(int i = 0 ; i <= idx ; i++)            id[i] = i ;        sort(id , (x , y) -> len[y] - len[x]);        for(int v : id)            cnt[link[v]] += cnt[v] ;        for(int v : id)            dp(0) ;        String ans = getKthSubstring(k) ;        if(ans.isEmpty())            ans = "No such line." ;        out.println(ans);        out.flush();        out.close();    }      class Scanner    {        BufferedReader br;        StringTokenizer st;         Scanner(InputStream in)        {            br = new BufferedReader(new InputStreamReader(System.in));        }         Scanner(String path) throws Exception        {            br = new BufferedReader(new FileReader(path)) ;        }        String next() throws Exception        {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }        int nextInt() throws Exception { return Integer.parseInt(next()); }         long nextLong() throws Exception { return Long.parseLong(next()); }         double nextDouble() throws Exception { return Double.parseDouble(next());}    }     public static void main (String [] args) throws Exception {(new Main()).main();} }