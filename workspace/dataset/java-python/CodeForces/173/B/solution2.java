import java.io.*;import java.util.*;import java.math.*; public class Main {         public static void main(String[] args) throws java.lang.Exception {         //Reader pm =new Reader();         Scanner pm = new Scanner(new BufferedReader(new InputStreamReader(System.in)));        int n = pm.nextInt();        int m = pm.nextInt();        //int s = Math.max(n,m);        ArrayList<Integer>[] grp = new ArrayList[n+m+1];        for(int i=0;i<n+m+1;i++)            grp[i] = new ArrayList<>();                for(int i=0;i<n;i++){            String s = pm.next();            for(int j=0;j<s.length();j++){                if(s.charAt(j) == '#'){                    int pl = n+j+1;                    grp[i+1].add(pl);                    grp[pl].add(i+1);                   }            }        }        // for(int i=0;i<grp.length;i++){        //     System.out.println(grp[i]);        // }        int[] parent = new int[n+m+1];        Arrays.fill(parent, -1);        boolean[] visited = new boolean[n+m+1];                LinkedList<Integer> queue = new LinkedList<Integer>();           // Mark the current node as visited and enqueue it         visited[1]=true;         queue.add(1);           while (queue.size() != 0) {             // Dequeue a vertex from queue and print it             int pl = queue.poll();              int fl = 0;            Iterator<Integer> i = grp[pl].listIterator();             while (i.hasNext()) {                 int x = i.next();                 if (!visited[x]) {                     visited[x] = true;                     parent[x] = pl;                    queue.add(x);                     if(x == n){                        fl =1;                        break;                    }                }             }             if(fl == 1)                break;        }                        // for(int i=1;i<grp.length;i++){        //     if(grp[i].size() == 0){        //         continue;        //     }        //     int fl = 0;        //     visited[i] = true;        //     ArrayList<Integer> al = grp[i];        //     for(int j=0;j<al.size();j++){        //         if(visited[al.get(j)])        //             continue;        //         parent[al.get(j)] = i;        //         visited[al.get(j)] = true;        //         if(al.get(j) == n){        //             fl = 1;        //             break;        //         }        //     }        //     if(fl == 1){        //         break;        //     }        // }                int ans = 0;        int st = n;        while(parent[st]!=-1){            st = parent[st];            ans++;        }        if(ans == 0){            System.out.println(-1);        }        else            System.out.println(ans);    }        static class Reader {         final private int BUFFER_SIZE = 1 << 16;         private DataInputStream din;         private byte[] buffer;         private int bufferPointer, bytesRead;           public Reader()         {             din = new DataInputStream(System.in);             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public Reader(String file_name) throws IOException         {             din = new DataInputStream(new FileInputStream(file_name));             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public String readLine() throws IOException         {             byte[] buf = new byte[64]; // line length             int cnt = 0, c;             while ((c = read()) != -1)             {                 if (c == '\n')                     break;                 buf[cnt++] = (byte) c;             }             return new String(buf, 0, cnt);         }           public int nextInt() throws IOException         {             int ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do            {                 ret = ret * 10 + c - '0';             }  while ((c = read()) >= '0' && c <= '9');               if (neg)                 return -ret;             return ret;         }           public long nextLong() throws IOException         {             long ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');             if (neg)                 return -ret;             return ret;         }           public double nextDouble() throws IOException         {             double ret = 0, div = 1;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();               do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');               if (c == '.')             {                 while ((c = read()) >= '0' && c <= '9')                 {                     ret += (c - '0') / (div *= 10);                 }             }               if (neg)                 return -ret;             return ret;         }           private void fillBuffer() throws IOException         {             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);             if (bytesRead == -1)                 buffer[0] = -1;         }           private byte read() throws IOException         {             if (bufferPointer == bytesRead)                 fillBuffer();             return buffer[bufferPointer++];         }           public void close() throws IOException         {             if (din == null)                 return;             din.close();         }     }}    