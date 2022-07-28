/* ID: tommatt1 LANG: JAVA TASK: */import java.util.*;import java.io.*;public class cf662b{public static ArrayList<pair>[] adj;public static int[] vis;public static ArrayList<Integer> c1;public static ArrayList<Integer> c2;public static ArrayList<Integer> ans;public static ArrayList<Integer> tmp;static boolean pos;static int n;//BufferedReader bf=new BufferedReader(new FileReader("cf662b.in"));//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cf662b.out")));	public static void main(String[] args)throws IOException {		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));		//BufferedReader bf=new BufferedReader(new FileReader("cf662b.in"));		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cf662b.out")));		StringTokenizer st=new StringTokenizer(bf.readLine());		n=Integer.parseInt(st.nextToken());		int m=Integer.parseInt(st.nextToken());		adj=new ArrayList[n];		c1=new ArrayList<Integer>();		c2=new ArrayList<Integer>();		ans=new ArrayList<Integer>();		tmp=new ArrayList<Integer>();		vis=new int[n];		for(int i=0;i<n;i++) {			adj[i]=new ArrayList<pair>();		}		for(int i=0;i<m;i++) {			String s=bf.readLine();			String[] ss=s.split(" ");			int a1=Integer.parseInt(ss[0])-1;			int a2=Integer.parseInt(ss[1])-1;			int c=ss[2].charAt(0)=='R'?0:1;			adj[a1].add(new pair(a2,c));			adj[a2].add(new pair(a1,c));		}		pos=true;		boolean pos1=false;		sol();		if(pos) {		for(int i:tmp) {			ans.add(i);		}		pos1=true;		}		tmp=new ArrayList<Integer>();		vis=new int[n];		pos=true;		for(int i=0;i<n;i++) {			for(pair p:adj[i]) {				p.b=1-p.b;			}		}		sol();		if(pos) {			if(!pos1||ans.size()>tmp.size()) {				ans=tmp;			}		}		if(!pos&&!pos1) {			out.println(-1);			out.close();		}		out.println(ans.size());		for(int i=0;i<ans.size();i++) {			out.print(ans.get(i)+1);			if(i<ans.size()-1) {				out.print(" ");			}			else {				out.println("");			}		}		out.close();	}	public static void sol() {		for(int i=0;i<n;i++) {			if(vis[i]==0) {				c1=new ArrayList<Integer>();				c2=new ArrayList<Integer>();				dfs(i,1);				if(!pos) return;				if(c1.size()>c2.size()) {					c1=c2;				}				for(int z:c1) {					tmp.add(z);				}			}		}	}	public static void dfs(int x, int c) {		if(c==vis[x]) {			return;		}		else if(c+vis[x]==3) {			pos=false;			return;		}		vis[x]=c;		if(c==1) c1.add(x);		else c2.add(x);		for(pair i:adj[x]) {			if(i.b==1) c=3-c;			dfs(i.a,c);			if(i.b==1) c=3-c;		}	}	static class pair implements Comparable<pair>{		int a,b;		public pair(int x,int y) {			a=x;b=y;		}		public int compareTo(pair p) {			return a-p.a;		}	}}  
