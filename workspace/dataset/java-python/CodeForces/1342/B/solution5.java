import java.lang.*;import java.text.*;import java.util.*; public class Main {	public static void main(String[] args) {		Scanner scanner = new Scanner(System.in);		int t = scanner.nextInt();		while (t-- > 0)		{			String st = scanner.next();			int size = st.length();			int[] ss = new int[2 * size];			int flag = 1;			int j = 0;			char[] a = new char[2];			a[0] = 'a';			a[1] = 'a';			for (int i = 0; i < size; ++i)			{				if (st.charAt(i) == '1')					a[1] = 1;				else if (st.charAt(i) == '0')					a[0] = 0;			}			if (a[0] == 'a' || a[1] == 'a')			{				System.out.println(st);				continue;			}						for (int i = 0; i < size; ++j)			{				if (flag == 1)				{					ss[j] = 1;					if (st.charAt(i) == '1')						++i;				}				else if (flag == -1)				{					ss[j] = 0;					if (st.charAt(i) == '0')						++i;				}				flag *= -1;			}			int check = -1;			for (int i = 0; i < j; ++i)			{				check = ss[i];				System.out.print(ss[i]);			}			if (check == 1)				System.out.print("0");			System.out.print("\n");		}		scanner.close();	} // end main} // end class        	 			 		  	   	 	   		    	  	
