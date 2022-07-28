import java.util.*;

public class Main{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];
        int sum=0;
        for(int i=0 ;i<n ;i++)
        {
            x[i]= scan.nextInt();
            sum += x[i];
        }
        int a=0;
        int b=0;
        int count=0;
        float norm = ((float)sum)/n;
        for(int i=0 ; i<n && count < 3 ; i++)
        {
            if(x[i]<norm)
            {
                count++;
                a = i+1;
            }
            else if(x[i] > norm)
            {
                count++;
                b=i+1;
            }
        }
        if(count==3 || norm!=(int)norm )
        {
            System.out.println("Unrecoverable configuration.");
        }
        else if (a==0)
        {
            System.out.println("Exemplary pages.");
        }
        else
        {
            System.out.println((int)(x[b-1]-norm)+" ml. from cup #"+a+" to cup #"+b+".");
        }
        
    }
}
