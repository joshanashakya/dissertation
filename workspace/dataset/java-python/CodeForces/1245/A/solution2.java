import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int t = s.nextInt();        while(t-- != 0){            int g = gcd(s.nextInt(),s.nextInt());            if(g > 1){                System.out.println("Infinite");            }            else{                System.out.println("Finite");            }        }    }    public static int gcd(int a,int b){        if(b == 0){            return a;        }        return gcd(b,a % b);    }}