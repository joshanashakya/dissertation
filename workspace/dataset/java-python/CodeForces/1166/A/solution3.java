import java.util.*;import java.io.*;public class Solution{    public static void main(String[] args) throws IOException    {        //Scanner sc=new Scanner(System.in);        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        int n=Integer.parseInt(br.readLine());        //sc.nextLine();        String[] names=new String[n];        int[] freq=new int[26];        for(int i=0;i<n;i++)        {            names[i]=br.readLine();            char ch=names[i].charAt(0);            freq[ch-'a']++;        }        int min_pairs=0;        for(int i=0;i<26;i++)        {            int a=freq[i]/2;            int b=freq[i]-a;            min_pairs+=(a*(a-1)/2);            min_pairs+=(b*(b-1)/2);        }        System.out.println(min_pairs);    }}