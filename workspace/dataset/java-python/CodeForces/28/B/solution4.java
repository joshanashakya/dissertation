import java.util.*;import java.io.*; public class Solution {	public static void main (String[] args) throws IOException{		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		String[] temp=br.readLine().trim().split(" ");		int V=Integer.parseInt(temp[0]);		DSU graph=new DSU(V);				temp=br.readLine().trim().split(" ");		int[] desiredNumber=new int[V+1];		for(int i=1;i<=V;i++){		    desiredNumber[i]=Integer.parseInt(temp[i-1]);		}						temp=br.readLine().trim().split(" ");		int[] favouriteNumber=new int[V+1];		for(int i=1;i<=V;i++)		{		    favouriteNumber[i]=Integer.parseInt(temp[i-1]);		    int u=i;		    if(u+favouriteNumber[i]<=V){		        graph.makeUnion(u,u+favouriteNumber[i]);		    }		    if(u-favouriteNumber[i]>=1){		        graph.makeUnion(u,u-favouriteNumber[i]);		    }		}		for(int i=1;i<=V;i++){		    int u=i;		    int v=desiredNumber[i];		    		    int parent1=graph.getParent(u);		    int parent2=graph.getParent(v);		    if(parent1!=parent2){		        System.out.println("NO");		        return;		    }		}				System.out.println("YES");	}} class DSU{    private int[] parent;    private int[] size;        public DSU(int V){        parent=new int[V+1];        size=new int[V+1];        for(int i=1;i<=V;i++){            parent[i]=i;            size[i]=i;        }    }    public int getParent(int vertex){        int temp=vertex;        while(vertex!=parent[vertex]){            vertex=parent[vertex];        }        parent[temp]=vertex;        return vertex;    }    public void makeUnion(int u,int v){        int parent1=this.getParent(u);        int parent2=this.getParent(v);        if(parent1==parent2){            return;        }        int size1=size[parent1];        int size2=size[parent2];        if(size2<size1){            parent[parent2]=parent1;            size[parent1]+=size[parent2];        }        else{            parent[parent1]=parent2;            size[parent2]+=size[parent1];        }    }}
