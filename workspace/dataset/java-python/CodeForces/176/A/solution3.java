import java.util.*;  public class Main{    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        int m = scanner.nextInt();        int k = scanner.nextInt();         int[][] a = new int[n][m];        int[][] b = new int[n][m];        int[][] c = new int[n][m];          int ans = 0;        for(int i = 0; i < n; i++) {            scanner.nextLine();            String name = scanner.nextLine();            for(int j = 0; j < m; j++) {                a[i][j] = scanner.nextInt();                b[i][j] = scanner.nextInt();                c[i][j] = scanner.nextInt();            }        }         for(int i = 0; i < n; i++) {            for(int j = 0; j < n; j++) {                int buy = 0;                int sell = 0;                int cnt = k;                Queue<Node> priorityQueue = new PriorityQueue<>(new Comparator<Node>() {                    @Override                    public int compare(Node o1, Node o2) {                        return o2.value - o1.value;                    }                });                 for(int z = 0; z < m; z++) {                    priorityQueue.offer(new Node(z, b[j][z] - a[i][z]));                }                 while(cnt > 0 && !priorityQueue.isEmpty()) {                    Node node = priorityQueue.poll();                    if(node.value > 0) {                        if (c[i][node.id] <= cnt) {                            buy += a[i][node.id] * c[i][node.id];                            sell += b[j][node.id] * c[i][node.id];                            cnt -= c[i][node.id];                        } else {                            buy += a[i][node.id] * cnt;                            sell += b[j][node.id] * cnt;                            cnt = 0;                        }                    } else {                        break;                    }                 }                ans = Math.max(ans, sell - buy);            }        }        System.out.println(ans);    }     static class Node {        int id;        int value;         public Node(int id, int value) {            this.id = id;            this.value = value;        }    }} 	         	 					    		  	 		