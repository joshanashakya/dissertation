import java.util.*;import java.io.*;public class MyClass {    public static void main(String args[]) {        try{            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));            int n = Integer.parseInt(br.readLine());            String s = br.readLine();            String str[] = br.readLine().split(" ");            int arr[] = new int[n];            for(int i=0;i<n;i++){                int v = Integer.parseInt(str[i]);                char ch = s.charAt(i);                if(ch == 'L'){                    arr[i] = -v;                }else if(ch == 'R'){                    arr[i] = v;                }            }            int min = Integer.MAX_VALUE;            for(int i=0;i<n-1;i++){                int v1 = arr[i];                int v2 = arr[i+1];                if((v1>0 && v2<0) || (v1==0 && s.charAt(i)=='R' && v2<0)){                    //System.out.println(v1+" "+v2);                    min = Math.min(min,Math.abs(v1+v2));                }            }            if(min != Integer.MAX_VALUE){                System.out.println(min/2);            }else{                System.out.println(-1);            }                    }catch(Exception e){            System.out.println(e);        }    }}
