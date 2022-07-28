
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;
import javafx.util.Pair;

public class Main
{

    static void sort(int a[])
    {
        Random ran = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = ran.nextInt(a.length);
            int temp = a[r];
            a[r] = a[i];
            a[i] = temp;
        }

        Arrays.sort(a);
    }
    

    public static void main(String[] args) throws IOException
    {
       Scanner input = new  Scanner(System.in);
       String mainS = input.next();
       String a[] = new String[10];
        for (int i = 0; i < 10; i++) {
            a[i] = input.next();
        }
         String ans = "";
     while(true)
     {
         if(mainS.isEmpty())
             break;
         String sub = mainS.substring(0,10);
         ans+=check(sub,a);
//         System.out.println(sub);
         mainS= mainS.substring(10);
     }
        System.out.println(ans);
       
        
    }
    public static int check(String s,String []a)
    {
        for (int i = 0; i < 10; i++) {
            if(s.equals(a[i]))
            {
                return i;
            }
        }
        return 0;
    }

    



  
     
   
}

