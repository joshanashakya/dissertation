import java.util.Scanner; public class B978 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt(), a = 0, res = 0;        String file = scanner.next();        for (int i = 0; i < n; i++) {            if (file.charAt(i) == 'x') {                a++;                if (a > 2) {                    res++;                }            }            else {                a = 0;            }        }        System.out.println(res);    }}
