  import java.util.*;  public class Main {        public static void main(String[] args) {        Scanner input = new Scanner(System.in);       int n = input.nextInt();       if(n==1||n==2)       {           System.out.println(1);           System.out.println(1);       }       else if(n==3)       {           System.out.println(2);           System.out.println(1+" "+3);                  }       else if(n==4)       {           System.out.println(4);           System.out.println(3+" "+1+" "+4+" "+2);       }             else       {           int a[] = new int[n];           System.out.println(n);           int j=0;           int i;           for (i = 0; j <n; i++) {               a[j]=i+1;               j+=2;           }           i++;           j=1;           for (; j < n; i++) {               a[j]=i;               j+=2;           }           for (int k = 0; k < n; k++) {               System.out.print(a[k]+" ");           }           System.out.println("");                  }            }} 