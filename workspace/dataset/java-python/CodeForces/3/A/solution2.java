import java.util.Scanner; public class P3A {    private static int ans = 0;    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String s = sc.nextLine();        String d = sc.nextLine();        int n1 = s.charAt(0) - d.charAt(0);        int n2 = s.charAt(1) - d.charAt(1);        System.out.println(Math.max(Math.abs(n1), Math.abs(n2)));        while (n1 != 0 || n2 != 0) {            String path = "";            if(n1 > 0) {                path+="L";                n1--;            }            if(n1 < 0) {                path += "R";                n1++;            }            if(n2 > 0) {                path+="D";                n2--;            }            if(n2 < 0) {                path+="U";                n2++;            }            System.out.println(path);        }    }  }
