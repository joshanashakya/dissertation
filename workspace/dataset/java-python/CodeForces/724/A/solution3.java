import java.util.*;import java.io.PrintWriter; public class r1 {	static PrintWriter o=new PrintWriter(System.out);	public static void main(String[] args) {		Scanner bh=new Scanner(System.in);		String str1=bh.next();		String str2=bh.next();		String day[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};		//int num[]={0,1,2,3,4,5,6};		int n1=-1;int n2=-1;		for(int i=0;i<7;i++)		{			if(str1.equals(day[i]))			{				n1=i;			}			if(str2.equals(day[i]))			{				n2=i;			}		}		//o.println(n1+" "+n2);		if(n1==n2||(n1+2)%7==n2||(n1+3)%7==n2)		{			o.println("YES");		}		else		{			o.println("NO");		}    			o.close();	}}