import java.util.*;import java.math.*;import java.io.*;public class Solution{                public static void main(String[] args) throws Exception {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();                PrintWriter out = new PrintWriter(System.out);        LinkedList<Integer> l = new LinkedList<Integer>();        LinkedList<Integer> lp = new LinkedList<Integer>();        int[] min = new int[n];        Arrays.fill(min,(int)Math.pow(10,9));        LinkedList<Integer> first_question = new LinkedList<Integer>();        LinkedList<Integer> second_question = new LinkedList<Integer>();        l.add(n);        int[] a = new int[n];        int[] b = new int[n];        while(l.size()<n){            int ini = 0;            for(int i:l){                                lp.add(i/2);                lp.add(i-i/2);                if(i!=1){                    for(int j=ini+1;j<=ini+i;j++){                        if(j<=ini+i/2) second_question.add(j);                        else first_question.add(j);                    }                }                ini += i;                            }            out.println(first_question.size());            for(int i:first_question){                out.print(i+" ");            }            out.println("");            out.flush();            for(int i=0;i<n;i++){                a[i] = sc.nextInt();            }                        out.println(second_question.size());            for(int i:second_question){                out.print(i+" ");            }            out.println("");            out.flush();                        int mod = 1;            ini = 0;                        for(int i=0;i<n;i++){                b[i] = sc.nextInt();            }                        for(int i:lp){                if(mod%2==0) {                    for(int j=ini;j<ini+i;j++){                        a[j] = b[j];                    }                }                ini += i;                mod++;            }                        for(int i=0;i<n;i++){                min[i] = (int) Math.min(min[i],a[i]);            }                        l.clear();            for(int i:lp){                l.add(i);            }            lp.clear();            first_question.clear();            second_question.clear();                    }                out.println("-1");        for(int i=0;i<n;i++) out.print(min[i]+" ");        out.flush();            }    }
