import java.util.*;public class tcf{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();		for(int i=0;i<=n;i++){			graph.add(new ArrayList<Integer>());		}		for(int i=0;i<n-1;i++){			int a = sc.nextInt();			int b = sc.nextInt();			graph.get(a).add(b);			graph.get(b).add(a);		}		Queue<Integer> q = new LinkedList<Integer>();		q.add(1);		int level=0;		boolean[] vis = new boolean[n+1];		vis[1]=true;		long even=0;		long odd =0;		HashMap<Integer,Integer> map = new HashMap<>();		while(!q.isEmpty()){			int size = q.size();			//System.out.println(level+" "+size);			if(level%2==0){				even+=(long)size;			}			else{				odd+=(long)size;			}			map.put(level,size);			while(size-->0){				int p = q.poll();				for(int x : graph.get(p)){					if(vis[x]==false){						vis[x]=true;						q.add(x);					}				}			}			level++;		}	    long ans=odd*even-(long)n+(long)1;		// for(Map.Entry<Integer,Integer> entry : map.entrySet()){		// 	if(entry.getKey()>=3){		// 		ans+=entry.getValue();		// 	}		// }		//if(map.size()<=3){			System.out.println(ans);		//}		// else{		// 	System.out.println(ans);			// }			}}