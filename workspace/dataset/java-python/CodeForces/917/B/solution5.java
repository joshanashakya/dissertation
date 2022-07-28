import java.util.*;import java.math.*;import java.io.*;public class Solution{       static HashMap<Integer,Node> luckup = new HashMap<Integer,Node>();    static class Node{        int id;        LinkedList<Kora> neighbers = new LinkedList<Kora>();        int[] nb = new int[26];        Node(int id){            this.id = id;            Arrays.fill(nb,-1);        }    }        static class Kora{        int id;        int v;        Kora(int id,int v){            this.id = id;            this.v = v;        }    }        static Node getNode(int id){        return luckup.get(id);    }        static void addEdges(int first,int last,int v){        Node node = getNode(first);        Kora kora = new Kora(last,v);        node.neighbers.add(kora);    }        static int bfs(int first,int v){        Node node = getNode(first);        if(node.nb[v]!=-1) return node.nb[v];        else {            int max = 0;            for(Kora k:node.neighbers){                if(k.v<v) continue;                max = (int) Math.max(max,bfs(k.id,k.v)+1);                            }            node.nb[v] = max;            return node.nb[v];        }    }        static boolean[][][] d;    static boolean[][][] visited;        static boolean dp(int u,int x,int c){                if(visited[u][x][c]) return d[u][x][c];                Node node = getNode(u);        boolean ok = false;        for(Kora k:node.neighbers){            if(k.v>=c){                ok = ok || !dp(x,k.id,k.v);            }        }                d[u][x][c] = ok;        visited[u][x][c] = true;        return d[u][x][c];                    }       public static void main(String[] args) throws Exception {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int m = sc.nextInt();        for(int i=1;i<=n;i++) luckup.put(i,new Node(i));        for(int i=0;i<m;i++) {            int u = sc.nextInt();            int x = sc.nextInt();            char c = sc.next().charAt(0);            int v = (int) (c - 'a');            addEdges(u,x,v);        }                int[] turn = new int[n+1];        for(int i=1;i<=n;i++){            turn[i] = bfs(i,0);        }        d = new boolean[n+1][n+1][26];        visited = new boolean[n+1][n+1][26];                for(int i=1;i<=n;i++){            for(int j=1;j<=n;j++){                                boolean ok = dp(i,j,0);                if(ok) System.out.print("A");                else System.out.print("B");            }                        System.out.println("");        }                            }    }
