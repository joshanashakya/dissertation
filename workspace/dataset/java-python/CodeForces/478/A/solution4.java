import java.util.Scanner; public class Main {     public static void main(String[] args) {         Scanner sc=new Scanner(System.in);        int c[]=new int[5];        for(int i = 0 ; i < 5 ; i++) {            c[i]=sc.nextInt();        }        int sum=0;        for(int x:c) {            sum+=x;        }        if(sum % 5 != 0 || sum == 0) {            System.out.println(-1);        }        else {            System.out.println( sum / 5);        }    } }
