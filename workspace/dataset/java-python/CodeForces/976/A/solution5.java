//I AM THE CREED/* //I AM THE CREED/* package codechef; // don't place package name! */import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer; import java.util.*;import java.awt.Point;public class Main{    static HashMap<Integer, Integer> log=new HashMap<>();    public static void main(String[] args) throws IOException     {           Scanner input = new Scanner(System.in);            while(input.hasNext()){            int n=input.nextInt();            String s=input.next();            int one=0;            int z=0;            for(int i=0;i<n;i++){                if(s.charAt(i)=='1'){                    one++;                    continue;                }                z++;            }            if(one==0){                System.out.println(s);                continue;            }            StringBuilder sb=new StringBuilder();                        one=1;            while(one>0 || z>0){                if(one!=0){                    sb.append("1");                    one--;                    continue;                }                sb.append("0");                z--;            }            System.out.println(sb.toString());        }    }  }