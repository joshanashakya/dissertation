import java.util.Scanner;import java.util.Arrays;public class Ishu{	public static void main(String[] args)	{	Scanner scan=new Scanner(System.in);	int w,h,x,y;	long ans=0,ax,ay;	w=scan.nextInt();	h=scan.nextInt();	for(x=1;x<w;++x)		{		ax=(x-0)<=(w-x)?(x-0):(w-x);		for(y=1;y<h;++y)			{			ay=(y-0)<=(h-y)?(y-0):(h-y);			ans+=ax*ay;			}		}	System.out.println(ans);	}}