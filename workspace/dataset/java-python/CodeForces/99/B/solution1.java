import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int[] juice = new int[1006];
        int x=0;
        for(int i=0;i!=n;++i) 
        {
            x+=(juice[i]=cin.nextInt());
        }
        int ave=x/n;
        int plus_pos=0, minus_pos=0, plus_cnt=0, minus_cnt=0;
        for(int i=0;i!=n;++i)
        {
            if(juice[i]>ave)
            {
                plus_pos=i;
                plus_cnt++;
            }
            if(juice[i]<ave)
            {
                minus_pos=i;
                minus_cnt++;
            }
        }
        if (plus_cnt ==1 && minus_cnt==1 && ave-juice[minus_pos]==juice[plus_pos]-ave)
        {
            System.out.printf("%d ml. from cup #%d to cup #%d.\n", ave-juice[minus_pos], minus_pos+1, plus_pos+1);
        }
        else if(plus_cnt==0 && minus_cnt==0)
        {
            System.out.println("Exemplary pages.");
        }
        else
        {
            System.out.println("Unrecoverable configuration.");
        }
        
        cin.close();
    }
}
