import java.util.*;public class secauc{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int n = sc.nextInt();        int arr[] = new int[n];        for(int i=0;i<n;i++)            arr[i] = sc.nextInt();            int max=-1;            int index = -1;                for(int i=0;i<n;i++)        {            if(arr[i]>max)            {                max = arr[i];                index = i;            }        }        Arrays.sort(arr);        System.out.println((index+1)+" "+arr[n-2]);    }}
