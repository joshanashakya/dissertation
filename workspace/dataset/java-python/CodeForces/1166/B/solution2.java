import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.LinkedHashMap;import java.util.Map;import java.util.Scanner;import java.util.*;import java.util.stream.Collectors; public class absolute { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=  new Scanner(System.in);		int k =  sc.nextInt();		if(k>=25)		{			int n=5;			while(k%n!=0)n++;			int m = k/n;			if(m>=5)			{			char[][] ch = new char[n][m];			String s ="aeiou";						for(int i=0;i<n;i++)			{				int st=i%5;				for(int j=0;j<m;j++)				{											ch[i][j]=s.charAt(st%5);						st++;									}				System.out.print(new String(ch[i]));			}			}			else			{				System.out.println(-1);			}								}else		{			System.out.println(-1);		}					}}
