import java.io.BufferedReader;import java.io.File;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.concurrent.ConcurrentMap; public class Watermelon {    static int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};    public static void main(String[] args) throws java.lang.Exception {      Scanner sc = new Scanner(new File("input.txt"));        PrintWriter pw=new PrintWriter("output.txt");//        System.out.println(Arrays.toString(month));        for (int i = 1; i <= 12; i++) month[i] += month[i - 1];//        System.out.println(Arrays.toString(month));        int[] year = new int[466];        int n = sc.nextInt();        int m = -1, d = -1, p = -1, t = -1, temp = -1, day = -1, yeart = -1;//        System.out.println(month+" "+Arrays.toString(month));        for (int i = 0; i < n; i++) {            m = sc.nextInt();            d = sc.nextInt();            p = sc.nextInt();            t = sc.nextInt();            day = month[m - 1] + d + 100;            while (t-- > 0) year[day - t] += p;        }//        System.out.println(Arrays.toString(year));        int ans = -1;        for (int i = 0; i < 466; i++)            ans = Math.max(ans, year[i]);         pw.print(ans);        pw.close();        sc.close();    }}