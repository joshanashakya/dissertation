import java.io.*;import java.util.*;import java.math.*; public class Main {         public static void main(String[] args) throws java.lang.Exception {         ///Reader pm =new Reader();         Scanner pm = new Scanner(new BufferedReader(new InputStreamReader(System.in)));        int n = pm.nextInt();    int ans = Integer.MIN_VALUE;      ArrayList<String> al = new ArrayList<>();for(int i=0;i<n;i++)    al.add(pm.next());      for(int i=0;i<n;i++) {         int cnt = 0;         for(int j=0;j<n;j++){            if(al.get(i).equals(al.get(j)))cnt++;}ans = Math.max(ans, cnt);}System.out.println(ans);  }}
