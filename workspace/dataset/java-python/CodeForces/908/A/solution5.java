import java.lang.*;import java.util.*;import java.io.*;public class test{      Scanner sc=new Scanner(System.in);  PrintWriter pr=new PrintWriter(System.out,true);  public static void main(String... args)   {       test c=new test();       c.prop();  }  public void prop()   {    String s=sc.next() ;    int n=s.length(),count=0,count2=0;      for (int i=0;i<n ;++i) {          char c=s.charAt(i) ;            if(c=='a'||c=='e' || c=='i' || c=='o' || c=='u' || c=='1' ||  c=='3'|| c=='5'|| c=='7'|| c=='9')                 ++count ;                                         }        pr.println(count);   } }