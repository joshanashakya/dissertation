import java.io.*;import java.util.Scanner;import java.util.Arrays;public class Solution {     public static void main(String[] args)    {                Scanner in=new Scanner(System.in);        int h =in.nextInt();        int w =in.nextInt();        int x =in.nextInt();        int c=0;        if(x==1)        {             c=c+(h*2+w*2);             c=c-4;        }        else if(x>1)        {            for(int i=1;i<=x;i++)            {                c=c+(h*2+w*2);                c=c-4;                h=h-4;                w=w-4;            }        }        System.out.println(c);    }}