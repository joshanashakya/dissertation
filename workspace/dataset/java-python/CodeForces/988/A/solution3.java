import java.util.ArrayList;import java.util.HashSet;import java.util.Scanner;import java.util.Set; /** * * @author dell */public class DiverseTeam {    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int k=sc.nextInt();        int[] arr=new int[n];        ArrayList<Integer> a=new ArrayList<>();        int count=0;        Set<Integer> set=new HashSet<>();        for(int i=0;i<n;i++)        {            arr[i]=sc.nextInt();          if(!set.contains(arr[i]))          {              set.add(arr[i]);             a.add(i);          }        }        int[] arr1 = a.stream().mapToInt(i -> i).toArray();         if(set.size()>=k)        {            System.out.println("YES");            for(int i=0;i<k;i++)            {                System.out.print(arr1[i]+1+" ");            }        }        else{            System.out.println("NO");        }            }}
