import java.util.*;public class problem{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int x=sc.nextInt();        if(x%4==1)        {            System.out.println("0"+" A");        }        else if(x%4==3)        {            System.out.println("2"+" A");                    }        else if(x%4==2)        {             System.out.println("1"+" B");                    }        else        {            System.out.println("1"+" A");        }    }}