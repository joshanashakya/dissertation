import java.util.Scanner; public class T112A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String first = sc.next();        String second = sc.next();        if(first.compareToIgnoreCase(second)==0) {            System.out.println("0");        } else if(first.compareToIgnoreCase(second)>0){            System.out.println("1");        } else {            System.out.println("-1");        }     }}