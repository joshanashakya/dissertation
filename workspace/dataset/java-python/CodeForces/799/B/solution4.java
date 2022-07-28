import java.util.*;import java.io.*; public class Main{	public static void main(String args[]) throws IOException	{		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		int n=Integer.parseInt(br.readLine());		StringTokenizer st=new StringTokenizer(br.readLine());		int p[]=new int[n];		for(int i=0;i<n;i++)		    p[i]=Integer.parseInt(st.nextToken());        st=new StringTokenizer(br.readLine());        int a[]=new int[n];        for(int i=0;i<n;i++)            a[i]=Integer.parseInt(st.nextToken());        st=new StringTokenizer(br.readLine());        int b[]=new int[n];        for(int i=0;i<n;i++)            b[i]=Integer.parseInt(st.nextToken());        TreeSet<Integer> tset1=new TreeSet<>();        TreeSet<Integer> tset2=new TreeSet<>();        TreeSet<Integer> tset3=new TreeSet<>();        for(int i=0;i<n;i++)        {            if(a[i]==1 || b[i]==1)                tset1.add(p[i]);            if(a[i]==2 || b[i]==2)                tset2.add(p[i]);            if(a[i]==3 || b[i]==3)                tset3.add(p[i]);        }        int m=Integer.parseInt(br.readLine());        st=new StringTokenizer(br.readLine());        StringBuilder ans=new StringBuilder();        int p1=0,p2=0,p3=0;        for(int i=0;i<m;i++)        {            int choice=Integer.parseInt(st.nextToken());            if(choice==1)            {                if(tset1.size()==0)                    ans.append(-1+" ");                else                {                    int x=tset1.first();                    ans.append(x+" ");                    tset1.remove(x);                    tset2.remove(x);                    tset3.remove(x);                }            }            if(choice==2)            {                if(tset2.size()==0)                    ans.append(-1+" ");                else                {                    int x=tset2.first();                    ans.append(x+" ");                    tset1.remove(x);                    tset2.remove(x);                    tset3.remove(x);                }            }            if(choice==3)            {                if(tset3.size()==0)                    ans.append(-1+" ");                else                {                    int x=tset3.first();                    ans.append(x+" ");                    tset1.remove(x);                    tset2.remove(x);                    tset3.remove(x);                }            }        }        System.out.print(ans);	}}