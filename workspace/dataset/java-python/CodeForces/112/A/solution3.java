import java.util.*;public class Solution{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        String first=sc.next().toLowerCase();        String second=sc.next().toLowerCase();        int c1=0,c2=0;        if(first.compareTo(second) ==0){            System.out.println("0");        }        if(first.compareTo(second) > 0){            System.out.println("1");        }        if(first.compareTo(second) < 0){            System.out.println("-1");                   }    }}