import java.util.*;
public class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int k=0;k<n;k++)
          {
              a[k]=sc.nextInt();
          }
          int f=1;
          Arrays.sort(a);
          for(int j=1;j<n;j++)
          {
              if(Math.abs(a[j]-a[j-1])>1)
              {
                  f=0;
                  break;
              }
          }
          if(f==1)
          {
              System.out.println("YES");
          }else{
              System.out.println("NO");
          }
      }
    
    }    
    
}
