/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;// import java.math.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Main{        public static ArrayList<Integer> a=new ArrayList<>();    public static void main (String[] args) throws java.lang.Exception	{        // your code goes here		try{            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            PrintWriter ot=new PrintWriter(System.out);            int t=1;//Integer.parseInt(br.readLine().trim());            // int total=0;            while(t-->0)            {                String ss[]=br.readLine().trim().split(" ");                int n=Integer.parseInt(ss[0]);                int m=Integer.parseInt(ss[1]);                                 ArrayList<Integer> a=new ArrayList<>();                for(int i=0;i<n;i++)                a.add(0);                for(int i=0;i<m;i++)                {                    String s[]=br.readLine().trim().split(" ");                    int max=-1;                    int ind=-1;                    for(int j=0;j<n;j++)                    {                        int temp=Integer.parseInt(s[j]);                        if(temp>max)                        {                            max=temp;                            ind=j;                        }                    }                                       a.set(ind, a.get(ind)+1);                }                ot.println(a.indexOf(Collections.max(a))+1);                // ot.println(find(a,n,m));                           }            ot.close();            br.close();                    } catch(Exception e){            e.printStackTrace();            return;        }    }    // public static int find(int a[][],int n,int m){    //     int temp[]=new int[n];    //     // for(int i=0;i<n;i++)    //     // {    //     //     return 0;    //     // }    //     return 0;    // }}
