//package questions;//codeforces 499Aimport java.util.* ;public class movie{    public static void main(String[] args)    {        Scanner in = new Scanner(System.in) ;        //System.out.println("Enter n :");        int n = in.nextInt() ;        //System.out.println("Enter x :");        int x = in.nextInt() ;        int a[] = new int[2*n] ;        int index=0 ;        int minutes=0 ;        for(int i=0 ; i<n ; i++)        {        	//System.out.println("Enter start value :") ;            a[index]=in.nextInt()-1 ;            index++ ;            //System.out.println("Enter end value :") ;            a[index]=in.nextInt()-1 ;            minutes += a[index]-a[index-1]+1 ;//calculating minimum number of minutes             index++ ;        }//        for(Integer i : a)//        	System.out.println("i :"+i);        int pointer = 0 ;        for(int i=0 ; i<2*n ; i+=2)        {        	int start = a[i] ;        	int end = a[i+1] ;        	int before_starting = start-pointer ; //distance         	//System.out.println(pointer+" "+before_starting);        	if(before_starting < x)        		minutes+=start-pointer ;        	else        		minutes+=(before_starting%x) ;        	pointer = end+1 ;        }        System.out.println(minutes);    }}