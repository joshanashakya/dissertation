/*    Author: @__goku__    ssrivastava990@gmail.com                    `\-.   `                      \ `.  `                       \  \ |              __.._    |   \.       S O N - G O K U       ..---~~     ~ . |    Y         ~-.          `|    |            `.               `~~--.              \                    ~.               \                     \__. . -- -  .         .-~~~~~      ,    ,            ~~~~~~---...._      .-~___        ,'/  ,'/ ,'\          __...---~~~            ~-.    /._\_( ,(/_. 7,-.    ~~---...__           _...>-  P""6=`_/"6"~   6)    ___...--~~~            ~~--._ \`--') `---'   9'  _..--~~~                  ~\ ~~/_  ~~~   /`-.--~~                    `.  ---    .'   \_                      `. " _.-'     | ~-.,-------._                  ..._../~~   ./       .-'    .-~~~-.            ,--~~~ ,'...\` _./.----~~.'/    /'       `-        _.-(      |\    `/~ _____..-' /    /      _.-~~`.       /   |     /. ^---~~~~       ' /    /     ,'  ~.   \      (    /    (  .           _ ' /'    /    ,/      \   )      (`. |     `\   - - - - ~   /'      (   /         .  |       \.\|       \            /'        \  |`.           /       /.'\\      `\         /'           ~-\         .  /\      /,   (        `\     /'                `.___..-      \     | |    \         `\_/'                  //      \.     |     | |     |                 _Seal_      /' |       |     | */ import java.io.*;import java.util.*; public class C607B{    static PrintWriter out = new PrintWriter((System.out));    static Kioken sc = new Kioken();     public static void main(String... args)    {        int t = 1;        t = sc.nextInt();        while (t-- > 0)        {            kamehameha();        }        out.close();    }     public static void kamehameha()    {        char[] a=sc.next().toCharArray();        char[] b=sc.next().toCharArray();        char[] c=new char[a.length];        for(int x=0;x<a.length;x++)        {            c[x]=a[x];        }        Arrays.sort(c);        for(int x=0;x<c.length;x++)        {            if(c[x]!=a[x])            {                int i=x;                for(int y=x+1;y<a.length;y++)                {                    if(a[y]==c[x])                    {                        i=y;                    }                }                char temp=a[i];                a[i]=a[x];                a[x]=temp;                break;            }        }        if(String.valueOf(a).compareTo(String.valueOf(b))<0)        {            out.println(a);        }        else        {            out.println("---");        }    }     public static int lower_bound(ArrayList<Integer> ar, int k)    {        int s = 0, e = ar.size();        while (s != e)        {            int mid = s + e >> 1;            if (ar.get(mid) <= k)            {                s = mid + 1;            }            else            {                e = mid;            }        }        return Math.abs(s) - 1;    }     public static int upper_bound(ArrayList<Integer> ar, int k)    {        int s = 0;        int e = ar.size();        while (s != e)        {            int mid = s + e >> 1;            if (ar.get(mid) < k)            {                s = mid + 1;            }            else            {                e = mid;            }        }        if (s == ar.size())        {            return -1;        }        return s;    }     static class Kioken    {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         public String next()        {            while (!st.hasMoreTokens())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (Exception e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt()        {            return Integer.parseInt(next());        }         public long nextLong()        {            return Long.parseLong(next());        }         public double nextDouble()        {            return Double.parseDouble(next());        }         public String nextLine()        {            try            {                return br.readLine();            }            catch (Exception e)            {                e.printStackTrace();            }            return null;        }         public boolean hasNext()        {            String next = null;            try            {                next = br.readLine();            }            catch (Exception e)            {            }            if (next == null || next.length() == 0)            {                return false;            }            st = new StringTokenizer(next);            return true;        }    }}
