import java.util.Scanner; public class Drinks {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        double answear=0;        for (int i = 0; i <n ; i++) {            answear+=sc.nextInt();        } System.out.println(answear/n);    }}