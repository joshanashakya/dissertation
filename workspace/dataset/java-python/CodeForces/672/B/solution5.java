import java.util.*;import java.math.*;public class DifferentIsGood{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int size = sc.nextInt();			char[] arr = sc.next().toCharArray();			int out = 0;			boolean[] letters = new boolean[26];			if(size>26)			{				System.out.println(-1);				return;			}			for(int i = 0;i<size;i++)			{				if(letters[arr[i]-'a']==true)					out++;				else				{					letters[arr[i]-'a']=true;				}			}			System.out.println(out);		}}