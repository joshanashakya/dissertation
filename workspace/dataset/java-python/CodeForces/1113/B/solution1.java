import java.util.*;public class B{    public static void main(String[] args)    {        Scanner s=new Scanner(System.in);        int n=s.nextInt();        int a[]=new int[n];        for(int i=0;i<n;i++)        {a[i]=s.nextInt();}        Arrays.sort(a);        int max=0;        int index=-1;         int factor=-1;        for(int i=n-1;i>-1;i--) {            for (int j = 2; j <= Math.sqrt(a[i]); j++) {                if (a[i] % j == 0) {                    if ((a[i] - a[i] / j) - (j * a[0] - a[0]) > max) {                        index = i;                        factor = j;                        max = (a[i] - a[i] / j) - (j * a[0] - a[0]);                    }                }            }        }            if(index!=-1)            {                a[index]=a[index]/factor;                a[0]=a[0]*factor;            }            int ans=0;            for(int i=0;i<n;i++)                ans+=a[i];            System.out.println(ans);        }    } 
