import java.util.*; //_________________________________________________________________public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);//        int t=sc.nextInt();//        while (t-->=1){////        }        int n=sc.nextInt();        int a[]= new int[n];        for (int i=0;i<n;i++){            a[i]=sc.nextInt();        }        int x=0;        for (int i=0;i<n-1;i++){            a[i]=a[i]-x;            if (a[i]%2==0){                x=0;            }            else if (a[i]<0){                System.out.println("NO");                return;            }            else x=1;        }        a[n-1]=a[n-1]-x;        if (a[n-1]%2==1||a[n-1]%2<0){            System.out.println("NO");        }        else System.out.println("YES");     }}
