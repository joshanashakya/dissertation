import java.util.*;public class Main{		 public static void main(String args[])    {        Scanner in  = new Scanner(System.in);        String s = in.next();        int c4=0 , c7=0;        for(int i=0 ; i<s.length() ; i++)        {            if(s.charAt(i)=='4') c4++;            else if(s.charAt(i)=='7') c7++;        }        if(c4==0&&c7==0) System.out.println("-1");        else if(c7>c4) System.out.println("7");        else System.out.println("4");    }}