import java.lang.*;
import java.util.*;
public final class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int n=s.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            a[i]=s.nextInt();
            Arrays.sort(a);
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++)
                l.add(a[i]);
                for(int i=0;i<l.size()-1;i++)
                {
                    if(l.get(i+1)-l.get(i)<=1)
                    {
                        l.remove(i);
                        i=-1;
                    }
                }
                if(l.size()==1)
                System.out.println("YES");
                else
                System.out.println("NO");
                t--;
        }
    }
}
