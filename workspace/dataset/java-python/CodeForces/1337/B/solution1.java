import java.util.*;public class Dragon_Quest{    public static void main(String args[])    {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        for(int i = 1; i <= t; i++)        {            int x = sc.nextInt();            int n = sc.nextInt();            int m = sc.nextInt();            while(x>= 20&& n >0)            {                x = (int)(x/2)+10;                n--;            }            if(x<=(10*m))                System.out.println("YES");            else                System.out.println("NO");        }    }}