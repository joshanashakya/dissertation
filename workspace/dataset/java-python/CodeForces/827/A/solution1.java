import java.util.*;import java.io.* ; public class StringReconstruction1 {        public static void main(String[] args)     {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int [] index = new int[2000001];        String [] str = new String[2000001];        int max = Integer.MIN_VALUE ;        while( n-->0 )        {            String s = sc.next();            int x = sc.nextInt();            while( x-->0 )            {                int i = sc.nextInt()-1;                            if( index[i] < s.length() ){                    str[i] = s ;                    index[i] = s.length();                }                max = Integer.max(max, i+s.length()-1);            }        }                char [] ans = new char[max+1];        int reminder = 0 ;        String curStr = "";        int ind = -1 ;        for( int i = 0 ; i <= max ;i++ )        {            if( index[i]== 0 && reminder == 0 )            {                ans[i] = 'a' ;                continue ;            }            else if( reminder < index[i] )            {                curStr = str[i];                reminder = curStr.length() ;                ind = 0 ;            }            ans[i] = curStr.charAt(ind++);            reminder -- ;                                }                String st = new String(ans);        st = st.trim();        System.out.println(st);                        sc.close();           }    }