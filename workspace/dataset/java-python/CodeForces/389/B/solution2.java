import java.util.*;public class Main {    public static void main(String []args) {        Scanner sc = new Scanner(System.in);        int n = Integer.parseInt(sc.next());        char[][] c = new char[n][n];        for(int i = 0; i < n; i++)            c[i] = sc.next().toCharArray();                for(int i = 1; i < n - 1; i++) {            for(int j = 1; j < n - 1; j++) {                if(c[i][j] == '#' && c[i - 1][j] == '#' && c[i + 1][j] == '#' && c[i][j + 1] == '#' && c[i][j - 1] == '#') {                    c[i][j] = c[i - 1][j] = c[i + 1][j] = c[i][j - 1] = c[i][j + 1] = '.';                }            }        }                for(int i = 0; i < n; i++) {            for(int j = 0; j < n; j++) {                if(c[i][j] == '#') {                    System.out.println("NO");                    return;                }            }        }                System.out.println("YES");    }}