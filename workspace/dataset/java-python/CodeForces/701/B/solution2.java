import java.util.*;public class test{    public static void main(String[] args){    Scanner sc = new Scanner(System.in);    long n = sc.nextLong();    long rook = sc.nextLong();    Set<Long> rows = new HashSet<Long>();    Set<Long> cols = new HashSet<Long>();    //int[][] arr = new int[n][n];    long sum = n*n;    for(int i=0; i<rook; i++){        long row = sc.nextLong();        long col = sc.nextLong();        if(!rows.contains(row)){            rows.add(row);            sum = sum - n + cols.size();        }        if(!cols.contains(col)){            cols.add(col);            sum = sum - n + rows.size();        }        System.out.print(sum+" ");    }    }}