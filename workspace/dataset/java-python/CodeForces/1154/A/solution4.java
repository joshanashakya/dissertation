import java.util.*;public class Solution{    public static void main(String[] args)    {        Scanner sc = new Scanner(System.in);        int a[] = new int[4];        for(int i=0;i<4;i++)        {            a[i] = sc.nextInt();        }        int max = a[0];        for(int i=0;i<4;i++)        {            if(a[i]>max)            {                max = a[i];            }        }        for(int i=0;i<4;i++)        {            if(max-a[i]!=0)            {                System.out.println(max-a[i]+" ");            }        }                                 }}
