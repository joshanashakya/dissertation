import java.util.*;public class Codeforces {    private static void sport(int[] a, int h) {        boolean f=true;        for (int i = 1; i < a.length; i++) {            if (a[i-1]>1&&a[i]>1){                f=false;                break;            }        }        if (f){            System.out.println("perfect");            return;        }        System.out.println("ambiguous");        System.out.print("0 ");        LinkedList<Integer> queue  = new LinkedList<>();        queue.add(1);        for (int i = 1; i < a.length; i++) {            LinkedList<Integer> q = new LinkedList<>();            Integer poll = queue.removeLast();            for (int j = 0; j < a[i]; j++) {                System.out.print(poll+" ");                q.addLast(poll+j+1);            }            queue.clear();            queue.addAll(q);        }        System.out.println();        //////////////        System.out.print("0 ");        queue  = new LinkedList<>();        queue.add(1);        for (int i = 1; i < a.length; i++) {            LinkedList<Integer> q = new LinkedList<>();            if (queue.size()>1&&a[i]>1){                Integer poll = queue.removeLast();                Integer poll2 = queue.removeLast();                for (int j = 0; j < a[i] - 1; j++) {                    System.out.print(poll + " ");                    q.add(poll+j+1);                }                q.add(poll + a[i]-1+1);                System.out.print(poll2+" ");            } else {                Integer poll = queue.removeLast();                for (int j = 0; j < a[i]; j++) {                    System.out.print(poll + " ");                    q.add(poll+j+1);                }            }            queue.clear();            queue.addAll(q);        }        System.out.println();    }     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int h  = sc.nextInt();        int[] a = new int[h+1];        for (int i = 0; i < h+1; i++) {            a[i]=sc.nextInt();        }        sport(a,h);    }}
