/* My Approach :    Make a graph :     case 1 : if there is only one connected component               1) if a node exist such that p[i]=i then do nothing              2) else find a vertex which is present in the cycle make it p[i]=i and ans=1      case 2 : if there are more than one connected component              every connectec omponenet has a cycle . it may be of length 1             1) if at least one connected component exist such that p[i]=i;                then ans=cc-1; and from every connected component pick a vertex v whihc is presnet in cycle and make p[v]=i;             2) else ans=cc . becaue we have to change in every connectec comp0nent.                pick a vertex from a cc which is present in cycle and make p[i]=i;                and for other component pick a cyclic vertex and make p[v]=i; */import java.util.*;import java.io.*;public class c{  static PrintWriter out = new PrintWriter(System.out);static int flag=0;static void dfs(LinkedList<Integer> l[],int s,int p,boolean v[],HashSet<Integer> h){                       v[s]=true;                     for(Integer i: l[s])                          if(v[i]==false)                             dfs(l,i,s,v,h);                          else if(i!=p&&flag==0)                            { h.add(i); flag=1;} }public static void main(String[] args)throws IOException {           int n = ni();        int p[] = new int[n];        LinkedList<Integer> l[] = new LinkedList[n];               for(int i=0;i<n;i++) l[i] = new LinkedList();          int f=-1;         for(int i=0;i<n;i++) {                   p[i] = ni()-1;                    if(p[i]==i)f=i;                   l[i].add(p[i]);                   l[p[i]].add(i);          }        boolean v[] = new boolean[n];        HashSet<Integer> h = new HashSet<Integer>();        int cc=0,ans=0;           for(int i=0;i<n;i++)                if(v[i]==false)                  { cc++;flag=0; dfs(l,i,-1,v,h);}          if(cc!=1){                      if(f==-1){                                   for(Integer i: h){                                        if(f==-1){                                            f=i;                                               p[i]=i;                                         }                                        else                                          p[i]=f;                                   }                          ans=cc;                      }                    else{                            for(Integer i: h)                                 if(i!=f)                                    p[i]=f;                              ans=cc-1;                                  }          }        else if(f==-1){                 for(Integer i : h)                      p[i]=i;                      ans =1;          }             out.println(ans);          for(int i=0;i<n;i++)             out.print((p[i]+1)+" ");      out.flush();}       static FastReader sc=new FastReader();        static int ni(){                 int x = sc.nextInt();                 return(x);        }      static long nl(){              long x = sc.nextLong();              return(x);         }      static String n(){                 String str = sc.next();                     return(str);       }     static String ns(){                 String str = sc.nextLine();                   return(str);      }     static double nd(){               double d = sc.nextDouble();                 return(d);       }  static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }