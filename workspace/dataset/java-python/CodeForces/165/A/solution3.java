import java.util.* ;public class SuperCentral{    public static void main(String[] args)    {        Scanner in = new Scanner(System.in) ;        int n = in.nextInt() ;        int xx[] = new int[n] ;        int yy[] = new int[n] ;        for(int i=0 ; i<n ; i++)        {            xx[i] = in.nextInt() ;            yy[i] = in.nextInt() ;        }        int number=0 ;        for(int i=0 ; i<n ; i++)        {            int xc = xx[i] ;            int yc = yy[i] ;            boolean left=false , right=false , upper=false , lower=false ;            for(int j=0 ; j<n ; j++)            {                if(xx[j]>xc && yy[j]==yc)//right neighbor                right=true ;                else if(xx[j]<xc && yy[j]==yc)//left neighbor                left=true ;                else if(xx[j]==xc && yy[j]<yc)//lower neighbor                lower=true ;                else if(xx[j]==xc && yy[j]>yc)//upper neighbor                upper=true ;            }            if(right && left && upper && lower)            number++ ;        }        System.out.println(number) ;    }}
