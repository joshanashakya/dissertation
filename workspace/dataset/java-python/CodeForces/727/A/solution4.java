 import javax.swing.table.AbstractTableModel;import java.io.*;import java.net.Inet4Address;import java.util.*;import java.util.concurrent.atomic.AtomicReferenceFieldUpdater; //_________________________________________________________________public class Main {      public static void main(String[] args) {        //code        Scanner sc = new Scanner(System.in);//        int t = sc.nextInt();//        while (t-- >= 1) {            int a=sc.nextInt(),b=sc.nextInt();            if (a>b){                System.out.println("NO");             }            else{                ArrayList<Integer> list = new ArrayList<>();                list.add(b);                while (b!=a&&b>a){                    if (b%2==0){                        b/=2;                        list.add(b);                    }                    else if (b%10==1){                        b/=10;                        list.add(b);                    }                    else break;                }                if (a==b){                    System.out.println("YES\n"+list.size());                    Collections.reverse(list);                    for (int i:list){                        System.out.print(i+" ");                    }                 }                else System.out.println("NO");        }    }}