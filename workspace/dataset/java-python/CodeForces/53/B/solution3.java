import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;public class BlogPhoto {	public static void main(String[]args)throws IOException{		PrintWriter pw=new PrintWriter(System.out,true);		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));		String s=bf.readLine();		String[]sa=s.split(" ");		long h=Integer.parseInt(sa[0]);		long w=Integer.parseInt(sa[1]);		long[]a=new long[30];		a[0]=1;		for(int i=1;i<30;i++)			a[i]=a[i-1]*2;		long max=0;		long xmax=0,ymax=0;		for(int i=29;i>=0;i--){			long x=a[i],y=Math.min(w, (x*5)/4);			if(x<=h){				if(4*y<=5*x && 4*x<=5*y){					if(x*y>max || (x*y==max && x>xmax)){						max=x*y;						xmax=x;						ymax=y;					}				}								}		}		for(int i=29;i>=0;i--){			long y=a[i],x=Math.min(h, (y*5)/4);			if(y<=w){				if(16*x<=20*y && 20*y<=25*x){					if(x*y>max || (x*y==max && x>xmax)){						max=x*y;						xmax=x;						ymax=y;					}				}								}		}		System.out.println(xmax+" "+ymax);	}}