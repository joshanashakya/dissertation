import java.util.*;import java.io.*;public class Main {     public static void main(String[] args) throws IOException     {         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int n=Integer.parseInt(br.readLine());         String str=br.readLine();         int lastvacant=-1;         int[] ans=new int[10];         // left=0,right=9;         for(int i=0;i<str.length();i++)         {             char ch=str.charAt(i);             if(ch=='L')             {                 for(int j=0;j<10;j++)                 {                     if(ans[j]==0)                     {                         ans[j]=1;                         break;                     }                 }             }             else if(ch=='R')             {                 for(int j=9;j>=0;j--)                 {                     if(ans[j]==0)                     {                         ans[j]=1;                         break;                     }                 }             }             else             {                 ans[ch-'0']=0;             }         }         for(int i:ans)         {             System.out.print(i);         }              } }
