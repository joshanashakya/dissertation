//package questions;import java.util.* ;public class cf{    public static void main(String[] args)    {        Scanner in = new Scanner(System.in) ;        int n = in.nextInt() ;        int a = in.nextInt() ;        int b = in.nextInt() ;        int c = in.nextInt() ;        int max=Integer.MIN_VALUE ;        for(int x=0 ; x<=4000 ; x++)        {            for(int y=0 ; y<=4000 ; y++)            {                int zc = n-((x*a)+(y*b)) ;                 if(zc<0)                 break ;                int z = zc/c ;               // System.out.println(x+" "+y+" "+z);                if(zc%c==0)                max = Math.max(max,x+y+z) ;            }        }        System.out.println(max) ;    }}