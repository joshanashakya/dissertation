import java.util.*; public class Main {     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);       int n=scanner.nextInt();        int k=scanner.nextInt();       int[] a=new int[n];       int ans=0;       for(int i=0;i<n;i++){           a[i]=scanner.nextInt();           String s = Integer.toString(a[i]);           int cnt=0;           for(int j=0;j<s.length();j++){               if(s.charAt(j)=='4' || s.charAt(j)=='7'){                   cnt++;               }           }           if(cnt<=k)               ans++;       }        System.out.println(ans);  }}
