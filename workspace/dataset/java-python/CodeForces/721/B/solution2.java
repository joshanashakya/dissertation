import java.util.Scanner; public class Problem374{    public static void main(String[] args)    {        Scanner sc = new Scanner(System.in);        String input = sc.nextLine();        String[] split = input.split(" ");        int n = Integer.parseInt(split[0]);        int k = Integer.parseInt(split[1]);        String[] ar = new String[n];        for (int i = 0; i < n; i++)        {            ar[i] = sc.next();        }        String pwd = sc.next();        int count = 0;        int grt = 0;        for (int i = 0; i < ar.length; i++)        {            if (pwd.length() > ar[i].length())            {                count++;            }            else if(pwd.length() < ar[i].length()) {                grt++;            }        }                int best = count + (count / k) * 5 + 1;        int worst = n >1 ?((n-grt-1) / k) * 5 +n-grt:1;        System.out.println(best+" "+ worst);    }    }
