import java.util.Scanner; public class HelloWorld {     public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int[] yrs=new int[n-1];        for(int i=0;i<n-1;i++)        {            yrs[i]=sc.nextInt();        }        int a=sc.nextInt();        int b=sc.nextInt();        int sum=0;        for(int i=a-1;i<b-1;i++)        {            sum+=yrs[i];        }        System.out.println(sum);    } }