import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String str = sc.next();         boolean findAB = false;        boolean findBA = false;        for (int i=0;i<str.length()-1;i++) {            if (!findAB && str.substring(i,i+2).contains("AB")) {                findAB = true;                i++;                continue;            }            if (!findBA && str.substring(i,i+2).contains("BA")) {                findBA = true;                i++;            }        }         boolean findAB2 = false;        boolean findBA2 = false;        for (int i=str.length()-2;i>=0;i--) {            if (!findAB2 && str.substring(i,i+2).contains("AB")) {                findAB2 = true;                i--;                continue;            }            if (!findBA2 && str.substring(i,i+2).contains("BA")) {                findBA2 = true;                i--;            }        }        System.out.println(findAB&&findBA || findAB2&&findBA2?"YES":"NO");    }}
