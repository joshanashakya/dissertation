import java.util.*;import java.lang.*;public class Main{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int t=sc.nextInt();        String ar[]=new String[t];        ArrayList<String> l=new ArrayList<>();        for(int p=0;p<t;p++)        {            ar[p]=sc.next();            if(l.contains(ar[p])==false)            {                l.add(ar[p]);                System.out.println("NO");            }            else            {                l.add(ar[p]);                System.out.println("YES");                            }        }    }}
