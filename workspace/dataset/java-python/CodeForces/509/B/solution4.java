import java.util.*;public class PaintingPebbles {    static int maxfun(int a[]){        int max=Integer.MIN_VALUE;        for(int i=0;i<a.length;i++){            if(a[i]>max)                max=a[i];        }        return max;    }    static int minfun(int a[]){        int min=Integer.MAX_VALUE;        for(int i=0;i<a.length;i++){            if(a[i]<min)                min=a[i];        }        return min;    }    public static void main(String args[]){        Scanner sc= new Scanner(System.in);        int n=sc.nextInt();        int k=sc.nextInt();        int a[]=new int[n];        for(int i=0;i<n;i++)            a[i]=sc.nextInt();        int kd=maxfun(a)-minfun(a);        if(k<kd)            System.out.println("NO");        else{            System.out.println("YES");            for(int i=0;i<n;i++){                int l=1;                for(int j=0;j<Math.min(a[i], minfun(a)+1);j++)                    System.out.print(l+" ");                l++;                if(a[i]>minfun(a)+1){                    for(int p=0;p<a[i]-(minfun(a)+1);p++,l++)                        System.out.print(l+" ");                }                System.out.println();            }        }    }}