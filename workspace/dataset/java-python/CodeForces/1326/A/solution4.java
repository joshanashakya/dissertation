import java.util.Scanner; public class task2 {    static Scanner scanner=new Scanner(System.in);     public static void main(String[] args) {        long a = scanner.nextInt();        for (int i = 0; i < a; i++) {           long num=scanner.nextInt();            for (long j = 0; j < num; j++) {             if (num>1){                 if (j==0) System.out.print(2);                 else System.out.print(3);             }else System.out.print(-1);            }            System.out.println();        }     }}
