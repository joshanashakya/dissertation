import java.util.*; public class FoxAndDots {     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt(), x = sc.nextInt();        int[] a = new int[n], b = new int[n];        for (int i = 0; i<n; i++){            int l = sc.nextInt();            int q = sc.nextInt();            if (l>q){                int t = l;                l = q;                q = t;            }            a[i] = l;            b[i] = q;        }        int c = 0;        int l = a[0];        int r = b[0];        for (int i = 1; i<n; i++){             if (l>b[i] || r<a[i]){                System.out.println(-1);                System.exit(0);            }             l = Math.max(l, a[i]);            r = Math.min(r, b[i]);        }        if (x<l){            c = l-x;        } else if(x>r){            c = x-r;        }        System.out.println(c);    } }
