import java.io.*;import java.util.*; public class Prob645A{   public static void main(String[] args) throws Exception{      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      String[] l1 = br.readLine().split("");      String[] l2 = br.readLine().split("");      String[] l3 = br.readLine().split("");      String[] l4 = br.readLine().split("");      String s1 = "";      if(!l1[0].equals("X"))         s1 += l1[0];      if(!l1[1].equals("X"))         s1 += l1[1];      if(!l2[1].equals("X"))         s1 += l2[1];      if(!l2[0].equals("X"))         s1 += l2[0];      String s2 = "";      if(!l3[0].equals("X"))         s2 += l3[0];      if(!l3[1].equals("X"))         s2 += l3[1];      if(!l4[1].equals("X"))         s2 += l4[1];      if(!l4[0].equals("X"))         s2 += l4[0];      if((s1 + s1).contains(s2)) System.out.println("YES");      else System.out.println("NO");   }}
