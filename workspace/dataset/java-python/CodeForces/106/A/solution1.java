import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Scanner;import java.util.StringTokenizer;public class Main{static class FastReader{BufferedReader br;StringTokenizer st;public FastReader(){br = new BufferedReader(newInputStreamReader(System.in));}String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException e){e.printStackTrace();}}return st.nextToken();}int nextInt(){return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str = "";try{str = br.readLine();}catch (IOException e){e.printStackTrace();}return str;}}  public static void main(String[] args){FastReader fs=new FastReader();// int t = fs.nextInt(); String prior = new String("6789TJQKA");String trump = fs.nextLine();String[] s = fs.nextLine().split(" "); if(s[0].contains(trump) && !s[1].contains(trump)){    System.out.println("YES");}else if(s[0].charAt(1) == s[1].charAt(1)){    int c1 = prior.indexOf(s[0].charAt(0));    int c2 = prior.indexOf(s[1].charAt(0));    if(c1>c2)    {        System.out.println("YES");    }    else    {        System.out.println("NO");    }}else{    System.out.println("NO");} }} 