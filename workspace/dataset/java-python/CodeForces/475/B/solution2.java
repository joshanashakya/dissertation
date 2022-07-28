import java.util.*;import java.io.*;import java.lang.*;  public class febchal {    static int mod=10000_00007;     // Here is an explanation for such short solution:     // If outer streets (top, bottom, rightmost and leftmost) form a cycle (clockwise or counter-clockwise), then        // by following that cycle, one can reach any junction on that cycle from any other junction on the same cycle.    // moreover, independent of the directions of inner streets you can also reach all "inner" junctions from     //any "outer" junction. Therefore, if the outer streets form a cycle, then the answer is "YES".    // If outer streets do not form a cycle, then        // there is at least one "corner" junction, for which both horizontal and vertical streets have directions    // towards that junction (otherwise, there it would be a cycle). Since one can not move out from     //such "corner" junction to anywhere else, the answer is "NO"    public static void main(String[] args) throws Exception{        InputStreamReader ip=new InputStreamReader(System.in);        BufferedReader br = new BufferedReader(ip);		// int t = Integer.parseInt(br.readLine());		// StringBuilder sb = new StringBuilder();        // SOE(1000_000);        // while(t-->0){            // int n = Integer.parseInt(br.readLine());            // String[] str=(br.readLine()).trim().split(" ");            String[] pr=(br.readLine()).trim().split(" ");            int x=Integer.parseInt(pr[0]);            int y=Integer.parseInt(pr[1]);              String str1=(br.readLine());            String str2=(br.readLine());                        if(str1.charAt(0)=='>' && str1.charAt(x-1)=='<' && str2.charAt(0)=='^' && str2.charAt(y-1)=='v'){                System.out.println("YES");            }else if(str1.charAt(0)=='<' && str1.charAt(x-1)=='>' && str2.charAt(0)=='v' && str2.charAt(y-1)=='^'){                System.out.println("YES");            }else{                System.out.println("NO");            }        // }    }}
