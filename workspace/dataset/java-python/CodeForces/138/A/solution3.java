import java.util.Arrays;import java.util.Scanner; public class LiteratureLesson { 	public static void main(String[] args) 	{		Scanner sc = new Scanner(System.in);		int n;		int k;				n = sc.nextInt();				k = sc.nextInt();				int reqtype = 0;				for(int i = 0; i < n; i++)		{			boolean bad = false;			String[] suffix = new String[4];			for(int l = 0; l < 4; l++)			{				suffix[l] = "";				String s = sc.next();				int vowels = 0;				for(int let = s.length()-1; let >= 0; let--)				{					char c = s.charAt(let);					if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')					{ //vowel						vowels++;						if(vowels >= k)						{							suffix[l] = s.substring(let);							break;						}					}				}				if(suffix[l].equals(""))bad = true;			}						int type = -1; //aaaa, aabb, abab, abba			//			System.out.println("Type " + type);//			System.out.println("Suffixes " + Arrays.toString(suffix));						if(bad)			{				System.out.println("NO");				return;			}			if(suffix[0].equals(suffix[1]) && suffix[1].equals(suffix[2]) && suffix[2].equals(suffix[3]))			{				type = 0;			}			else if(suffix[0].equals(suffix[1]) && suffix[2].equals(suffix[3]))			{				type = 1;			}			else if(suffix[0].equals(suffix[2]) && suffix[1].equals(suffix[3]))			{				type = 2;			}			else if(suffix[0].equals(suffix[3]) && suffix[1].equals(suffix[2]))			{				type = 3;			}						if(reqtype == 0)			{				reqtype = type;			}			if((reqtype != 0 && type != 0 && reqtype != type) || type < 0)			{				System.out.println("NO");				return;			}		}				if(reqtype == 0)		{			System.out.println("aaaa");		}		else if(reqtype == 1)		{			System.out.println("aabb");		}		else if(reqtype == 2)		{			System.out.println("abab");		}		else if(reqtype == 3)		{			System.out.println("abba");		}	} }
