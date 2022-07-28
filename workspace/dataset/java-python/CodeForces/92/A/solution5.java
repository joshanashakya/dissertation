
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int i=1,temp=m;
        while(m>=i)
        {
            m-=i;
            
            
            i++;
           if(i>n)
           {
               i=1;
           }
           
        }
        System.out.println(m);
    }

    
    
    
    
}

