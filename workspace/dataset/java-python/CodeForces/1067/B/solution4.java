/*If you want to aim high, aim highDon't let that studying and grades consume youJust live life young******************************What do you think? What do you think?1st on Billboard, what do you think of itNext is a Grammy, what do you think of itHowever you think, I’m sorry, but shit, I have no fcking interest*******************************I'm standing on top of my Monopoly boardThat means I'm on top of my game and it don't stoptil my hip don't hop anymorehttps://www.a2oj.com/Ladder16.html*******************************300iq as writer = Sad!*/import java.util.*;import java.io.*;import java.math.*;    public class x1067B   {      static ArrayDeque<Integer>[] edges;      public static void main(String hi[]) throws Exception      {         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));         StringTokenizer st = new StringTokenizer(infile.readLine());         int N = Integer.parseInt(st.nextToken());         int K = Integer.parseInt(st.nextToken());         edges = new ArrayDeque[N+1];         for(int i=1; i <= N; i++)            edges[i] = new ArrayDeque<Integer>();         for(int i=1; i < N; i++)         {            st = new StringTokenizer(infile.readLine());            int a = Integer.parseInt(st.nextToken());            int b = Integer.parseInt(st.nextToken());            edges[a].add(b);  edges[b].add(a);         }         int[] par = new int[N+1];         int[] cnt = new int[N+1];         int leaf = 1;         for(int v=1; v <= N; v++)            if(edges[v].size() == 1)               leaf = v;         Queue<Integer> q = new LinkedList<Integer>();         q.add(leaf);   par[leaf] = -1;         int max = 0;         while(q.size() > 0)         {            int curr = q.poll();            for(int next: edges[curr])               if(par[next] == 0)               {                  par[next] = curr;                  cnt[next] = cnt[curr]+1;                  q.add(next);                  max = Math.max(max, cnt[next]);               }           }         int center = 0;         for(int v=1; v <= N; v++)            if(cnt[v] == max)            {               ArrayList<Integer> path = new ArrayList<Integer>();               int temp = v;               while(temp != leaf)               {                  path.add(temp);                  temp = par[temp];               }               path.add(leaf);               if(path.size()%2 == 0)               {                  System.out.println("No");                  return;               }               center = path.get(path.size()/2);               break;            }         if(works(center, K) && N+K != 2)            System.out.println("Yes");         else            System.out.println("No");      }      public static boolean works(int root, int K)      {         ArrayDeque<Integer> q = new ArrayDeque<Integer>();         boolean[] seen = new boolean[edges.length];         q.add(root);   seen[root] = true;         q.add(0);         while(q.size() > 0)         {            int curr = q.poll();            int layer = q.poll();            if(curr != root && edges[curr].size() == 3 || edges[curr].size() == 2)               return false;            for(int next: edges[curr])               if(!seen[next])               {                  seen[next] = true;                  q.add(next);                   q.add(layer+1);               }            if(edges[curr].size() == 1 && layer != K)               return false;         }         return true;      }   }