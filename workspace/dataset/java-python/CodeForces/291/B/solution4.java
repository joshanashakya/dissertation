import java.util.Scanner; public class CommandLineArguments { 	public static void main(String[] args) 	{		Scanner sc = new Scanner(System.in);				String s = sc.nextLine();				boolean quote = false;		boolean closed = true;				int cur = 0;				StringBuilder sb = new StringBuilder();				for(int i = 0; i < s.length(); i++)		{			char c = s.charAt(i);						if(c == '"')			{				if(!quote)				{					quote = true;					sb.append('<');					cur = 1;					closed = false;				}				else				{					sb.append(">\n");					cur = 0;					quote = false;					closed = true;				}			}			else if(c == ' ')			{				if(quote)				{					sb.append(c);				}				else				{					if(cur > 0)					{						sb.append(">\n");						cur = 0;						closed = true;					}					else					{					}				}			}			else			{				if(cur == 0)					sb.append('<');				closed = false;				sb.append(c);				cur++;			}		}				if(!closed)			sb.append('>');				System.out.println(sb);  	} }