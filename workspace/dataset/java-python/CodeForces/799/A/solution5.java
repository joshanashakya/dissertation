import java.util.*;public class OPPJava {     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n=sc.nextInt(),t=sc.nextInt(),k=sc.nextInt(),d=sc.nextInt();        System.out.println((n-1)/k*t > d ? "YES":"NO");     } }