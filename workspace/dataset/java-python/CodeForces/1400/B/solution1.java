import java.io.*;import java.util.*; public class test {	static int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};   static class sort implements Comparator<long[]>   {	   	public int compare(long[] a,long[] b)	   	{	   		if(a[0]>b[0]) return 1;	   		if(a[0]<b[0]) return -1;	   		return 0;	   	}   }   public static void print(Object o)   {   	 PrintWriter out = new PrintWriter(System.out);;;	out.println(o.toString());	out.flush();   }   public static int intIn(String st)   {   	  return Integer.parseInt(st);   }          public static long Dis(int a,int b,int[][] arr)    {    	long sum =0l;    	for(int[] x : arr)    	{    		sum = sum + Math.abs(a-x[0]) +Math.abs(b-x[1]) + 0l;    	}    	return sum;    }    public static void pr(Object o)    {    	System.out.println(o.toString());    }    public static long F(int a,int b)    {    	return (1337317l)*a + (337133731l)*b;    }     public static long F(long samount,long capA,long capB,long ctS,long ctW,long wS,long wW)     {     	if(capA < (samount*wS)) return 0;     	long tot = samount;     	capA = (capA - (tot*wS));     	ctS -= tot;     	long tot2 = Math.min(ctW,(capA)/(wW));     	ctW -= tot2 ;     	long tot3=0;     	if(wS > wW)     	{     		tot3  = Math.min(ctW,(capB/wW));      		capB -= (tot3*wW);     		tot3 += (Math.min(ctS,(capB/wS)));     	}     	else     	{     		tot3  = (Math.min(ctS,(capB/wS)));     		capB -= (tot3*wS);     		tot3 += (Math.min(ctW,(capB/wW)));      		     	}     	return tot2+tot3+tot;     }	public static void main (String[] args) throws Exception {        		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));        		int y=Integer.parseInt(bf.readLine());		//int[] map=new int[1000001];		for(int h=0;h<y;h++)		{		    String[] xl=(bf.readLine()).split(" ");//int i=0;            int a,b,m,n,c1,c2,d1,e1;//long a,b,m,n;            a=Integer.parseInt(xl[0]);//n=Long.parseInt(xl[0]);            b=Integer.parseInt(xl[1]);            xl=(bf.readLine()).split(" ");//int i=0;            //int a,b,m,n;//long a,b,m,n;            c1=Integer.parseInt(xl[0]);//n=Long.parseInt(xl[0]);            c2=Integer.parseInt(xl[1]);            xl=(bf.readLine()).split(" ");//int i=0;           // int a,b,m,n;//long a,b,m,n;            d1=Integer.parseInt(xl[0]);//n=Long.parseInt(xl[0]);            e1=Integer.parseInt(xl[1]);            long res=0l;            for(int o=0;o<=c1;o++)            {            	                     res = Math.max(res,F(o,a,b,c1,c2,d1,e1));                               }            System.out.println(res);                        		}	}}/*128 9414 86 5 */   
