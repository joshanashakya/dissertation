import java.io.*;import java.util.*; public class test {//static int[] arr;   public static long F(int a,long[] arr,long x)   {   		int i=a;long s=0l;int ct=0;   		while(i<arr.length)   		{   			s+=arr[i];   			if(s==x)   			{   				ct++;s=0l;   			}   			else if(s>x) return 10000000l;   			i++;   		}   		if(s>0 && s!=x) return 10000000l;   		return arr.length-a-ct+0l;   }	public static void main (String[] args) throws Exception {        		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));        		int y=Integer.parseInt(bf.readLine());		for(int h=0;h<y;h++)		{		    String[] xl=(bf.readLine()).split(" ");int i=0;            int a,b,m;long ans=0l;            a=Integer.parseInt(xl[0]);            //b=Integer.parseInt(xl[1]);            //m=Integer.parseInt(xl[2]);            long[] m1;            m1=new long[a];            //m2=new int[b+1];            //int[] l1,l2;            //l1=new int[m];l2=new int[m];            xl=(bf.readLine()).split(" ");            //long[] pre=new long[a];            long v=0l;            for(int o=0;o<m1.length;o++)            {                long bp = Long.parseLong(xl[o]);                m1[o]=bp;                if(o>0) v+=(Math.abs(bp-m1[o-1]));            }            ans=v;            ans=Math.min(ans,v - Math.abs(m1[0]-m1[1]));             ans=Math.min(ans,v - Math.abs(m1[a-1]-m1[a-2]));            for(int o=1;o<m1.length-1;o++)            {                long q,w;                q=m1[o-1];                w=m1[o+1];                long val = Math.abs(q-w);                long val2= Math.abs(q-m1[o]) + Math.abs(w-m1[o]);                ans=Math.min(ans,v+val-val2);            }            System.out.println(ans);                                                                                                		}	}}    
