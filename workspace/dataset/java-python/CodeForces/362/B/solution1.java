import java.util.*;public class PetyaandStaircases {    public static void main(String arg[]){        Scanner sc = new Scanner(System.in);        long n = sc.nextInt();        int m = sc.nextInt();        int flag=0;        long[] ar = new long[m];        for(int i = 0; i<m; i++){            ar[i] = sc.nextLong();            if(ar[i]==1 || ar[i]==n)                flag = 1;        }         if(flag == 1){            System.out.println("NO");            System.exit(0);        }        Arrays.sort(ar);         int count=1;        for(int i =1; i<m; i++){            if(ar[i]-ar[i-1]==1)                count++;            else                count=1;             if(count==3)            {                System.out.println("NO");                System.exit(0);            }        }           System.out.println("YES");           }     } 