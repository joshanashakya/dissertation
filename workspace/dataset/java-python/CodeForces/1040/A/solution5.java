import java.util.*;   public class geek {     public static int gcd(int a, int b) {        if (b == 0) {            return a;        }        return gcd(b, a % b);    }    /*public static boolean prime(int x){        if(x==0||x==1){            return  false;        }        boolean b[]=new boolean[1000001];        Arrays.fill(b,true);        b[0]=false;        b[1]=false;        for(int i=2;i*i<=100000;i++){            if(b[i]){                for(int j=i*i;j<=100000;j+=i){                    b[j]=false;                }            }        }        if(b[x])return true;        return false;     }      */      public static void main(String[] args) {        try {            Scanner s = new Scanner(System.in);             int n=s.nextInt();            int x=s.nextInt();            int y=s.nextInt();            int min=Math.min(x,y);           int a[]=new int[n];          // int max=0;           for(int i=0;i<n;i++){               a[i]=s.nextInt();            }           int sum=0;                for (int i = 0; i <n/2;i++){                   if(a[i]!=2&&a[n-i-1]!=2&&a[i]!=a[n-i-1]){                       System.out.println("-1");                       System.exit(0);                   }else if(a[i]==2&&a[n-i-1]!=2){                       if(a[n-i-1]==1){                           sum+=y;                       }else if(a[n-i-1]==0){                           sum+=x;                       }                   }else if(a[i]!=2&&a[n-i-1]==2){                       if(a[i]==1){                           sum+=y;                       }else{                           sum+=x;                       }                   }else if(a[i]==2&&a[n-i-1]==2){                       sum+=2*min;                   }               }            if(n%2!=0){               if(a[(n/2)]==2) {                   sum += min;               }           }            System.out.println(sum);           }        catch (Exception e){            System.out.println(e.getMessage());        }    }}                         
