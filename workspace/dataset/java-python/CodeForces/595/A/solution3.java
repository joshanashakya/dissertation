import java.util.Scanner; public class LightOnNight {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);         int n = scan.nextInt()*scan.nextInt();        int count = 0;         for(int i=0;i<n;i++){            int sum = scan.nextInt() + scan.nextInt();             if(sum > 0) count++;        }        System.out.println(count);    }}
