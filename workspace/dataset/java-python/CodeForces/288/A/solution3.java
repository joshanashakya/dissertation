import java.util.Scanner; public class A177 { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner obj=new Scanner(System.in);		int n=obj.nextInt();		int k=obj.nextInt();		StringBuilder sb=new StringBuilder();		StringBuilder sb1=new StringBuilder();		if(k>n||(k==1&&n>1))			System.out.println("-1");		else		{			char c='c';			if(k>2)			{				k=k-2;				for(int i=k;i>=1;i--)				{					sb.append(c);					c++;					n--;				}			}			char ch='a';			for(int i=0;i<n;i++)			{				sb1.append(ch);				if(ch=='a')					ch='b';				else if(ch=='b')					ch='a';			}		}		System.out.print(sb1);		System.out.print(sb); 	} }