import java.awt.Container;import java.util.Scanner;import java.util.concurrent.ConcurrentHashMap; public class Main { 	static int f[],fa[];	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();		f=new int[n+1];fa=new int[n+1];		for (int i =1; i <=n; i++) {			f[i]=i;		}		for (int i =1; i <=n; i++) {			fa[i]=sc.nextInt();			add(i,fa[i]);		}		int ans=0;int rt=0;		for (int i =1; i <=n; i++)			if(fa[i]==i&&f[i]==i)rt=i;			if(rt!=0){			for (int i =1; i <=n; i++) {				if(f[i]!=i)continue;				ans++;				if(fa[i]==i){					if(i!=rt)fa[i]=rt;				}else{					fa[i]=rt;				}			}			System.out.println(ans-1);		}else{			for (int i =1; i <=n; i++) {				if(f[i]!=i)continue;				ans++;				if(rt==0)rt=i;				fa[i]=rt;			}			System.out.println(ans);		}		for (int i =1; i <=n; i++) {			if(i==1){				System.out.print(fa[i]);			}else{				System.out.print(" "+fa[i]);			}		}		System.out.println();			}	public static void add(int x,int y){		int X=find(x);int Y=find(y);		if(X==Y)return;		f[X]=Y;	}	public static int find(int q){		return f[q]==q?q:(f[q]=find(f[q]));	}}