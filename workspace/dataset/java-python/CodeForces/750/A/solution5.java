 import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int n=in.nextInt();        int k=in.nextInt();        int time_remaining=(4*60)-k;         int sum=0;        int i=0;        while(sum<=time_remaining && (i)<=n){            i++;            sum+=i*5;        }        System.out.println(i-1);    }//End Main}//End Class