import java.util.Scanner; public class code {    public static void main(String[] args){        Scanner scan = new Scanner(System.in);        int n = scan.nextInt();        int m = scan.nextInt();        int count = 0;        while(m>n){            if(m%2!=0){                m++;                count++;            }            m /= 2;            count++;        }         System.out.println(count + n - m);    }  }