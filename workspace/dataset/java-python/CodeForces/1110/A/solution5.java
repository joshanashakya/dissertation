import java.util.Scanner; public class Main {    public static void main(String[] args){        Scanner scan = new Scanner(System.in);        int b = scan.nextInt();        int k = scan.nextInt();        int[] a = new int[k];         for(int i=0;i<k;i++){            a[i] = scan.nextInt();        }        long sum =0;        for(int i=0;i<k;i++){            if(i==k-1){                sum+=a[i];            }else{            sum+=a[i]*b;            }        }        System.out.println(sum%2==0?"even":"odd");    }}