import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String s;        int x=0, n,flag;        n = scanner.nextInt();        s = scanner.next();        while (s.contains("xxx")) {            s=s.replaceFirst("xxx","xx");            x++;        }        System.out.println(x);    }}
