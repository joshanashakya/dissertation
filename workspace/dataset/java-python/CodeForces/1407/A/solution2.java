import java.util.Scanner; public class B {    public static void main(String[] args) {        Scanner in=new Scanner(System.in);        int n=in.nextInt();        while (n-->0){            int ind=in.nextInt(),z=0;            for (int i = 0; i < ind; i++) {                int bh=in.nextInt();                if (bh==0){                    z++;                }            }            if (z>=(ind/2)){                println(ind/2);                for (int i = 1; i <=ind/2; i++) {                    print('0'+" ");                }            }else{                if ((ind/2)%2==0){                    println(ind/2);                    for (int i = 0; i < (ind/2); i++) {                        print('1'+" ");                    }                }else {                    println(ind/2+1);                    for (int i = 0; i <(ind/2)+1; i++) {                        print('1'+" ");                    }                }            }            println();        }    }    static void print(Object o) { System.out.print(o); }    static void println(Object o) { print(o);println(); }    static void println(){print('\n');}}