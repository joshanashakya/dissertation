import java.util.Scanner; public class n25A {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        int e_index = 0;        int o_index = 0;        int a;        int flag = -1;        for (int i = 0; i < n; i++) {            a = scanner.nextInt();            if (a % 2 == 0)                if (e_index == 0)                    e_index = i + 1;                else                    flag = 1;            if (a % 2 == 1)                if (o_index == 0)                    o_index = i + 1;                else                    flag = 0;         }        if (flag == 1)            System.out.println(o_index);        else            System.out.println(e_index);    }}