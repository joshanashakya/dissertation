import java.lang.*;import java.util.*; public class Main {     public static void main(String[] args) throws Exception {        Scanner sc = new Scanner(System.in);        char[] a = sc.nextLine().toCharArray();        char s=a[0];        for(int i=0;i<a.length;i++){            if(s<a[i])                s=a[i];        }        int count=0;        for(int i =0;i<a.length;i++){            if(a[i]==s){                count++;            }        }        for(int i =0;i<count;i++)            System.out.print(s);     }}