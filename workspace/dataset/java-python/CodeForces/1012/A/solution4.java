//I AM THE CREED/* //I AM THE CREED/* package codechef; // don't place package name! */import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer; import java.util.*;import java.awt.Point;public class Main{    public static void main(String[] args) throws IOException     {         Scanner input = new Scanner(System.in);        while(input.hasNext()){            int n=input.nextInt();            Long[] l=new Long[2*n];            for(int i=0;i<2*n;i++){                l[i]=input.nextLong();            }            Arrays.sort(l);            long min=Long.MAX_VALUE;            for(int i=n-1;i<2*n-1;i++){                min=Math.min(min, (l[i]-l[i-(n-1)])*(l[2*n-1]-(i==n-1?l[n]:l[0])));            }            System.out.println(min);        }    }}
