 import java.util.*;  public class Main {        public static void main(String[] args){        Scanner input = new Scanner(System.in);       int n = input.nextInt();                ArrayList<Long> a= new ArrayList<>();        for (int i = 0; i < n; i++) {            a.add(input.nextLong());                                }        Collections.sort(a,Collections.reverseOrder());        if(a.get(0)>=(a.get(1)+a.get(2)))        {            System.out.println("NO");                    }        else        {            System.out.println("YES");            for (int i = 0; i < n; i++) {                if(i!=1)                    System.out.print(a.get(i)+" ");            }            System.out.println(a.get(1));        }                               }} 
