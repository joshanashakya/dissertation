import java.util.Scanner; public class MyClass {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        String N =  in.nextLine();        String newN = N;        System.out.print(N);        for(int i = N.length()-1; i >= 0 ; i--) {            System.out.print(N.charAt(i));        }    }}