import java.util.Scanner;public class Ishu{	public static String reverse(String s)	{	char[] ch=new char[10];	char[] ch1=new char[10];	ch=s.toCharArray();	for(int i=0;i<s.length();++i)			ch1[i]=ch[s.length()-1-i];	s=new String(ch1);	return s;	}	public static void main(String[] args)	{	Scanner scan=new Scanner(System.in);	int i,temp,temp1,n;	String text,str;	char[] ch=new char[100];	text=scan.nextLine();	ch=text.toCharArray();	for(i=0;i<text.length();++i)		{		temp=(int)ch[i];		str=Integer.toBinaryString(temp);		while(str.length()<8)			str="0"+str;		n=str.length();		str=reverse(str);		temp=Integer.parseInt(str.substring(0,n),2);		if(i==0)			temp1=0;		else			{			temp1=(int)ch[i-1];			str=Integer.toBinaryString(temp1);			while(str.length()<8)				str="0"+str;			n=str.length();			str=reverse(str);			temp1=Integer.parseInt(str.substring(0,n),2);			}		temp=temp1-temp;		if(temp<0)			{			temp*=(-1);			temp=256-(temp%256);			}		else			temp=temp%256;		System.out.println(temp);		}	}}