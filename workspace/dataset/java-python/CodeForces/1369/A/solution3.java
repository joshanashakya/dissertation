import java.util.Scanner; public class FashionableLee {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int test = sc.nextInt();        for (int i = 0; i < test; i++) {            long side = sc.nextInt();            if (side % 4 == 0) {                System.out.println("YES");            } else {                System.out.println("NO");            }        }    }}
