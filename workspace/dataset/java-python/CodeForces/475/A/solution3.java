import java.util.*;import java.lang.*;import java.io.*; public class bayanBus {        public static void main (String[] args) throws IOException {		InputStreamReader ir = new  InputStreamReader(System.in);        BufferedReader br = new BufferedReader(ir);                             String[] line1 = br.readLine().split(" ");            int k = Integer.parseInt(line1[0]);                                    System.out.print('+');            for(int i = 1;i<=24;i++)            System.out.print('-');            System.out.print('+');            System.out.println();                                     System.out.print('|');            if(k>0)            System.out.print('O');            else            System.out.print('#');                            int c;             c= (k-2)/3;             for(int i = 1;i<=20;i++)           {               if(i%2!=0)               System.out.print('.');               else               {                   if(c>0)                   {                       System.out.print('O');                       c--;                    }                    else                    System.out.print('#');                }            }                       System.out.println(".|D|)");                                               System.out.print('|');            if(k>1){            System.out.print('O');        }         else            System.out.print('#');                           c= (k-3)/3;             for(int i = 1;i<=20;i++)           {               if(i%2!=0)               System.out.print('.');               else               {                   if(c>0)                   {                       System.out.print('O');                       c--;                    }                    else                    System.out.print('#');                }            }                       System.out.println(".|.|");                      System.out.print('|');            if(k>2){            System.out.print('O');        }         else            System.out.print('#');                                   for(int i = 1;i<=20;i++)           System.out.print('.');                                 System.out.println("...|");                                 System.out.print('|');            if(k>3){            System.out.print('O');        }         else            System.out.print('#');                           c= (k-4)/3;             for(int i = 1;i<=20;i++)           {               if(i%2!=0)               System.out.print('.');               else               {                   if(c>0)                   {                       System.out.print('O');                       c--;                    }                    else                    System.out.print('#');                }            }                      System.out.println(".|.|)");                                                      System.out.print('+');            for(int i = 1;i<=24;i++)            System.out.print('-');            System.out.print('+');            System.out.println();                    }}        